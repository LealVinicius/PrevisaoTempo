package br.usjt.demo;

import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.previsao.model.PrevTempo;
import br.usjt.previsao.model.Usuario;
import br.usjt.previsao.repository.JPAUtil;
public class TestInsereUmaPrevisao {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		PrevTempo p = new PrevTempo();
		p.setDia("Segunda");
		p.setMinima(25);
		p.setMaxima(32);
		p.setHumidade(23);
		p.setDescri("Dia ensolarado");
		p.setData(null);
		p.setLatitude(24);
		p.setLongitude(29);
		manager.persist(p);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}
}