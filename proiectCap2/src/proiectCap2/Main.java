package proiectCap2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 catalog
		Catalog catalog = new Catalog(1, "Catalog 2011");
		//2produse
		Categorie categorie1 = new Categorie(1, "Software", null);
		Categorie categorie2 =new Categorie(2, "Hardware", null);
		catalog.adaugaCategorie(categorie1);
		catalog.adaugaCategorie(categorie2);
		//4subcategorii
		Categorie categorie11 = new Categorie(11, "Office", categorie1);

		
	}

}
