package org.angajati.form;

public class SalarPlusComisionAngajat extends ComisionAngajat {

	private static Double salarBaza;

	public static Double getSalarBaza() {
		return salarBaza;
	}

	public void setSalarBaza(Double salarBaza) {
		this.salarBaza = salarBaza;
	}

	public SalarPlusComisionAngajat(String nume, String prenume, String marca,  Double procentComision,
			Double vanzari, Double salar) {
		super(nume, prenume, marca, procentComision, vanzari);
		setSalarBaza(salar); 
	}

	public SalarPlusComisionAngajat() {
		super();
	}

	@Override
	public String toString() {
		return String.format("%s %s; %s: $%, .2f", "salar de baza", super.toString(), "salar de baza", getSalarBaza());
	}
	public  Double CalcSalar() {
		return getSalarBaza() + super.CalcSalar();
	}

}
