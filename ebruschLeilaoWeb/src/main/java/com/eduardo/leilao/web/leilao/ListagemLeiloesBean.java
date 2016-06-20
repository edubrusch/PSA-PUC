package com.eduardo.leilao.web.leilao;

import javax.faces.bean.ManagedBean;

import com.eduardo.leilao.entities.Leilao;

@ManagedBean(name = "listagemLeiloes", eager = true)
public class ListagemLeiloesBean {


	private Leilao[] todosOsLeiloes = {new Leilao("201606170001", "aberto", "2016-06-17", "20:07", "2016-06-17", "23:50", 4550.07 )
			};

	public Leilao[] getListar(){
		return todosOsLeiloes;
	}

}
