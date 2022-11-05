package stringovi;

public class Zad05 {

	public static void main(String[] args) {
		
		//Sadrzaj txt fajla koji cuva podatke o studentima i njihovim ocenama
		//pretpostavka je da svaki student ima 4 ocene
				String tekstIzFajla = "Petar Petrovic|e10001|Novi Sad|10;9;8;9\n" +
						"Marko Markovic|e10002|Loznica|7;9;8;10\n" +
						"Dejan Dejanovic|e10003|Indjija|8;7;6;8\n";
				
				String [] studentiAllInfo = tekstIzFajla.split("\\n");
				
//				definisanje odgovarajucih struktura 
				String [] imenaSt = new String [studentiAllInfo.length];
				String [] gradoviSt = new String [studentiAllInfo.length];
				String [] indeksiSt = new String [studentiAllInfo.length];
				String [] [] oceneSt = new String [studentiAllInfo.length] [4];
				
//				popunjavanje podataka
				for (int i = 0; i < studentiAllInfo.length; i++) {
					String [] infoSt = studentiAllInfo[i].split("\\|");
					imenaSt[i]		= infoSt[0];
					indeksiSt[i] 	= infoSt[1];
					gradoviSt[i] 	= infoSt[2];
					oceneSt[i] 		= infoSt[3].split(";");
				}
				
				//definisanje izgleda menija
				System.out.println("Studentska Sluzba - Odaberi opciju:");
				System.out.println("\t1.Ispis imena svih studenata");
				System.out.println("\t2.Ispis podataka o studentu");
				System.out.println("\t3.Ispis ocena studenta");
				System.out.println("\t3.Izlaz iz programa");
				
				//ispisivanje podataka u odnosu na odluku
				int odluka = 2;
				int n = 0;
				System.out.println("Odluka je:"+odluka);
				switch (odluka) {
					case 1: 
						for (int i = 0; i < imenaSt.length; i++) {
							System.out.println(imenaSt[i]);
						}
						break;
					case 2: 
						System.out.println("Redni broj studenta je:"+n);
						System.out.println("Student:"+imenaSt[n]+" sa indeksom:"+indeksiSt[n]+" je iz grada:"+gradoviSt[n]);
						break;
					case 3:
						System.out.println("Redni broj studenta je:"+n);
						System.out.println("Student:"+imenaSt[n] +" ima ocene:");
						for (int i = 0; i < oceneSt[n].length; i++) {
							System.out.println(oceneSt[n][i]);
						}
						break;
					case 0: 
						System.out.println("Aplikacija izvrzena");
						break;
					default: System.out.println("Nepostojeca komanda");
							break;
				}

		
		
	}

}
