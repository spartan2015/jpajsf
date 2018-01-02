package lab2;

import java.util.ArrayList;
import java.util.List;

public class Categorie {
private Integer idCategorie;
private String denumireCategorie;
private Categorie categorieParinte;

List<Categorie> subCategorii = new ArrayList<>();
List<Produs> Produse = new ArrayList<>();
public Integer getIdCategorie() {
	return idCategorie;
}
public void setIdCategorie(Integer idCategorie) {
	this.idCategorie = idCategorie;
}
public String getDenumireCategorie() {
	return denumireCategorie;
}
public void setDenumireCategorie(String denumireCategorie) {
	this.denumireCategorie = denumireCategorie;
}
public Categorie getCategorieParinte() {
	return categorieParinte;
}
public void setCategorieParinte(Categorie categorieParinte) {
	this.categorieParinte = categorieParinte;
}
public List<Categorie> getSubCategorii() {
	return subCategorii;
}
public void setSubCategorii(List<Categorie> subCategorii) {
	this.subCategorii = subCategorii;
}
public List<Produs> getProduse() {
	return Produse;
}
public void setProduse(List<Produs> produse) {
	Produse = produse;
}
public Categorie(Integer idCategorie, String denumireCategorie, Categorie categorieParinte) {
	super();
	this.idCategorie = idCategorie;
	this.denumireCategorie = denumireCategorie;
	this.categorieParinte = categorieParinte;
}
public Categorie() {
	super();
}
//private List<Produs> produse = new ArrayList<>();
public void adaugaProdus(Produs produse) {
	if(!this.Produse.contains(produse))	
	this.Produse.add(produse);
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((idCategorie == null) ? 0 : idCategorie.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Categorie other = (Categorie) obj;
	if (idCategorie == null) {
		if (other.idCategorie != null)
			return false;
	} else if (!idCategorie.equals(other.idCategorie))
		return false;
	return true;
}
public void adaugaSubCategorie(Categorie categorii) {
	this.subCategorii.add(categorii);
}
//adaugaare responsabilitate pt afisare categorie

public List<Produs> getProduseCategorie(){
	List<Produs> produseCategorie = new ArrayList<>();
	produseCategorie.addAll(this.Produse);
	for(Categorie categorie: this.subCategorii)
		produseCategorie.addAll(categorie.getProduseCategorie());
	return produseCategorie;
}
}
