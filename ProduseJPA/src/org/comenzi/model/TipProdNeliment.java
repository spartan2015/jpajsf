package org.comenzi.model;

public class TipProdNeliment extends ProduseNelimentare {

private String tipProdNealiment;

public String getTipProdNealiment() {
	return tipProdNealiment;
}

public void setTipProdNealiment(String tipProdNealiment) {
	this.tipProdNealiment = tipProdNealiment;
}

public TipProdNeliment(Integer cod, String denumire, String um, Double pretUnitar, String categorProd,
		String tipProdNealiment) {
	super(cod, denumire, um, pretUnitar, categorProd);
	this.tipProdNealiment = tipProdNealiment;
}

public TipProdNeliment() {
	super();
}


}
