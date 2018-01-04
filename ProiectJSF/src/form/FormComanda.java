package form;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.persistence.EntityManager;

import org.comenzi.model.ArticolComanda;
import org.comenzi.model.Client;
import org.comenzi.model.Comanda;
import org.comenzi.model.Produs;
import java.util.Date;

@ManagedBean("formProdus")
public class FormComanda {
	List<Comanda> comenzi;
	Date dataComanda;
	ArticolComanda articole;
	Client client;

	

	public FormComanda() {			
		EntityManager em = JpaUtil.getEmf().createEntityManager();
		comenzi = (List<Comanda>) em.createQuery("select com from Comanda com").getResultList();
	}

	public List<Comanda> getComenzi() {
		return comenzi;
	}

	
	//---------------------------//

	public Date getDataComanda() {
		return dataComanda;
	}

	public void setDataComanda(Date dataComanda) {
		this.dataComanda = dataComanda;
	}

	public ArticolComanda getArticole() {
		return articole;
	}

	public void setArticole(ArticolComanda articole) {
		this.articole = articole;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	//---------------------------//
	public FormComanda(Date dataComanda, ArticolComanda articole, Client client) {
		super();
		this.dataComanda = dataComanda;
		this.articole = articole;
		this.client = client;
	}
	

	public String add() {
		EntityManager em = JpaUtil.getEmf().createEntityManager();
		em.getTransaction().begin();
		Comanda comanda = new Comanda();
		comanda.setDataComanda(this.dataComanda);
		comanda.setClient(client);
				
		em.persist(comanda);
		em.getTransaction().commit();

		this.comenzi = (List<Comanda>) em.createQuery("select com from Comanda com").getResultList();

		return null;
	}
	
	
	


	//stergere produse din BD

	public String delete(Comanda comanda) {
		EntityManager em = JpaUtil.getEmf().createEntityManager();
		em.getTransaction().begin();

		comanda = em.merge(comanda);
		em.remove(comanda);
		em.getTransaction().commit();

		comenzi = (List<Comanda>) em.createQuery("select com from Comanda com").getResultList();

		return null;
	}

	public String saveAll() {
		EntityManager em = JpaUtil.getEmf().createEntityManager();
		em.getTransaction().begin();
		for (Comanda comanda : comenzi) {			
			em.merge(comanda);
		}
		em.getTransaction().commit();

		comenzi = (List<Comanda>) em.createQuery("select com from Comanda com").getResultList();
		return null;
	}
}
