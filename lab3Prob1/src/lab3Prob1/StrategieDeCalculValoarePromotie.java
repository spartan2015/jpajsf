package lab3Prob1;
import static lab3Prob1.ArticolComanda.*;

public class StrategieDeCalculValoarePromotie implements StrategieCalcul {
	
	public Double calcValoare(ArticolComanda articolComanda) {
		Double Valoare = null;
		if (articolComanda.produs != null && articolComanda.getCantitate() != 0) {
			if (CALCULATOARE.equals(articolComanda.produs.getDenumireProdus())) {
				Valoare = valoareComanda(articolComanda);
				if (Valoare > 3000) {
					Valoare = 0.8 * Valoare;
				}
			} else if (IMPRIMANTE.equals(articolComanda.produs.getDenumireProdus())) {
				Valoare = valoareComanda(articolComanda);
				if (Valoare > 2000) {
					Valoare = 0.67 * Valoare;
				}				
			} else {
				Valoare = valoareComanda(articolComanda);
			}
		}
		return Valoare;
	}


	private double valoareComanda(ArticolComanda articolComanda) {
		return articolComanda.produs.getPretUnitar() * articolComanda.getCantitate();
	}
}
