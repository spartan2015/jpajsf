package lab2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Catalog catalog = new Catalog(1, "Catalog2011");
		
		//2categorii principale in catalog
		Categorie categorie1 = new Categorie(1, "Software", null);
		catalog.adaugaCategorie(categorie1);
		
		Categorie categorie2 = new Categorie(2, "Hardware", null);
		catalog.adaugaCategorie(categorie2);
		
		//4subcategorii principale in catalog
		
		Categorie categorie11 = new Categorie(11, "SO", categorie1);
		categorie1.adaugaSubCategorie(categorie11);
		
		Categorie categorie12 = new Categorie(12, "Office", categorie1);
		categorie1.adaugaSubCategorie(categorie12);
		
		Categorie categorie21 = new Categorie(21, "Desktop", categorie2);
		categorie2.adaugaSubCategorie(categorie21);
		
		Categorie categorie22 = new Categorie(22, "Mobile", categorie2);
		categorie2.adaugaSubCategorie(categorie22);
		
		//6produse
		
		Produs p1 = new Produs(1, "MS Windows", 2150.0);
		categorie11.adaugaProdus(p1);
		
		Produs p2 = new Produs(2, "Apple", 1230.0);
		categorie11.adaugaProdus(p2);
		
		Produs p3 = new Produs(3, "MS Office", 3456.0);
		categorie12.adaugaProdus(p3);
		
		Produs p4 = new Produs(4, "PC Dell", 5698.0);
		categorie12.adaugaProdus(p4);
		
		Produs p5 = new Produs(5, "NoteBook lenovo", 3456.0);
		categorie21.adaugaProdus(p5);
		
		Produs p6 = new Produs(6, "iPhone", 4567.0);
		categorie22.adaugaProdus(p6);
		
		//copie pt acelasi produs
		Produs p7 = new Produs(6, "iPhone", 4567.0);
		categorie22.adaugaProdus(p7);
		
		System.out.println("__________________________________________");
		System.out.println(categorie2.getDenumireCategorie()+ " are urmatoarele produse");
		
		List<Produs> produseCategorie = categorie2.getProduseCategorie();
		for(Produs p: produseCategorie)
			System.out.println("Produs categorie: "  + p.getDenumireProdus());
		
		System.out.println("_____________________________________________________");
		System.out.println(categorie1.getDenumireCategorie() + " are urmatoarele produse");
		List<Produs> produseCategorie1 = categorie1.getProduseCategorie();
		for(Produs p: produseCategorie1)
			System.out.println("Produse categorie: " + p.getDenumireProdus());
		
		System.out.println("catalogul de produse este: " + catalog.getDenumireCatalog());
		System.out.println("Produse din catalog categoria: " + categorie1.getDenumireCategorie() );
		List<Produs> produsecategorie1 = categorie1.getProduseCategorie();
		for(Produs p100: produsecategorie1)
			System.out.println("Produsul: " + p100.getDenumireProdus());
		
		System.out.println("Produse din categorie: " + categorie2.getDenumireCategorie());
		List<Produs> produsecategoria2 = categorie2.getProduseCategorie();
		for(Produs p001: produsecategoria2)
			System.out.println("Produsul " + p001.getDenumireProdus());
		
	}

}
