package laborator1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produs pixuri = new Produs();
		Produs caiet = new Produs();
		caiet.setDenumire("caiet");
		pixuri.setDenumire("pix");
		caiet.setIdProdus(1);
		pixuri.setIdProdus(1);
		caiet.setPretUnitar(2.0);
		pixuri.setPretUnitar(3.0);
		
		ArticolComanda caiete = new ArticolComanda();
		ArticolComanda pixurile = new ArticolComanda();
		caiete.setCantitate(2.0);
		pixurile.setCantitate(2.0);
		
		Double ValCaiete = caiet.getPretUnitar()*caiete.getCantitate();
		Double ValPixuri = pixuri.getPretUnitar()*pixurile.getCantitate();
		Double valoreTot = ValPixuri + ValCaiete;
		
		System.out.println("val totala" + valoreTot);
		
	}

}
