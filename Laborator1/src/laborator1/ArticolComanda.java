package laborator1;

public class ArticolComanda {
private Double cantitate;
private String ArticolComanda;
Produs produs;
public Double getCantitate() {
	return cantitate;
}
public void setCantitate(Double cantitate) {
	this.cantitate = cantitate;
}
public String getArticolComanda() {
	return ArticolComanda;
}
public void setArticolComanda(String articolComanda) {
	ArticolComanda = articolComanda;
}
public Produs getProdus() {
	return produs;
}
public void setProdus(Produs produs) {
	this.produs = produs;
}
public ArticolComanda(Double cantitate, String articolComanda, Produs produs) {
	super();
	this.cantitate = cantitate;
	ArticolComanda = articolComanda;
	this.produs = produs;
}
public ArticolComanda() {
	super();
}

}
