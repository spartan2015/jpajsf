package laborator4;

public class SistemDesktop extends Hardware {
private String tipArhitectura;

public SistemDesktop() {
	super();
}

public SistemDesktop(Integer idProdus, String denumireProd, Double pretUnitar, String numeModel,
		String tipArhitectura) {
	super(idProdus, denumireProd, pretUnitar, numeModel);
	this.tipArhitectura = tipArhitectura;
}

public String getTipArhitectura() {
	return tipArhitectura;
}

public void setTipArhitectura(String tipArhitectura) {
	this.tipArhitectura = tipArhitectura;
}
}
