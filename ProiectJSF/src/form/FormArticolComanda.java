package form;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.comenzi.model.ArticolComanda;
import org.comenzi.model.Client;
import org.comenzi.model.Comanda;
import org.comenzi.model.Produs;

@ManagedBean("formArticolComanda")
public class FormArticolComanda {
	List<ArticolComanda> articole;

	Comanda comanda;
	Produs produs;
	Double cantitate;

	public FormArticolComanda() {

		String idComandaAsString = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap()
				.get("idComanda");

		if (idComandaAsString != null) {
			Integer idComanda = Integer.valueOf(idComandaAsString);
			comanda = JpaUtil.getEmf().createEntityManager().find(Comanda.class, idComanda);
		}
		fetchArticole();

	}

	private void fetchArticole() {
		if (comanda == null) return;
		EntityManager em = JpaUtil.getEmf().createEntityManager();
		Query query = em.createQuery("select ac from ArticolComanda ac where ac.comanda = :comanda");
		query.setParameter("comanda", comanda);
		articole = (List<ArticolComanda>) query.getResultList();
	}

	public List<ArticolComanda> getArticole() {
		return articole;
	}

	public Double getCantitate() {
		return cantitate;
	}

	public void setCantitate(Double cantitate) {
		this.cantitate = cantitate;
	}

	public String add() {
		EntityManager em = JpaUtil.getEmf().createEntityManager();
		em.getTransaction().begin();

		ArticolComanda articol = new ArticolComanda();
		articol.setCantitate(this.cantitate);
		articol.setProdus(produs);
		articol.setComanda(comanda);
		em.persist(articol);
		em.getTransaction().commit();

		this.cantitate = null;
		this.produs = null;
		fetchArticole();
		return "formArticolComanda?idComanda=" + comanda.getId() + "&faces-redirect=true";
	}

	public String cauta() {
		EntityManager em = JpaUtil.getEmf().createEntityManager();
		Query query = em
				.createQuery("select ac from ArticolComanda ac where ac.produs = :produs and ac.comanda = :comanda");
		query.setParameter("produs", produs);
		query.setParameter("comanda", comanda);
		articole = (List<ArticolComanda>) query.getResultList();
		this.produs = null;
		return "formArticolComanda?idComanda=" + comanda.getId() + "&faces-redirect=true";
	}

	public String delete(ArticolComanda articol) {
		EntityManager em = JpaUtil.getEmf().createEntityManager();
		em.getTransaction().begin();

		articol = em.merge(articol);
		em.remove(articol);
		em.getTransaction().commit();

		fetchArticole();

		return "formArticolComanda?idComanda=" + comanda.getId() + "&faces-redirect=true";
	}

	public String saveAll() {
		EntityManager em = JpaUtil.getEmf().createEntityManager();
		em.getTransaction().begin();
		for (ArticolComanda articol : articole) {
			em.merge(articol);
		}
		em.getTransaction().commit();

		fetchArticole();
		return "formArticolComanda?idComanda=" + comanda.getId() + "&faces-redirect=true";
	}

	public Comanda getComanda() {
		return comanda;
	}

	public void setComanda(Comanda comanda) {
		this.comanda = comanda;
		fetchArticole();
	}

	public Produs getProdus() {
		return produs;
	}

	public void setProdus(Produs produs) {
		this.produs = produs;
	}

	public void setArticole(List<ArticolComanda> articole) {
		this.articole = articole;
	}
}