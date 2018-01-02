package laborator4;

public abstract class Software extends Produse {
 protected String versiune;

public Software() {
	super();
}

public Software(String versiune) {
	super();
	this.versiune = versiune;
}

public String getVersiune() {
	return versiune;
}

public void setVersiune(String versiune) {
	this.versiune = versiune;
}
//constructori cu parametri din superclas produse
public Software(Integer idProdus, String denumireProd, Double pretUnitar, String versiune) {
	super(idProdus, denumireProd, pretUnitar);
	this.versiune = versiune;
}



}
