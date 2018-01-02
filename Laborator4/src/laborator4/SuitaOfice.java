package laborator4;

public class SuitaOfice extends Software {
private String tipSistemOperare;

public SuitaOfice() {
	super();
}

public SuitaOfice(Integer idProdus, String denumireProd, Double pretUnitar, String versiune, String tipSistemOperare) {
	super(idProdus, denumireProd, pretUnitar, versiune);
	this.tipSistemOperare = tipSistemOperare;
}

public String getTipSistemOperare() {
	return tipSistemOperare;
}

public void setTipSistemOperare(String tipSistemOperare) {
	this.tipSistemOperare = tipSistemOperare;
}
}
