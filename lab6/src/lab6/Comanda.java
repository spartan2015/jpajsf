package lab6;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Comanda {
private Integer idComanda;
private Date dataComanda;
List<ArticolComandat> articole  = new ArrayList<>();
private Double valTotala;
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((idComanda == null) ? 0 : idComanda.hashCode());
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
	Comanda other = (Comanda) obj;
	if (idComanda == null) {
		if (other.idComanda != null)
			return false;
	} else if (!idComanda.equals(other.idComanda))
		return false;
	return true;
}
public Comanda() {
	super();
}
public Comanda(Integer idComanda, Date dataComanda, List<ArticolComandat> articole, Double valTotala) {
	super();
	this.idComanda = idComanda;
	this.dataComanda = dataComanda;
	this.articole = articole;
	this.valTotala = valTotala;
}
public Integer getIdComanda() {
	return idComanda;
}
public void setIdComanda(Integer idComanda) {
	this.idComanda = idComanda;
}
public Date getDataComanda() {
	return dataComanda;
}
public void setDataComanda(Date dataComanda) {
	this.dataComanda = dataComanda;
}
public Double getValTotala() {
	return valTotala;
}
public void setValTotala(Double valTotala) {
	this.valTotala = valTotala;
} 

}
