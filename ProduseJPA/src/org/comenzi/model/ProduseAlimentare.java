package org.comenzi.model;

public abstract class ProduseAlimentare extends Produs {

	protected String CategorieProdus;

	public String getCategorieProdus() {
		return CategorieProdus;
	}

	public void setCategorieProdus(String categorieProdus) {
		CategorieProdus = categorieProdus;
	}

	public ProduseAlimentare(Integer cod, String denumire, String um, Double pretUnitar, String categorieProdus) {
		super(cod, denumire, um, pretUnitar);
		CategorieProdus = categorieProdus;
	}

	public ProduseAlimentare() {
		super();
	}
	

}
