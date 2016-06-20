package com.eduardo.leilao.web.bem;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import com.eduardo.leilao.ejb.BensDAO;
import com.eduardo.leilao.entities.Bem;

@ManagedBean(name = "listagemBens", eager = true)
public class ListagemBensBean {

	private BensDAO dao;

	public List<Bem> getListar(){
		List<Bem> resultado = dao.buscarTodos();
		if(resultado ==null || resultado.get(0) == null){
			resultado = new ArrayList<Bem>();
			resultado.add(new Bem("Test1", "Test2", "Test3"));
		}
		return resultado;
	}


}
