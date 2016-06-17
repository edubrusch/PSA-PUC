package com.eduardo.leilao.web;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "listagemLeiloes", eager = true)
public class ListagemLeiloesBean {
	
	
	private Leilao[] todosOsLeiloes = {	
			};
	
	public Leilao[] getListar(){
		return todosOsLeiloes;
	}

}
