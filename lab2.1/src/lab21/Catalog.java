package lab21;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
private Integer idCatalog;
private String denumireCatalog;
List<Categorie> categoriiProduse = new ArrayList<>();
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((idCatalog == null) ? 0 : idCatalog.hashCode());
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
	Catalog other = (Catalog) obj;
	if (idCatalog == null) {
		if (other.idCatalog != null)
			return false;
	} else if (!idCatalog.equals(other.idCatalog))
		return false;
	return true;
}
public Catalog() {
	super();
}
public Catalog(Integer idCatalog, String denumireCatalog) {
	super();
	this.idCatalog = idCatalog;
	this.denumireCatalog = denumireCatalog;
}
public Integer getIdCatalog() {
	return idCatalog;
}
public void setIdCatalog(Integer idCatalog) {
	this.idCatalog = idCatalog;
}
public String getDenumireCatalog() {
	return denumireCatalog;
}
public void setDenumireCatalog(String denumireCatalog) {
	this.denumireCatalog = denumireCatalog;
}
public void adaugaCategorie(Categorie categorii) {
	this.categoriiProduse.add(categorii);
}
public List<Categorie> getCategoriiProduse(Produse produs){
	List<Categorie> CategoriiProdus = new ArrayList<Categorie>();
	for(Categorie categorii: categoriiProduse)
		CategoriiProdus.addAll(categorii.getSubCategorieProdus(produs));
	
	return CategoriiProdus;
}
//afisare produse din totate categoriile

public List<Produse> getProdusCatalog(){
	List<Produse> ProdusCatalog = new ArrayList<>();
	for(Categorie categorii: categoriiProduse)
		ProdusCatalog.addAll(categorii.getProduseCategorie());
	
	return ProdusCatalog;
}
}
