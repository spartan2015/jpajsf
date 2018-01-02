package lab3Prob1;

public class ArticolComanda {
	public static final String CALCULATOARE = "calculatoare";
	public static final String IMPRIMANTE = "imprimante";
	Produs produs;
	private int cantitate;
	private Double valoareArticol;
	StrategieCalcul strategieCalcul;
	
	public ArticolComanda() {
		super();
	}

	public ArticolComanda(Produs produs, int cantitate, StrategieCalcul strategieCalcul) {
		super();
		this.produs = produs;
		this.cantitate = cantitate;
		this.strategieCalcul=strategieCalcul;
		// this.valoareArticol = valoareArticol;
	}

	public Produs getProdus() {
		return produs;
	}

	public void setProdus(Produs produs) {
		this.produs = produs;
	}

	public int getCantitate() {
		return cantitate;
	}

	public void setCantitate(int cantitate) {
		this.cantitate = cantitate;
	}

	public Double getValoareArticol() {
		return valoareArticol = calcValoare();
	}

	public void setValoareArticol(Double valoareArticol) {
		this.valoareArticol = calcValoare();
	}

	public Double calcValoare() {
		return strategieCalcul.calcValoare(this);
	}

	public Double valoareArticol() {
		if (valoareArticol == null)
			valoareArticol = calcValoare();
		return valoareArticol;
	}
}
