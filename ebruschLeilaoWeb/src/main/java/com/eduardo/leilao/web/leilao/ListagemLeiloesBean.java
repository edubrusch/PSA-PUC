package com.eduardo.leilao.web.leilao;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.eduardo.leilao.ejb.dao.LeilaoDAO;
import com.eduardo.leilao.entities.Leilao;

@ManagedBean(name = "listagemLeiloes", eager = true)
public class ListagemLeiloesBean {

	@EJB(beanName="leilaoDao")
	private LeilaoDAO dao;

	public List<Leilao> getListar(){
		return dao.buscarTodos();
	}
}
