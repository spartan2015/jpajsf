package laborator3;

public class Produs {
	private Integer idProdus;
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
private String denumire;
 private Double pretUnitar;
 
}
