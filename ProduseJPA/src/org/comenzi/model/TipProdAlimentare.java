package org.comenzi.model;

public class TipProdAlimentare extends ProduseAlimentare {

private String tipProdAliment;

public String getTipProdAliment() {
	return tipProdAliment;
}

public void setTipProdAliment(String tipProdAliment) {
	this.tipProdAliment = tipProdAliment;
}

public TipProdAlimentare(Integer cod, String denumire, String um, Double pretUnitar, String categorieProdus,
		String tipProdAliment) {
	super(cod, denumire, um, pretUnitar, categorieProdus);
	this.tipProdAliment = tipProdAliment;
}

public TipProdAlimentare() {
	super();
}


}
