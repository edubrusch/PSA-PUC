package com.eduardo.leilao.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
    @NamedQuery(name = "usuario.findAll", query = "SELECT usuario FROM Usuario usuario"),
    @NamedQuery(name = "usuario.findByIdentificacao", query = "SELECT u FROM Usuario u WHERE u.identificacao = :identificacao"),
    @NamedQuery(name = "usuario.findByNome", query = "SELECT u FROM Usuario u WHERE u.nome = :nome"),
    @NamedQuery(name = "usuario.findById", query = "SELECT u FROM Usuario u WHERE u.ID = :ID")})
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private String identificacao;

	@Column(nullable = false)
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

	public int getID(){
		return ID;
	}

	public void setID(int id){
		this.ID = id;
	}


}
/*: nome, cpf ou cnpj e endereço de e-mail. */