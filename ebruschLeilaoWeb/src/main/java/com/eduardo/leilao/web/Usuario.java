package com.eduardo.leilao.web;

public class Usuario {

	private String nome;
	private String identificacao;
	private String email;
	private String ID;

	public Usuario(String name, String ident, String mail){

		this.nome = name;
		this.identificacao = ident;
		this.email = mail;

		this.ID = "0";
	}

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

	public String getID(){
		return ID;
	}




}
/*: nome, cpf ou cnpj e endereço de e-mail. */