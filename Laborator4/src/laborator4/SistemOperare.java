package laborator4;

public class SistemOperare extends Software {
 private String tipHardware;

public SistemOperare() {
	super();
}

public SistemOperare(Integer idProdus, String denumireProd, Double pretUnitar, String versiune, String tipHardware) {
	super(idProdus, denumireProd, pretUnitar, versiune);
	this.tipHardware = tipHardware;
}

public String getTipHardware() {
	return tipHardware;
}

public void setTipHardware(String tipHardware) {
	this.tipHardware = tipHardware;
}
}
