package org.comenzi.model;

public abstract class ProduseNelimentare extends Produs {
protected String CategorProd;

public String getCategorProd() {
	return CategorProd;
}

public void setCategorProd(String categorProd) {
	CategorProd = categorProd;
}

public ProduseNelimentare(Integer cod, String denumire, String um, Double pretUnitar, String categorProd) {
	super(cod, denumire, um, pretUnitar);
	CategorProd = categorProd;
}

public ProduseNelimentare() {
	super();
	}

}
