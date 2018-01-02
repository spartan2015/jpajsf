package proiectCap2;

public class Categorie {
private Integer idCategorie;
private String denumire;
private String categorieParinte;
public Categorie() {
	super();
}
public Categorie(Integer idCategorie, String denumire, String categorieParinte) {
	super();
	this.idCategorie = idCategorie;
	this.denumire = denumire;
	this.categorieParinte = categorieParinte;
}
public Integer getIdCategorie() {
	return idCategorie;
}
public void setIdCategorie(Integer idCategorie) {
	this.idCategorie = idCategorie;
}
public String getDenumire() {
	return denumire;
}
public void setDenumire(String denumire) {
	this.denumire = denumire;
}
public String getCategorieParinte() {
	return categorieParinte;
}
public void setCategorieParinte(String categorieParinte) {
	this.categorieParinte = categorieParinte;
}
}
