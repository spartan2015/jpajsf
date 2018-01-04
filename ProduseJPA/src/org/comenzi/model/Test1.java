package org.comenzi.model;

import java.util.ArrayList;
import java.util.List;


public class Test1 {

	public static void main(String[] args) {
		
		TipProdAlimentare p1 = new TipProdAlimentare(1, "carne vita", "kg", 30.0, "alimentar", "Carne");
		TipProdAlimentare p2 = new TipProdAlimentare(1, "carne porc", "kg", 15.0, "alimentar", "Carne");
		TipProdAlimentare p3 = new TipProdAlimentare(1, "lapte UTH 1,5%", "buc", 4.0, "alimentar", "Lactate");
		TipProdAlimentare p4 = new TipProdAlimentare(1, "iaurt", "buc", 6.0, "alimentar", "lactate");
		TipProdAlimentare p5 = new TipProdAlimentare(1, "unt de masa 65%", "buc", 10.0, "alimentar", "Lactate");
		TipProdAlimentare p6 = new TipProdAlimentare(1, "piper", "buc", 8.0, "alimentar", "Condimente");
		TipProdAlimentare p7 = new TipProdAlimentare(1, "sare ", "kg", 2.0, "alimentar", "Condimente");
		TipProdAlimentare p8 = new TipProdAlimentare(1, "delicat", "plic", 5.0, "alimentar", "Condimente");
		TipProdAlimentare p9 = new TipProdAlimentare(1, "faina alba", "kg", 4.0, "alimentar", "Fainoase");
		TipProdAlimentare p10 = new TipProdAlimentare(1, "faina de orz", "kg", 8.0, "alimentar", "Fainoase");
		
		TipProdAlimentare p11 = new TipProdAlimentare(1, "Detergent Arie", "kg", 45.0, "alimentar", "Detergenti");
		TipProdAlimentare p12 = new TipProdAlimentare(1, "Ariel lighid", "kg", 30.0, "alimentar", "Detergenti");
		TipProdAlimentare p13 = new TipProdAlimentare(1, "Sampon WashAndGo", "kg", 15.0, "alimentar", "Sampon");
		TipProdAlimentare p14 = new TipProdAlimentare(1, "Sampon L'real", "kg", 25.0, "alimentar", "Sampon");
		TipProdAlimentare p15 = new TipProdAlimentare(1, "Fond de ten", "kg", 50.0, "alimentar", "Cosmetice");
		TipProdAlimentare p16 = new TipProdAlimentare(1, "Ruj R100", "kg", 15.0, "alimentar", "Cosmetice");
		TipProdAlimentare p17 = new TipProdAlimentare(1, "Rimel", "kg", 23.0, "alimentar", "Cosmetice");
		
		List<Produs> catalogProduse = new ArrayList<Produs>();
		catalogProduse.add(p1);
		catalogProduse.add(p2);
		catalogProduse.add(p3);
		catalogProduse.add(p4);
		catalogProduse.add(p5);
		catalogProduse.add(p6);
		catalogProduse.add(p7);
		catalogProduse.add(p8);
		catalogProduse.add(p9);
		catalogProduse.add(p10);
		catalogProduse.add(p11);
		catalogProduse.add(p12);
		catalogProduse.add(p13);
		catalogProduse.add(p14);
		catalogProduse.add(p15);
		catalogProduse.add(p16);
		catalogProduse.add(p17);
		
		
		for(Produs p: catalogProduse) {
			System.out.println(p.getDenumire());
			if(p.getClass().equals(TipProdAlimentare.class))
			{ //transform produsl prodA si prodN in tipprod
				TipProdAlimentare prodA = (TipProdAlimentare) p;
				System.out.println("este un produs: "+ prodA.getCategorieProdus() + "face parte din categorie " + prodA.getTipProdAliment());
				
			}
			if(p.getClass().equals(TipProdNeliment.class))
			{
				TipProdNeliment prodN = (TipProdNeliment) p;
				System.out.println("este un produs: " + prodN.getCategorProd() + "face parte din categoria produselor " + prodN.getTipProdNealiment());
				
			}
		}	
	}

}
