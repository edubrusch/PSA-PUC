package com.eduardo.leilao.ejb.dao;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.eduardo.leilao.entities.Bem;



@Local
@Stateless(name="bemDao")
public class BensDAO {


	@PersistenceContext(unitName = "leilaoPU")
    private EntityManager em;

    public void inserir(Bem b) {
        em.persist(b);
    }

    @SuppressWarnings("unchecked")
	public List<Bem> buscarTodos() {
    	return em.createNamedQuery("bem.findAll").getResultList();
    }

//    public Bem buscarPorUsuario(String codigo) {
//    	return (Bem) em.createNamedQuery("bem.findAll").getResultList().get(0);
//    }

}
