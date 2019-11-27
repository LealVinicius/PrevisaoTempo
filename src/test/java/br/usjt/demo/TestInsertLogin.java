package br.usjt.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.previsao.model.Usuario;
import br.usjt.previsao.repository.JPAUtil;

public class TestInsertLogin {
	public static void Main(String [] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Usuario a = new Usuario();
		a.setLogin("Fulano de tal");
		a.setSenha("123");
		manager.persist(a);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}
}
