package com.eduardo.leilao.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIOS")
@NamedQueries({
    @NamedQuery(name = "usuario.findAll", query = "SELECT usuario FROM Usuario usuario"),
    @NamedQuery(name = "usuario.findByIdentificacao", query = "SELECT u FROM USUARIOS u WHERE u.identificacao = :identificacao"),
    @NamedQuery(name = "usuario.findByNome", query = "SELECT u FROM USUARIOS u WHERE u.nome = :nome"),
    @NamedQuery(name = "usuario.findById", query = "SELECT u FROM USUARIOS u WHERE u.codigo_usuario = :codigo_usuario")})
public class Usuario {

	private int ID;
	private String nome;
	private String identificacao;
	private String email;


	public Usuario(String name, String ident, String mail){

		this.nome = name;
		this.identificacao = ident;
		this.email = mail;
	}

	@Column(name="nome")
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name="identificacao")
	public String getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}

	@Column(name="email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Id
	@Column(name="codigo_usuario")
	public int getID(){
		return ID;
	}

	public void setID(int id){
		this.ID = id;
	}




}
/*: nome, cpf ou cnpj e endereço de e-mail. */