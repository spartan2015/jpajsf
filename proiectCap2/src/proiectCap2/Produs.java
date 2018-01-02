package proiectCap2;

public class Produs {
 private Integer idProdus;
 private String denumire;
 private Double pretUnitar;
public Produs() {
	super();
}
public Produs(Integer idProdus, String denumire, Double pretUnitar) {
	super();
	this.idProdus = idProdus;
	this.denumire = denumire;
	this.pretUnitar = pretUnitar;
}
public Integer getIdProdus() {
	return idProdus;
}
public void setIdProdus(Integer idProdus) {
	this.idProdus = idProdus;
}
public String getDenumire() {
	return denumire;
}
public void setDenumire(String denumire) {
	this.denumire = denumire;
}
public Double getPretUnitar() {
	return pretUnitar;
}
public void setPretUnitar(Double pretUnitar) {
	this.pretUnitar = pretUnitar;
}
}
