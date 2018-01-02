package laborator3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Catalog catalog = new Catalog(1, "catalog2018");

		Categorie categorie1 = new Categorie(1, "Software", null);
		catalog.adaugaCategorie(categorie1);

		Categorie categorie2 = new Categorie(2, "Harware", null);
		catalog.adaugaCategorie(categorie2);

		Categorie categorie11 = new Categorie(11, "SO", categorie1);
		categorie1.adaugaSubcategorie(categorie11);

		Categorie categorii12 = new Categorie(12, "IOS", categorie1);
		categorie1.adaugaSubcategorie(categorii12);

		Categorie categorii21 = new Categorie(21, "Telefon", categorie2);
		categorie2.adaugaSubcategorie(categorii21);

		Categorie categorii22 = new Categorie(22, "Desktop", categorie2);
		categorie2.adaugaSubcategorie(categorii22);

		Produs p1 = new Produs(1, "MS Windows", 300.0);
		categorie11.adaugaProdus(p1);

		Produs p2 = new Produs(2, "MS Ceva", 400.0);
		categorii12.adaugaProdus(p2);

		Produs p3 = new Produs(3, "PC Dell", 1500.0);
		categorii21.adaugaProdus(p3);

		Produs p4 = new Produs(4, "Lenovo", 4500.0);
		categorii22.adaugaProdus(p4);

		System.out.println("Categorie: " + categorie1.getDenumireCat());
		List<Produs> produscategorie = categorie1.getProduseCategorie();

		for (Produs p : produscategorie) {
			System.out.println("Produs: " + p.getDenumire());
		}

	}

}
