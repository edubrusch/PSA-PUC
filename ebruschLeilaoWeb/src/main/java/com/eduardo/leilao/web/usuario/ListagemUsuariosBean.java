package com.eduardo.leilao.web.usuario;

import javax.faces.bean.ManagedBean;

import com.eduardo.leilao.entities.Usuario;


@ManagedBean(name = "listagemUsuarios", eager = true)
public class ListagemUsuariosBean {

	private Usuario[] todosOsUsuarios = {new Usuario("Dr Hans Chucrute", "5055565445", "hans.chucrute@forestHospital.com"),
			new Usuario("Jack Daniels", "30587659445", "jack.deniels@hangovers.com"),
			new Usuario("Henry Ford", "00056448", "henry.ford@dirtyautos.com")
			};

	public Usuario[] getListar(){
		return todosOsUsuarios;
	}

}
