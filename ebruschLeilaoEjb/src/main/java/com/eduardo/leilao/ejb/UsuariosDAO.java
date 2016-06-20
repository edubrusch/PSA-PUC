package com.eduardo.leilao.ejb;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.eduardo.leilao.entities.Usuario;

public class UsuariosDAO {

	@PersistenceContext(unitName = "leilaoPU")
    private EntityManager em;

    public void inserir(Usuario u) {
        em.persist(u);
    }

    @SuppressWarnings("unchecked")
	public List<Usuario> buscarTodos() {
        Query consulta = em.createNamedQuery("usuario.findAll");
        return consulta.getResultList();


    }

}
