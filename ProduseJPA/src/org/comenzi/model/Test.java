package org.comenzi.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {

		List<Client> clienti = new ArrayList<Client>();
		clienti.add(new Client(1, "Austria"));
		clienti.add(new Client(2, "Franta"));
		clienti.add(new Client(3, "Anglia"));
		clienti.add(new Client(4, "Polonia"));

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProduseJPA");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(clienti.get(0));
		em.persist(clienti.get(1));
		em.persist(clienti.get(2));
		em.persist(clienti.get(3));

		em.getTransaction().commit();

	}

}
