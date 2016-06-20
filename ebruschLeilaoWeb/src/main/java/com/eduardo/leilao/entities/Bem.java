package com.eduardo.leilao.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "BENS")
@NamedQueries({
    @NamedQuery(name = "bem.findAll", query = "SELECT bem FROM Bem bem"),
    @NamedQuery(name = "bem.findByUsuario", query = "SELECT b FROM BENS b WHERE b.dono = :dono")})
public class Bem implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "ID")
	private String ID;
	private String descricaoBreve;
	private String descricaoCompleta;
	private String categoria;
	private String dono;


	public Bem(String descrBreve, String descrCompleta, String cat) {

		this.descricaoBreve = descrBreve;
		this.descricaoCompleta = descrCompleta;
		this.categoria = cat;
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

	public String getID() {
		return ID;
	}

}
