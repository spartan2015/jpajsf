package form;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProduseJPA");
	public static EntityManagerFactory getEmf() {
		return emf;
	};
}
