package laborator3;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
private Integer idCatalog;
private String denumireCatalog;
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
private List<Categorie> categoriiProduse = new ArrayList<>();
public void adaugaCategorie (Categorie categorii) {
	this.categoriiProduse.add(categorii);
}
}
