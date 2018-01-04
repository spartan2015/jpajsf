package org.angajati.form;

public class ComisionAngajat extends Angajati {

private  Double castigVanzari;
private  Double comision;
public ComisionAngajat() {
	super();
}
public ComisionAngajat(String nume, String prenume, String marca, Double procentComision, Double vanzari) {
	super(nume, prenume, marca);
	setCastigVanzari(vanzari);
	setComision(procentComision); 
}
public  Double getCastigVanzari() {
	return castigVanzari;
}
public void setCastigVanzari(Double vanzari) {
	castigVanzari = (vanzari < 0.0) ? 0.0: vanzari;
}
public  Double getComision() {
	return comision;
}
public void setComision(Double procentComision) {
	comision = (procentComision > 0.0 && procentComision < 1.0) ? procentComision:0.0;
}
@Override
public String toString() {
	return String.format(" %s: %s\n%s: $%,.2f; %s: %.2f", "comision angajat ", super.toString(), "venit din vanzari ", getCastigVanzari(), "procent comision",getComision());
}

public Double CalcSalar() {
	return getComision()*getCastigVanzari();
}

}
