package lab6;

public class Produs {
private Integer idProdus;
private String denumire;
private Double pretUnitar;
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
public Produs(Integer idProdus, String denumire, Double pretUnitar) {
	super();
	this.idProdus = idProdus;
	this.denumire = denumire;
	this.pretUnitar = pretUnitar;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
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
