package laborator4;

public class SistemMobil extends Hardware {
private Double capaciateMemeorie;

public SistemMobil() {
	super();
}

public SistemMobil(Integer idProdus, String denumireProd, Double pretUnitar, String numeModel,
		Double capaciateMemeorie) {
	super(idProdus, denumireProd, pretUnitar, numeModel);
	this.capaciateMemeorie = capaciateMemeorie;
}

public Double getCapaciateMemeorie() {
	return capaciateMemeorie;
}

public void setCapaciateMemeorie(Double capaciateMemeorie) {
	this.capaciateMemeorie = capaciateMemeorie;
}
}
