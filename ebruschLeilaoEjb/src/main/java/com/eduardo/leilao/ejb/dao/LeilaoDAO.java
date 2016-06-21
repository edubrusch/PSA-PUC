package com.eduardo.leilao.ejb.dao;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.eduardo.leilao.entities.Leilao;

@Local
@Stateless(name="leilaoDao")
public class LeilaoDAO {

	@PersistenceContext(unitName = "leilaoPU")
    private EntityManager em;

    public void inserir(Leilao l) {
        em.persist(l);
    }

    @SuppressWarnings("unchecked")
	public List<Leilao> buscarTodos() {
    	return em.createNamedQuery("leilao.findAll").getResultList();
    }

//    public Bem buscarPorUsuario(String codigo) {
//    	return (Bem) em.createNamedQuery("bem.findAll").getResultList().get(0);
//    }

}
