package com.eduardo.leilao.web.leilao;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import com.eduardo.leilao.ejb.dao.LeilaoDAO;
import com.eduardo.leilao.ejb.dao.UsuariosDAO;
import com.eduardo.leilao.entities.Leilao;
import com.eduardo.leilao.entities.Usuario;

@ManagedBean(name = "novoLeilaoBean", eager = true)
public class NovoLeilaoBean {

	@EJB(beanName="leilaoDao")
	private LeilaoDAO leiloes;	
	
	@EJB(beanName="userDao")
	private UsuariosDAO usuarios;
	
	private String msg = "Erro ao inserir leilao: ";

	private String idenificacaoVenddor;
	private String visibilidade;
	private String dataInicial;
	private String horaInicial;
	private String dataFinal;
	private String horaFinal;
	private double precoInicial;


	public String getIdenificacaoVenddor() {
		return idenificacaoVenddor;
	}

	public void setIdenificacaoVenddor(String idenificacaoVenddor) {
		this.idenificacaoVenddor = idenificacaoVenddor;
	}

	public String getVisibilidade() {
		return visibilidade;
	}

	public void setVisibilidade(String visibilidade) {
		this.visibilidade = visibilidade;
	}

	public String getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(String dataInicial) {
		this.dataInicial = dataInicial;
	}

	public String getHoraInicial() {
		return horaInicial;
	}

	public void setHoraInicial(String horaInicial) {
		this.horaInicial = horaInicial;
	}

	public String getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}

	public String getHoraFinal() {
		return horaFinal;
	}

	public void setHoraFinal(String horaFinal) {
		this.horaFinal = horaFinal;
	}

	public double getPrecoInicial() {
		return precoInicial;
	}

	public void setPrecoInicial(double precoInicial) {
		this.precoInicial = precoInicial;
	}



	public String acaoNovoLeilao() {		
        try {        	
        	Leilao l = new Leilao();
        	l.setDataInicial(dataInicial);        	
        	l.setDataFinal(dataFinal);        	
        	l.setHoraInicial(horaInicial);        	
        	l.setHoraFinal(horaInicial);        	
        	l.setPrecoInicial(precoInicial);        	
        	l.setVisibilidade(visibilidade);        	
        	
        	Usuario user = usuarios.buscarPorIdentificacao(idenificacaoVenddor);
        	if(user==null){
        		msg = "usuario nulo";
        	}
        	l.setIdenificacaoVenddor(user);        	
            leiloes.inserir(l);            
            msg = "Leilao Inserido com sucesso.";
            FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_INFO, msg,"");
            FacesContext.getCurrentInstance().addMessage("mensagens", facesMsg);
        } catch (Exception e) {
            FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_ERROR, (msg+"\n\n"+e.getMessage()), e.getCause().getMessage());
        	
            FacesContext.getCurrentInstance().addMessage(null, facesMsg);
        }
        return "";
    }

}
