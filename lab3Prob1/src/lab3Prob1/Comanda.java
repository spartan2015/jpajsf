package lab3Prob1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Comanda {
private Date dataComanda = new Date();
 List<ArticolComanda> articole = new ArrayList<>();
private Double ValoareTotala;
public Comanda() {
	super();
}
public Comanda(Date dataComanda, Double valoareTotala) {
	super();
	this.dataComanda = dataComanda;
	ValoareTotala = valoareTotala;
}
public Date getDataComanda() {
	return dataComanda;
}
public void setDataComanda(Date dataComanda) {
	this.dataComanda = dataComanda;
}
public Double getValoareTotala() {
	return ValoareTotala;
}
public void setValoareTotala(Double valoareTotala) {
	ValoareTotala = valoareTotala;
}

public void adaugaArticol(ArticolComanda articole) {
	this.articole.add(articole);
}
private Double ValTot = 0.0;
public Double calcValTotal() {
	//ValTotal = 0.0;
	for(ArticolComanda articol: articole)
		ValTot = ValTot + articol.getValoareArticol();
	return ValTot;
		
			
}
public Double getValTotala() {
	if(ValTot == null)
		calcValTotal();
	return ValTot;
}
}
