package org.comenzi.model;

import static javax.persistence.GenerationType.AUTO;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Furnizor {
	@Id

	@GeneratedValue(strategy = AUTO)
	private Integer cod;

	private String denFunizor;
	private String nrRegComert;
	private String cui;
	private String adresa;
	private String telefon;

	@OneToMany
	private List<Produs> produse;

	public List<Produs> getProduse() {
		return produse;
	}

	public void setProduse(List<Produs> produse) {
		this.produse = produse;
	}

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getDenFunizor() {
		return denFunizor;
	}

	public void setDenFunizor(String denFunizor) {
		this.denFunizor = denFunizor;
	}

	public String getNrRegComert() {
		return nrRegComert;
	}

	public void setNrRegComert(String nrRegComert) {
		this.nrRegComert = nrRegComert;
	}

	public String getCui() {
		return cui;
	}

	public void setCui(String cui) {
		this.cui = cui;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public Furnizor(Integer cod, String denFunizor, String nrRegComert, String cui, String adresa, String telefon,
			List<Produs> produse) {
		super();
		this.cod = cod;
		this.denFunizor = denFunizor;
		this.nrRegComert = nrRegComert;
		this.cui = cui;
		this.adresa = adresa;
		this.telefon = telefon;
		this.produse = produse;
	}

	public Furnizor() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cod == null) ? 0 : cod.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Furnizor other = (Furnizor) obj;
		if (cod == null) {
			if (other.cod != null)
				return false;
		} else if (!cod.equals(other.cod))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Furnizor cod=" + cod + ", denFunizor=" + denFunizor + ", nrRegComert=" + nrRegComert + ", cui=" + cui
				+ ", adresa=" + adresa + ", telefon=" + telefon;
	}
}
