package com.eduardo.leilao.web;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "listagemBens", eager = true)
public class ListagemBensBean {
	
	private Bem[] todosOsBens = {new Bem("lampada boa", "lampada boa fluorescente 80w", CATEGORIAENUM.OUTROS),
			new Bem("Gol", "Gol GT ano 1991", CATEGORIAENUM.AUTOMOVEIS),
			new Bem("Casa em capao", "Residencia em capao da canoa 3 qts na rua principal, 5470", CATEGORIAENUM.IMOVEIS)	
			};
	
	public Bem[] getListar(){
		return todosOsBens;
	}


}
