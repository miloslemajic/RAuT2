package stringovi;


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
			
	}

}
