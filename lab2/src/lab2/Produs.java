package lab2;

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
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((idProdus == null) ? 0 : idProdus.hashCode());
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
	Produs other = (Produs) obj;
	if (idProdus == null) {
		if (other.idProdus != null)
			return false;
	} else if (!idProdus.equals(other.idProdus))
		return false;
	return true;
}
public Produs() {
	super();
}
public Produs(Integer idProdus, String denumireProdus, Double pretUnitar) {
	super();
	this.idProdus = idProdus;
	this.denumireProdus = denumireProdus;
	this.pretUnitar = pretUnitar;
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
}
