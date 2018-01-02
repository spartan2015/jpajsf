package laborator1;

public class Produs {
  private Integer idProdus;
  private Double pretUnitar;
  private String denumire;
public Integer getIdProdus() {
	return idProdus;
}
public void setIdProdus(Integer idProdus) {
	this.idProdus = idProdus;
}
public Double getPretUnitar() {
	return pretUnitar;
}
public void setPretUnitar(Double pretUnitar) {
	this.pretUnitar = pretUnitar;
}
public String getDenumire() {
	return denumire;
}
public void setDenumire(String denumire) {
	this.denumire = denumire;
}
public Produs(Integer idProdus, Double pretUnitar, String denumire) {
	super();
	this.idProdus = idProdus;
	this.pretUnitar = pretUnitar;
	this.denumire = denumire;
}
public Produs() {
	super();
}
  
  
}
