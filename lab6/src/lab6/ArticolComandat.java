package lab6;

public class ArticolComandat {
	Produs produs;	
	public ArticolComandat() {
		super();
	}
	public ArticolComandat(Produs produs, Double cantiate, Double valArticol) {
		super();
		this.produs = produs;
		this.cantiate = cantiate;
		this.valArticol = valArticol;
	}
	public Produs getProdus() {
		return produs;
	}
	public void setProdus(Produs produs) {
		this.produs = produs;
	}
	public Double getCantiate() {
		return cantiate;
	}
	public void setCantiate(Double cantiate) {
		this.cantiate = cantiate;
	}
	public Double getValArticol() {
		return valArticol;
	}
	public void setValArticol(Double valArticol) {
		this.valArticol = valArticol;
	}
	private Double cantiate;
	private Double valArticol;
}
