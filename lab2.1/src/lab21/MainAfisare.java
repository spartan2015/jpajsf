package lab21;

import java.util.List;

public class MainAfisare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Catalog catalog = new Catalog(1, "Catalog 2018");
		
		Categorie categorie1 = new Categorie(1, "Software", null);
		catalog.adaugaCategorie(categorie1);
		
		
		Categorie categorie2 = new Categorie(2, "Hardware", null);
		catalog.adaugaCategorie(categorie2);
		
		Categorie categorie11 = new Categorie(11, "SO", categorie1);
		categorie1.adaugaSubCategorie(categorie11);
		
		Produse p1 = new Produse(1, "MS Windows", 2345.0);
		categorie11.adaugaProdus(p1);
		
		Produse p2 = new Produse(1, "MS Windows", 2345.0);
		categorie11.adaugaProdus(p2);
		
		System.out.println("_______________________________________________________");
		System.out.println("Categeorie este: " + categorie1.getDenumireCategorie());
		List<Produse> categorieProduse = categorie1.getProduseCategorie();
		for(Produse p: categorieProduse)
			System.out.println(p.getDenumireProdus());
		
		//prezentare produs plecand de la produs si mai apoi categorie
		
		System.out.println("_____________________________________________________");
		System.out.println(p1.getDenumireProdus() + "se gaseste in categoria ");
		for(Categorie categorie: catalog.getCategoriiProduse(p1))
			System.out.print("-->>" + categorie.getDenumireCategorie());
		
		//afisareproduse
		
		System.out.println("______________________________________________________");
		
		
	}

}
