package laborator3;

import java.util.ArrayList;
import java.util.List;


public class Categorie {
	private Integer idCategorie;
	public Categorie() {
		super();
	}
	public Categorie(Integer idCategorie, String denumireCat, Categorie categorieParinte) {
		super();
		this.idCategorie = idCategorie;
		this.denumireCat = denumireCat;
		this.categorieParinte = categorieParinte;
	}
	public Integer getIdCategorie() {
		return idCategorie;
	}
	public void setIdCategorie(Integer idCategorie) {
		this.idCategorie = idCategorie;
	}
	public String getDenumireCat() {
		return denumireCat;
	}
	public void setDenumireCat(String denumireCat) {
		this.denumireCat = denumireCat;
	}
	public Categorie getCategorieParinte() {
		return categorieParinte;
	}
	public void setCategorieParinte(Categorie categorieParinte) {
		this.categorieParinte = categorieParinte;
	}
	private String denumireCat;
	Categorie categorieParinte;
	private List<Produs> produse = new ArrayList<Produs>();
	
	public void adaugaProdus(Produs produs) {
		this.produse.add(produs);
	}
	
	private List<Categorie> subCategorii = new ArrayList<Categorie>();
	
	
	public void adaugaSubcategorie(Categorie subcategorie) {
		this.subCategorii.add(subcategorie);
	}

	//adaugare  metoda de afisare
	public List<Produs> getProduseCategorie(){
		List<Produs> produseCategorie = new ArrayList<Produs>();
		produseCategorie.addAll(this.produse);
		
		for(Categorie categorie: this.subCategorii) {
			produseCategorie.addAll(categorie.getProduseCategorie());
		}
		return produseCategorie;
	}
}


