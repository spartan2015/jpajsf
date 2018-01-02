package proiectCap2;

import java.util.ArrayList;
import java.util.List;


public class subCategorie extends Categorie {
	private String subcategorie;
private List<Categorie> categorii= new ArrayList<Categorie>(); 
private List<Produs> produse= new ArrayList<>();
public subCategorie() {
	super();
}
public subCategorie(List<Categorie> categorii, List<Produs> produse) {
	super();
	this.categorii = categorii;
	this.produse = produse;
}
public List<Categorie> getCategorii() {
	return categorii;
}
public void setCategorii(List<Categorie> categorii) {
	this.categorii = categorii;
}
public List<Produs> getProduse() {
	return produse;
}
public void setProduse(List<Produs> produse) {
	this.produse = produse;
}
public void adaugaProdus(Produs produs) {
	this.produse.add(produs);
}
public void adaugaSubCategorie(subCategorie subcategorie) {
	this.categorii.add(subcategorie);
}
}
