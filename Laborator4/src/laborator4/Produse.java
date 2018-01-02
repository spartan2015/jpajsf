package laborator4;

public class Produse {
private Integer idProdus;
private String denumireProd;
private Double pretUnitar;
public Produse() {
	super();
}
public Produse(Integer idProdus, String denumireProd, Double pretUnitar) {
	super();
	this.idProdus = idProdus;
	this.denumireProd = denumireProd;
	this.pretUnitar = pretUnitar;
}
public Integer getIdProdus() {
	return idProdus;
}
public void setIdProdus(Integer idProdus) {
	this.idProdus = idProdus;
}
public String getDenumireProd() {
	return denumireProd;
}
public void setDenumireProd(String denumireProd) {
	this.denumireProd = denumireProd;
}
public Double getPretUnitar() {
	return pretUnitar;
}
public void setPretUnitar(Double pretUnitar) {
	this.pretUnitar = pretUnitar;
}
}
