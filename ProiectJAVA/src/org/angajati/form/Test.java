package org.angajati.form;

public class Test {

	public static void main(String[] args) {

		PartTimeAngajat partTimeA = new PartTimeAngajat("Varla", "Ana", "M200001", 6.0, 20.0);
		NormaIntreagaAngajat normaIntereaga = new NormaIntreagaAngajat("Alin", "Alina", "M200001", 3000.0);
		ComisionAngajat comisionaAngajat = new ComisionAngajat("Vara", "Paul", "M200002", 0.08, 300.0);
		SalarPlusComisionAngajat salPlusComA = new SalarPlusComisionAngajat("Diaconu", "Andrei", "M200004", 0.05, 300.0, 4000.0);
		
		System.out.println("Sunt prezentati fiecare angajat in parte:\n");
		System.out.printf("%s\n%s: $%,.2f\n\n", normaIntereaga,"castiga",normaIntereaga.CalcSalar());
		System.out.printf("%s\n%s: $%,.2f\n\n", partTimeA, "castiga", partTimeA.CalcSalar());
		System.out.printf("%s\n%s: $%,.2f\n\n", comisionaAngajat, "castiga", comisionaAngajat.CalcSalar());
		
		
		
		System.out.printf( "%s\n%s: $%,.2f\n\n ",salPlusComA ,"castiga", salPlusComA.CalcSalar());
		
		
		//creem vectorul angajati
		Angajati angajati[] = new Angajati[4];
		angajati[0] = normaIntereaga;
		angajati[1] = partTimeA;
		angajati[2] = comisionaAngajat;
		angajati[3] = salPlusComA;
		
		//parcurgeem fiecare element din vectorul angajati
		System.out.println("angajati:\n");
		for(Angajati angajatCurent: angajati) {
			System.out.println("angajat curent " );
			if(angajatCurent instanceof SalarPlusComisionAngajat) {
				SalarPlusComisionAngajat angajat = ( SalarPlusComisionAngajat ) angajatCurent;
				
				//Double salarOld = angajat.getSalarBaza();
				///angajat.setSalarBaza(1.10 * salarOld);
				System.out.printf("salarul de baza a crescut cu zece procente fiind: $%,.2f\n", angajat.getSalarBaza());
			}
			System.out.printf("castiga $%,.2f\n\n", angajatCurent.CalcSalar());
		}
		
		for(int j = 0; j<angajati.length;j++)
		{
			System.out.printf("angajat %d este %s\n", j + 1,  angajati[j].getNume()+ " " + angajati[j].getPrenume() + " cu marca " + angajati[j].getMarca() + " si castiga " + angajati[j].CalcSalar());
			
		}
		
		//%s\n%s: $%,.2f\n\n

	}

}
