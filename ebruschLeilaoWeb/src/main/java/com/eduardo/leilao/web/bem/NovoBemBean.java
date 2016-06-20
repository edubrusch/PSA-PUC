package com.eduardo.leilao.web.bem;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import com.eduardo.leilao.entities.Bem;


@ManagedBean(name = "novoBemBean", eager = true)
public class NovoBemBean {

	private String descricaoBreve;
	private String descricaoCompleta;
	private String categoria;


	public String getDescricaoBreve() {
		return descricaoBreve;
	}
	public void setDescricaoBreve(String descricaoBreve) {
		this.descricaoBreve = descricaoBreve;
	}
	public String getDescricaoCompleta() {
		return descricaoCompleta;
	}
	public void setDescricaoCompleta(String descricaoCompleta) {
		this.descricaoCompleta = descricaoCompleta;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public String acaoNovoBem() {
        try {
            Bem newBem = new Bem(descricaoBreve, descricaoCompleta, categoria);
            String msg = null;
            if (newBem != null) {
                msg = "Bem material Inserido com sucesso.";
            } else {
                msg = "Bem material não foi inserido!";
            }
            FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, msg,"");
            FacesContext.getCurrentInstance().addMessage("mensagens", facesMsg);
        } catch (Exception e) {
            FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), e.getCause().getMessage());
            FacesContext.getCurrentInstance().addMessage(null, facesMsg);
        }
        return "";
    }




}


/*

  <h:outputText value="descrição breve" /><br/>
		<h:inputText></h:inputText><br/>

		<h:outputText value="descrição completa" /><br/>
		<h:inputText></h:inputText><br/>

		<h:outputText value="Categoria" /><br/>

 */
