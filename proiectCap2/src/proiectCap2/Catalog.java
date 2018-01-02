package proiectCap2;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
private Integer idCatalog;
private String denumire;
private List<Categorie> categoriiProduse = new ArrayList<>();
public void adaugaCategorie(Categorie categoriiproduse) {
	this.categoriiProduse.add(categoriiproduse);
}
public Catalog() {
	super();
}
public Catalog(Integer idCatalog, String denumire) {
	super();
	this.idCatalog = idCatalog;
	this.denumire = denumire;
	//this.categoriiProduse = categoriiProduse;
}
public Integer getIdCatalog() {
	return idCatalog;
}
public void setIdCatalog(Integer idCatalog) {
	this.idCatalog = idCatalog;
}
public String getDenumire() {
	return denumire;
}
public void setDenumire(String denumire) {
	this.denumire = denumire;
}
public List<Categorie> getCategoriiProduse() {
	return categoriiProduse;
}
public void setCategoriiProduse(List<Categorie> categoriiProduse) {
	this.categoriiProduse = categoriiProduse;
}
}
