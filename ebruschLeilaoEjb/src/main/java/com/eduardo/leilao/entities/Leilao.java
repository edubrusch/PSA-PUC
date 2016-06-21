package com.eduardo.leilao.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;

@Entity
@NamedQueries({
    @NamedQuery(name = "leilao.findAll", query = "SELECT leilao FROM Leilao leilao")})
public class Leilao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String ID;

	@ManyToOne
	private Usuario idenificacaoVenddor;

	@NotNull
	private String visibilidade;

	@NotNull
	private String dataInicial;

	@NotNull
	private String horaInicial;

	@NotNull
	private String dataFinal;

	@NotNull
	private String horaFinal;

	@NotNull
	private double precoInicial;


	public Usuario getIdenificacaoVenddor() {
		return idenificacaoVenddor;
	}

	public void setIdenificacaoVenddor(Usuario idenificacaoVenddor) {
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

	public String getID() {
		return ID;
	}


}
