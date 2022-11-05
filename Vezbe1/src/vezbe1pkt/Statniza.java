package vezbe1pkt;
import java.io.*;
import java.util.Scanner;

public class Statniza {
	
	
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
				System.out.println("GRESKA - Uneta vrednost nije jedna od opcija!");
			}
		sc.nextLine();
		}while(notRead);
	return ceoBroj;
		}
	
	static int [] KreirajNiz(Scanner sc) {
		int niz[] = null;
		System.out.print("Unesi duzinu niza: ");
		int duzina = UnesiBroj(sc);
		niz = new int [duzina];
		for(int i = 0; i<duzina; i++) {
			System.out.println("Unesi vrednost: " + (i+1) + " elementa");
			niz[i] = UnesiBroj(sc);
		}
	return niz;
	}
	
	static void IspisiNiz(int niz[]) {
		for (int i=0;i<niz.length;i++) {
			System.out.print(niz[i] + " ");
		}
	}
	
	static double SrednjaVrednost(int niz[]) {
		double srvr=0;
		for (int i = 0; i<niz.length;i++) {
			srvr += niz[i];
		}
		
	return srvr=srvr/niz.length;
	}
	
	static double StandardnaDevijacija(int niz[]) {
		double stdev=0;
		for (int i = 0; i<niz.length; i++) {
			stdev = niz[i] - SrednjaVrednost(niz);
		}
		stdev = (Math.pow(stdev, 2))/(niz.length-1);
	return Math.sqrt(stdev);
	}
	
	static int MaksimumNiza(int niz[]) {
		int max=niz[0];
			for (int i=0; i<niz.length;i++) {
				if (max > niz[i]) {}
				else max = niz[i];
			}
	return max;
	}
	
	static int MinimumNiza(int niz[]) {
		int min = niz[0];
		for (int i=0; i<niz.length;i++) {
			if (min < niz[i]) {}
			else min = niz[i];
		}
	return min;
	}

	public static void main(String[] args) throws IOException {
		
		var sc = new Scanner(System.in);
		int niz[]= null;
		double srvr,stdev;
		int min, max, opcija;
		
		System.out.println("Program za statisticku obradu podataka\n\n"
				+ "	Opcija broj 1 - Kreiraj niz celih brojeva\n"
				+ "	Opcija broj 2 - Ispisi niz brojeva\n"
				+ "	Opcija broj 3 - Izracunaj srednju vrednost niza\n"
				+ "	Opcija broj 4 - Izracunaj standardnu devijaciju niza\n"
				+ "	Opcija broj 5 - izracunaj minimalan element\n"
				+ "	Opcija broj 6 - Izracunaj maksimalan element\n"
				+ "	Opcija broj 0 - IZLAZ IZ PROGRAMA\n\n"
				+ "Unesi broj opcije: ");
		do {
		
			opcija = UnesiBroj(sc);
		
			switch (opcija) {
				case (0): {
					System.out.println("Izlaz!\n");
					break;
				}
				case (1):{
					niz=KreirajNiz(sc);
					System.out.println("\nIzaberi opciju: ");
					break;
				}
				
				case (2):{
					if (niz==null) {
						System.out.println("Niz nije kreiran!\nIzaberi opciju: ");
						break;
						}
					else
						System.out.printf("Niz: ");
						IspisiNiz(niz);
						System.out.println("\nIzaberi opciju: ");
					break;
				}
				
				case (3):{
					if (niz==null) {
						System.out.println("Niz nije kreiran!\nIzaberi opciju: ");
						break;
						}
					else
						srvr = SrednjaVrednost(niz);
						System.out.print("Srednja vrednost je: " + srvr + "\nIzaberi opciju: ");
					break;
				}
				
				case (4):{
					if (niz==null) {
						System.out.println("Niz nije kreiran!\nIzaberi opciju: ");
						break;
						}
					else
						stdev = StandardnaDevijacija(niz);
						System.out.println("Standardna devijacija je: " + stdev + "\nIzaberi opciju: ");
					break;

				}
				
				case (5):{
					if (niz==null) {
						System.out.println("Niz nije kreiran!\nIzaberi opciju: ");
						break;
						}
					else
						min = MinimumNiza(niz);
						System.out.println("Minimum niza je: " + min  + "\nIzaberi opciju: ");
					break;
				}
				
				case (6):{
					if (niz==null) {
						System.out.println("Niz nije kreiran!\nIzaberi opciju: ");
						break;
						}
					else
						max = MaksimumNiza(niz);
					System.out.println("Maksimum niza je: " + max + "\nIzaberi opciju: ");
					break;
				}
				
				default:{
					if (niz==null) 
						System.out.println("Niz nije kreiran! \nIzaberi opciju: ");
						break;

				}
			}
		}while (opcija!=0);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
