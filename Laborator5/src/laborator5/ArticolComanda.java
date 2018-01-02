package laborator5;

public class ArticolComanda {
	private Double cantiate;
	Produs produs;
	public Double getCantiate() {
		return cantiate;
	}
	public void setCantiate(Double cantiate) {
		this.cantiate = cantiate;
	}
	public Produs getProdus() {
		return produs;
	}
	public void setProdus(Produs produs) {
		this.produs = produs;
	}
	public ArticolComanda(Double cantiate, Produs produs) {
		super();
		this.cantiate = cantiate;
		this.produs = produs;
	}
	public ArticolComanda() {
		super();
	}
	
}
