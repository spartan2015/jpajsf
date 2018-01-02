package laborator4;

public abstract class Hardware extends Produse {
 protected String numeModel;

public Hardware() {
	super();
}

public Hardware(Integer idProdus, String denumireProd, Double pretUnitar, String numeModel) {
	super(idProdus, denumireProd, pretUnitar);
	this.numeModel = numeModel;
}

public String getNumeModel() {
	return numeModel;
}

public void setNumeModel(String numeModel) {
	this.numeModel = numeModel;
}
}
