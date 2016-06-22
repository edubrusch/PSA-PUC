package com.eduardo.leilao.ejb.dao;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.eduardo.leilao.entities.Usuario;


@Local
@Stateless(name="userDao")
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
    
    
    public Usuario buscarPorIdentificacao(String ident) {
    	Query consulta = em.createNamedQuery("usuario.findByIdentificacao");
    	consulta.setParameter("identificacao", ident);
    	return (Usuario) consulta.getSingleResult();
    }

}
