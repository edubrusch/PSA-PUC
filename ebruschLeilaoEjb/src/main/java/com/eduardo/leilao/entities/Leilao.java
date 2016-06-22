package com.eduardo.leilao.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({	
    @NamedQuery(name = "leilao.findAll", query = "SELECT leilao FROM Leilao leilao")})
public class Leilao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;

	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "identificacao", nullable = false)
	private Usuario idenificacaoVendedor;

	@Column
	private String visibilidade;

	@Column
	private String dataInicial;

	@Column
	private String horaInicial;

	@Column
	private String dataFinal;

	@Column
	private String horaFinal;

	@Column
	private double precoInicial;


	public String getIdenificacaoVenddor() {
		return idenificacaoVendedor.getIdentificacao();
		
//		return idenificacaoVendedor;
	}

	public void setIdenificacaoVenddor(Usuario idenificacaoVenddor) {
		this.idenificacaoVendedor = idenificacaoVenddor;
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

	public int getID() {
		return ID;
	}
	
	public void setID( int ID) {
		this.ID = ID;
	}


}
