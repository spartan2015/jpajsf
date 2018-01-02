package lab2;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
private Integer idCatalog;
private String denumireCatalog;
List<Categorie> categoriiProduse = new ArrayList<>();
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
public List<Categorie> getCategoriiProduse() {
	return categoriiProduse;
}
public void setCategoriiProduse(List<Categorie> categoriiProduse) {
	this.categoriiProduse = categoriiProduse;
}
public void adaugaCategorie(Categorie colectieCategorii) {
	this.categoriiProduse.add(colectieCategorii);
}
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
//afisare categorii din care face parte un produs
public List<Categorie> getCategoriiProdus(){
	List<Categorie> categoriiProdus = new ArrayList<>();
	for(Categorie categorie: categoriiProdus)
		categoriiProdus.addAll(categorie.getSubCategorii());
	
	return categoriiProdus;
}
}
