package form;

import java.awt.event.ActionEvent;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.LockModeType;
import javax.persistence.Persistence;

import org.comenzi.model.Client;

@ManagedBean("formClienti")
public class FormClienti {
	List<Client> clients;
	String nume;
	private EntityManagerFactory emf;

	public FormClienti() {
		emf = Persistence.createEntityManagerFactory("ProduseJPA");
		EntityManager em = emf.createEntityManager();
		clients = (List<Client>) em.createQuery("select c from Client c").getResultList();
	}

	public List<Client> getClients() {
		return clients;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String add() {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Client client = new Client();
		client.setNume(this.nume);
		em.persist(client);
		em.getTransaction().commit();

		clients = (List<Client>) em.createQuery("select c from Client c").getResultList();

		return null;
	}

	public String delete(Client client) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		client = em.merge(client);
		em.remove(client);
		em.getTransaction().commit();

		clients = (List<Client>) em.createQuery("select c from Client c").getResultList();

		return null;
	}

	public String saveAll() {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		for (Client client : clients) {			
			em.merge(client);
		}
		em.getTransaction().commit();

		clients = (List<Client>) em.createQuery("select c from Client c").getResultList();
		return null;
	}

}
