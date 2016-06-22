package com.eduardo.leilao.web.usuario;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import com.eduardo.leilao.ejb.dao.UsuariosDAO;
import com.eduardo.leilao.entities.Usuario;

@ManagedBean(name = "novoUsuarioBean", eager = true)
public class NovoUsuarioBean {
	
	@EJB(beanName="userDao")
	private UsuariosDAO dao;
	
	private String nome;	
	private String identificacao;	
	private String email;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String acaoNovoUsuario() {
        try {
        	Usuario u = new Usuario();
        	u.setEmail(email);
        	u.setIdentificacao(identificacao);
        	u.setNome(nome);
        	dao.inserir(u);
        	
            String msg = "Bem material Inserido com sucesso.";
            FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, msg,"");
            FacesContext.getCurrentInstance().addMessage("mensagens", facesMsg);
        } catch (Exception e) {
            FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), e.getCause().getMessage());
            FacesContext.getCurrentInstance().addMessage(null, facesMsg);
        }
        return "";
    }

}
