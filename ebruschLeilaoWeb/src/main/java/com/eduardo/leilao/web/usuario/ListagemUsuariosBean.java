package com.eduardo.leilao.web.usuario;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.eduardo.leilao.ejb.dao.UsuariosDAO;
import com.eduardo.leilao.entities.Usuario;

@ManagedBean(name = "listagemUsuarios", eager = true)
public class ListagemUsuariosBean {

	@EJB(beanName="userDao")
	private UsuariosDAO dao;

	public List<Usuario> getListar(){
		return dao.buscarTodos();
	}

}
