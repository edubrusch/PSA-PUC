package com.eduardo.leilao.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.eduardo.leilao.entities.Bem;




@Stateless
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

    public Bem buscarPorUsuario(String codigo) {
    	return (Bem) em.createNamedQuery("bem.findAll").setParameter("dono", codigo).getResultList().get(0);
    }

}
