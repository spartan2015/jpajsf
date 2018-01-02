package lab21;

import java.util.ArrayList;
import java.util.List;

public class Categorie {
private Integer idCategorie;
private String denumireCategorie;
Categorie categorieParinte;
List<Categorie> subCategorie = new ArrayList<>();
List<Produse> produse = new ArrayList<>();
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
public Categorie(Integer idCategorie, String denumireCategorie, Categorie categorieParinte) {
	super();
	this.idCategorie = idCategorie;
	this.denumireCategorie = denumireCategorie;
	this.categorieParinte = categorieParinte;
}
public Categorie() {
	super();
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
//adaugare produse in lista
public void adaugaProdus(Produse produs) {
	if(!this.produse.contains(produs))
	this.produse.add(produs);
}
public void adaugaSubCategorie(Categorie categorii) {
	this.subCategorie.add(categorii);}
	
	public List<Produse> getProduseCategorie(){
		List<Produse> ProduseCategorie = new ArrayList<>();
		ProduseCategorie.addAll(this.produse);
		for(Categorie cat: this.subCategorie)
			ProduseCategorie.addAll(cat.getProduseCategorie());
		return ProduseCategorie;
	}
public List<Categorie> getSubCategorieProdus(Produse produs){
	List<Categorie> CategorieProdus = new ArrayList<>();
	if(this.produse.contains(produs))
		CategorieProdus.add(this);
	List<Categorie> subCategoriiProduse = new ArrayList<>();
	for(Categorie subCategorie: this.subCategorie)
		subCategoriiProduse.addAll(subCategorie.getSubCategorieProdus(produs));
	if(!subCategoriiProduse.isEmpty())
		CategorieProdus.add(this);
	return CategorieProdus;
}
}
