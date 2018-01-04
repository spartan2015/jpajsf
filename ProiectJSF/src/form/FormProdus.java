package form;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.comenzi.model.Client;
import org.comenzi.model.Produs;

@ManagedBean("formProdus")
public class FormProdus {
	
	
		List<Produs> produse;
		String denumire;
		String um;
		Double pretUnitar;
		

		public FormProdus() {			
			EntityManager em = JpaUtil.getEmf().createEntityManager();
			produse = (List<Produs>) em.createQuery("select p from Produs p").getResultList();
		}

		public List<Produs> getProduse() {
			return produse;
		}

		public String getDenumire() {
			return denumire;
		}

		public void setDenumire(String denumire) {
			this.denumire = denumire;
		}
		
//---------------------------//
	

		public String getUm() {
			return um;
		}

		public void setUm(String um) {
			this.um = um;
		}
		
		//---------------------------//
		
		public Double getPretUnitar() {
			return pretUnitar;
		}

		public void setPretUnitar(Double pretUnitar) {
			this.pretUnitar = pretUnitar;
		}
		
		
		

		public void setProduse(String denumire, String um, Double pretUnitar) {
			this.denumire= denumire;
			this.um = um;
			this.pretUnitar = pretUnitar;
		}
		//---------------------------//

		public String add() {
			EntityManager em = JpaUtil.getEmf().createEntityManager();
			em.getTransaction().begin();
			Produs produs = new Produs();
			produs.setDenumire(this.denumire);
			produs.setUm(this.um);
			produs.setPretUnitar(this.pretUnitar);			
			em.persist(produs);
			em.getTransaction().commit();

			produse = (List<Produs>) em.createQuery("select p from Produs p").getResultList();

			return null;
		}
		
		
		
		//stergere produse din BD

		public String delete(Produs produs) {
			EntityManager em = JpaUtil.getEmf().createEntityManager();
			em.getTransaction().begin();

			produs = em.merge(produs);
			em.remove(produs);
			em.getTransaction().commit();

			produse = (List<Produs>) em.createQuery("select p from Produs p").getResultList();

			return null;
		}

		public String saveAll() {
			EntityManager em = JpaUtil.getEmf().createEntityManager();
			em.getTransaction().begin();
			for (Produs produs : produse) {			
				em.merge(produs);
			}
			em.getTransaction().commit();

			produse = (List<Produs>) em.createQuery("select p from Produs p").getResultList();
			return null;
		}
		
		public String cauta() {
			EntityManager em = JpaUtil.getEmf().createEntityManager();
			

			produse = (List<Produs>) em.createQuery("select p from Produs p where p.denumire like '%" + denumire + "%'")
					.getResultList();

			this.denumire = null;
			return null;
		}
}
