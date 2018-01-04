package org.angajati.form;

public class PartTimeAngajat extends Angajati {

	private  Double plataOra;
	private  Double oreLucrate;
	public  Double getPlataOra() {
		return plataOra;
	}
	public void setPlataOra(Double plata) {
		plataOra = (plata < 0.0)? 0.0:plata;
	}
	public  Double getOreLucrate() {
		return oreLucrate;
	}
	public void setOreLucrate(Double ore) {
		oreLucrate = ((ore >= 0.0) && (ore <= 168)) ? ore: 0.0;
	}
	public PartTimeAngajat(String nume, String prenume, String marca, Double plataOra, Double oreLucrate) {
		super(nume, prenume, marca);
		setPlataOra(plataOra);
		setOreLucrate(oreLucrate); 
	}
	public PartTimeAngajat() {
		super();
	}
	@Override
	public String toString() {
		return String.format("angajat part time: %s\n%s: $%,.2f; %s: %,.2f", super.toString(), "platit pe ora cu ", getPlataOra(), "ore lucrate ", getOreLucrate());
	}
	
	//metoda de calcul
	public  Double CalcSalar() {
		if(getOreLucrate()<=40)
			return getOreLucrate()*getPlataOra();
		else
			return 40*getPlataOra()+(getOreLucrate() -40)*1.5;
	}
	
	
}
