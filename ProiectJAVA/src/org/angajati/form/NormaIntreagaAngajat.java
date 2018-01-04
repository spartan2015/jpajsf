package org.angajati.form;

public class NormaIntreagaAngajat extends Angajati {
	private Double salarLunar;

	public Double getSalarLunar() {
		return salarLunar;
	}

	public void setSalarLunar(Double salar) {
		salarLunar = salar < 0.0 ? 0.0: salar;
	}

	public NormaIntreagaAngajat(String nume, String prenume, String marca, Double salar) {
		super(nume, prenume, marca);
		setSalarLunar(salar);
		}

	public NormaIntreagaAngajat() {
		super();
	}

	@Override
	public String toString() {
		return String.format("angajat cu norma intreaga: %s\n%s: $%,.2f", super.toString(), "salar lunar", getSalarLunar());
	}
	
	public Double CalcSalar() {
		return getSalarLunar();
	}

}
