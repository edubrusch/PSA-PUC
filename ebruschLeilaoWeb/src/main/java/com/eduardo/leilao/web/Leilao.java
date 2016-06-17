package com.eduardo.leilao.web;

public class Leilao {

	private String idenificacaoVenddor;
	private String visibilidade;
	private String dataInicial;
	private String horaInicial;
	private String dataFinal;
	private String horaFinal;
	private double precoInicial;
	private String ID;

	public Leilao(String idenificacaoVenddor, String visibilidade, String dataInicial, String horaInicial, String dataFinal, String horaFinal, double precoInicial){

		this.idenificacaoVenddor = idenificacaoVenddor;
		this.visibilidade = visibilidade;
		this.dataInicial = dataInicial;
		this.horaInicial = horaInicial;
		this.dataFinal = dataFinal;
		this.horaFinal = horaFinal;
		this.precoInicial = precoInicial;

		this.ID = "0";
	}

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

	public String getID() {
		return ID;
	}


}
