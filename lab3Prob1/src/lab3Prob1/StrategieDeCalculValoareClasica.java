package lab3Prob1;
import static lab3Prob1.ArticolComanda.*;

public class StrategieDeCalculValoareClasica implements StrategieCalcul {
	
	public Double calcValoare(ArticolComanda articolComanda) {
		Double Valoare = null;
		if (articolComanda.produs != null && articolComanda.getCantitate() != 0) {
			if (CALCULATOARE.equals(articolComanda.produs.getDenumireProdus())) {
				Valoare = valoareComanda(articolComanda) - valoareDiscountCalculatoare(articolComanda);
			} else if (IMPRIMANTE.equals(articolComanda.produs.getDenumireProdus())) {
				Valoare = valoareComanda(articolComanda) - valoareDiscountImprimante(articolComanda);
			} else {
				Valoare = valoareComanda(articolComanda);
			}
		}
		return Valoare;
	}

	private double valoareDiscountCalculatoare(ArticolComanda articolComanda) {
		return articolComanda.produs.getPretUnitar() * (articolComanda.getCantitate() / 5);
	}

	private double valoareDiscountImprimante(ArticolComanda articolComanda) {
		return 2 * articolComanda.produs.getPretUnitar() * (articolComanda.getCantitate() / 6);
	}

	private double valoareComanda(ArticolComanda articolComanda) {
		return articolComanda.produs.getPretUnitar() * articolComanda.getCantitate();
	}
}
