package lab3Prob1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produs p = new Produs(1, ArticolComanda.CALCULATOARE, 1850.0);
		Produs i = new Produs(2, ArticolComanda.IMPRIMANTE, 450.0);

		StrategieCalcul strategieCalcul = new StrategieDeCalculValoareClasica();
		Comanda comanda = new Comanda();
		comanda.adaugaArticol(new ArticolComanda(p, 10, strategieCalcul));
		comanda.adaugaArticol(new ArticolComanda(i, 10, strategieCalcul));
		printComanda(comanda);
		
		
		Comanda comanda1 = new Comanda();
		StrategieCalcul calculPromotie = new StrategieDeCalculValoarePromotie();
		comanda1.adaugaArticol(new ArticolComanda(p, 10, calculPromotie));
		comanda1.adaugaArticol(new ArticolComanda(i, 8, calculPromotie));
		printComanda(comanda1);

	}

	private static void printComanda(Comanda comanda) {
		printBon(comanda);
		System.out.println(comanda.calcValTotal());
	}

	private static void printBon(Comanda comanda) {
		for (ArticolComanda articolComanda : comanda.articole) {
			System.out.println(articolComanda.getProdus().getDenumireProdus() + " " + articolComanda.getCantitate()
					+ " " + articolComanda.calcValoare());
		}
	}

}
