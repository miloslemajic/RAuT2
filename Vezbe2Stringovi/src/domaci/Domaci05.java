package domaci;

import java.util.Scanner;

public class Domaci05 {
	
	static int UnesiBroj(Scanner sc) {
		int ceoBroj = 0;
		boolean notRead=true;
		do
		{
			if(sc.hasNextInt()) {
				ceoBroj=sc.nextInt();
				notRead=false;
			}
			else {
				System.out.println("GRESKA - Uneta vrednost nije jedna od opcija!\nIzaberi opciju: ");
			}
		sc.nextLine();
		}while(notRead);
	return ceoBroj;
		}

	public static void main(String[] args) {
		
		//tekst iz fajla
		String pocetniTekst = "Coko plazma|s01|Bambi|85.30|akcija\nSmoki|s02|Stark|55.00|nije "
				+ "na akciji\nCipsi|s03|Marbo |115.20|nije na akciji\nKrem "
				+ "Bananica| s04|Stark|11.00|akcija\n";
		
		int opcija,podopcija;
		var sc = new Scanner(System.in);
		
		String [] tekstAllInfo = pocetniTekst.split("\\n");
		
		//definisanje odgovarajucih struktura 
			String [] nazivArtikla = new String [tekstAllInfo.length];
			String [] indeksArtikla = new String [tekstAllInfo.length];
			String [] proizvodjacArtikla = new String [tekstAllInfo.length];
			String [] cenaArtikla = new String [tekstAllInfo.length];
			String [] stanjeAkcije = new String [tekstAllInfo.length] ;
		
		//popunjavanje podataka
			for (int i = 0; i < tekstAllInfo.length; i++) {
				String [] infoArtikla = tekstAllInfo[i].split("\\|");
				nazivArtikla[i]		= infoArtikla[0];
				indeksArtikla[i] 	= infoArtikla[1];
				 proizvodjacArtikla[i] 	= infoArtikla[2];
				 cenaArtikla[i] 		= infoArtikla[3];
				 stanjeAkcije[i]		= infoArtikla[4];
			}
			
		
		System.out.println("1 - Spisak nayiva svih artikala\n"
				+ "2 - Podaci zadatog artikla\n"
				+ "3 - Spisak artikala na akciji\n"
				+ "4 - Artikli zadatog proizvodjaca\n"
				+ "...\n"
				+ "0 - Izlaz iz programa!\n\n"
				+ "Unesi broj opcije: ");
		
		do {
			opcija = UnesiBroj(sc);
			
			switch (opcija) {
				
				case 1: {//spisak artikala
					for (int i = 0; i < nazivArtikla.length; i++) {
						System.out.println(nazivArtikla[i]);
					}
				break;
				}
				
				case 2: {//podaci zadatog artikla 
					for (int i = 0; i < nazivArtikla.length; i++) {
						System.out.println((i)+" - "+nazivArtikla[i]);
					}
					System.out.println("Odaberi broj artikla: ");
					
					podopcija = UnesiBroj(sc);
					
					System.out.println("Artikal:"+nazivArtikla[podopcija]+" cena: "+cenaArtikla[podopcija]+
					" dinara, "+stanjeAkcije[podopcija] + "\nUnesi broj opcije: ");
				break;
				}
				
				case 3: {//na akciji
					System.out.println("Proizvodi na akciji:");
					for (int i = 0; i < nazivArtikla.length; i++) {
						if (stanjeAkcije[i].equalsIgnoreCase("akcija"))
							System.out.println(nazivArtikla[i]);
					}
				break;	
				}
				
				case 4: {//artikli proizvodjaca x, izbaciti istog proizvodjaca sa liste?
					for (int i = 0; i < nazivArtikla.length; i++) {
						System.out.println((i)+" - "+proizvodjacArtikla[i]);
					}
					
					System.out.println("\nOdaberi proizvodjaca: ");
					podopcija = UnesiBroj(sc);
					
					System.out.println("Proizvodi " + proizvodjacArtikla[podopcija] + " proizvodjaca:");
					for (int i = 0; i < nazivArtikla.length; i++) {
						if (proizvodjacArtikla[i].equalsIgnoreCase(proizvodjacArtikla[podopcija]))
							System.out.println(nazivArtikla[i]);
					}
				break;
				}
				
				case 0: {
					System.out.println("Izlaz!\n");
				break;
				}
				
				default:{
					System.out.println("GRESKA - Uneta vrednost nije jedna od opcija!\\nIzaberi opciju: ");
				break;
				}
				
			}
		}while(opcija!=0);
		
	}
}
