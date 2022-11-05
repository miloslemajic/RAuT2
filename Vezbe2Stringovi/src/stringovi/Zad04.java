package stringovi;

import java.util.Arrays;

public class Zad04 {

	public static void main(String[] args) {
	//Definisanje promenljive tipa string	
			String a = "Tekst koji se sastoji od 7 reci";
			System.out.println(a);

			//deljenje stinga na podstringove
			//prikazati sve reci iz kojih se sastoji string a
			String [] reci = a.split(" ");
			System.out.println("String a se sa stoji od " + reci.length + " reci");
			
			for(int i = 0; i < reci.length; i++ )
				System.out.println((i+1) + " rec u stringu a je: " + reci[i] );	

			String stringBrojeva = "14;2;-3;5";
			String [] brojevi = stringBrojeva.split(";");
			System.out.println("String a se sa stoji od " + brojevi.length + " brojeva");
			
			for(int i = 0; i < brojevi.length; i++ )
				System.out.println((i+1) + " broj u stringu stringBrojeva je: " + brojevi[i] );	
			
			//zadatak4
			String B="4,3,2,1;0,1,0;1,2,3,4";

			String[] red = B.split(";");

			//broj kolona
			int kolona = red[0].split(",").length;

			String[][] matrica = new String[red.length][kolona];

			for (int i = 0; i < red.length; i++) {
			    matrica[i] = red[i].split(",");
			}
			
			System.out.println(Arrays.deepToString(matrica));
			
			int [][] c = {{1,2,3},{4,5,6},{7,8,9}};
			System.out.println(Arrays.deepToString(c));
	}

}
