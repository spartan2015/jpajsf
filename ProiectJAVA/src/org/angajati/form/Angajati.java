package org.angajati.form;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.AUTO;

@Entity
public abstract class Angajati {
 private String nume;
 private String prenume;
 @Id
private String marca;
public String getNume() {
	return nume;
}
public void setNume(String nume) {
	this.nume = nume;
}
public String getPrenume() {
	return prenume;
}
public void setPrenume(String prenume) {
	this.prenume = prenume;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public Angajati(String nume, String prenume, String marca) {
	super();
	this.nume = nume;
	this.prenume = prenume;
	this.marca = marca;
}
public Angajati() {
	super();
}
@Override
public String toString() {
	return String.format("%s %s\nMarca: %s", getNume(), getPrenume(), getMarca());
}

public abstract Double CalcSalar();
 
}
