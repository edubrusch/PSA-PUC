package com.eduardo.leilao.web.bem;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.eduardo.leilao.ejb.dao.BensDAO;
import com.eduardo.leilao.entities.Bem;

@ManagedBean(name = "listagemBens", eager = true)
public class ListagemBensBean {

	@EJB(beanName="bemDao")
	private BensDAO dao;

	public List<Bem> getListar(){
		List<Bem> resultado = dao.buscarTodos();
		return resultado;
	}


}
