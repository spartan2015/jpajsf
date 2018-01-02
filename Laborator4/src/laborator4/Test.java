package laborator4;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SistemOperare SO = new SistemOperare(1, "MS Windows", 2450.0, "v7", "x86");
		SistemOperare SO1 = new SistemOperare(2, "IOS", 1250.0, "v5", "iPhone");
		SuitaOfice SOfice = new SuitaOfice(3, "MS Ofice", 850.0, "v20", "MSW 7");
		SistemDesktop SD = new SistemDesktop(4, "del PC", 4500.0,"N500", "min tower" );
		SistemMobil SM = new SistemMobil(5, "NB Lenovo", 44560.0, "D100", 32.0);
		
		List<Produse> catalogProduse = new ArrayList<Produse>();
		catalogProduse.add(SO);
		catalogProduse.add(SO1);
		catalogProduse.add(SOfice);
		catalogProduse.add(SD);
		catalogProduse.add(SD);
		catalogProduse.add(SM);
		
		for(Produse p: catalogProduse) {
			System.out.println(p.getDenumireProd());
			if(p.getClass().equals(SistemOperare.class))
			{ //transform produsl p in SO
				SistemOperare s1 = (SistemOperare) p;
				System.out.println(s1.getVersiune() + "ruleaza pe hardware " + s1.getTipHardware());
				
			}
			if(p.getClass().equals(SuitaOfice.class))
			{
				SuitaOfice sofice1 = (SuitaOfice) p;
				System.out.println(sofice1.getVersiune() + "ruleaza pe hardware " + sofice1.getTipSistemOperare());
				
			}
			if(p.getClass().equals(SistemDesktop.class)) {
				SistemDesktop SD1 = (SistemDesktop) p;
				System.out.println(SD1.getTipArhitectura() + "ruleaza pe hardware " + SD1.getNumeModel());
				
				

			}
			if(p.getClass().equals(SistemMobil.class)) {
				SistemMobil SM1 =(SistemMobil) p;
				System.out.println(SM1.getCapaciateMemeorie() + "ruleaza pe harware" + SM1.getNumeModel());
			}
		}
	}

}
