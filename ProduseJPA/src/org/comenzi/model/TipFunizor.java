package org.comenzi.model;

import static javax.persistence.GenerationType.AUTO;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TipFunizor {

	@Id
	@GeneratedValue(strategy = AUTO)
	private Integer idTipF;
	private String tipFunizor;

	@OneToMany
	private List<Furnizor> funizori;

	public Integer getIdTipF() {
		return idTipF;
	}

	public void setIdTipF(Integer idTipF) {
		this.idTipF = idTipF;
	}

	public String getTipFunizor() {
		return tipFunizor;
	}

	public void setTipFunizor(String tipFunizor) {
		this.tipFunizor = tipFunizor;
	}

	public List<Furnizor> getFunizori() {
		return funizori;
	}

	public void setFunizori(List<Furnizor> funizori) {
		this.funizori = funizori;
	}
}
