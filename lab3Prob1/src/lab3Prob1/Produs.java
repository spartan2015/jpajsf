package lab3Prob1;

public class Produs {
private Integer idProdus;
private String denumireProdus;
private Double pretUnitar;
public Integer getIdProdus() {
	return idProdus;
}
public void setIdProdus(Integer idProdus) {
	this.idProdus = idProdus;
}
public String getDenumireProdus() {
	return denumireProdus;
}
public void setDenumireProdus(String denumireProdus) {
	this.denumireProdus = denumireProdus;
}
public Double getPretUnitar() {
	return pretUnitar;
}
public void setPretUnitar(Double pretUnitar) {
	this.pretUnitar = pretUnitar;
}
public Produs(Integer idProdus, String denumireProdus, Double pretUnitar) {
	super();
	this.idProdus = idProdus;
	this.denumireProdus = denumireProdus;
	this.pretUnitar = pretUnitar;
}
public Produs() {
	super();
}

}
