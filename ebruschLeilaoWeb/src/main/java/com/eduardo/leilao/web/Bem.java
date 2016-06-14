package com.eduardo.leilao.web;

public class Bem {

	private String descricaoBreve;
	private String descricaoCompleta;
	private String categoria;
	private String ID;

	public Bem(String descrBreve, String descrCompleta, String categoria){

		this.descricaoBreve = descrBreve;
		this.descricaoCompleta = descrCompleta;
		this.categoria = categoria;

		ID = "0";
	}

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

	public String getID(){
		return ID;
	}


}
