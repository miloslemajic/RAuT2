package package2;
//import java.io.File;
import java.io.*;
import java.util.Scanner;


public class Klasa1 {

	public static void main(String[] args) throws IOException {
		
		//variable
			boolean a=true;
			char b='a';
			byte c=0b100011;
			short d=0123;
			int e=0xFF;
			long f = 1000412;
			float g = 3.51525f;
			double h = 3.1151512;
			String s = "sin je bio ovde";
		
			System.out.print("Boolean: ");
			System.out.print(a);
			System.out.printf("\nchar ce biti ispisan: %c\n",b);
			System.out.println("celobrojne vrednosti: " + c + " " + d + " " + e + " " + f);
			System.out.printf("ostali ce biti ispisani: %.2f , %.4f, %s\n",g,h,s);
			System.out.println("nova linijaa\n");
		
		/*upis zahteva java.io.* i java.util.Scanner*/
			var in = new Scanner(System.in);
			/*var in1 = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("unesi ceo broj: ");
			var x = in.nextInt();
			System.out.println(x+7);
			System.out.print("unesi realan broj: ");
			var y = in.nextFloat();
			System.out.println(y+7);
			System.out.print("unesi tekst: ");
			var z = in1.readLine();
			System.out.printf("tekst: " + z);*/
		
		//nizovi
			int niz1[] = {1,2,3,4,5};
			
			for (var i = 0; i<niz1.length; ++i)
				System.out.print(niz1[i] + " ");
			
			System.out.println(niz1 + "\n");
			
			int niz2[][] = {{1, 0, 0, 1}, {1,0,1,1}}; 
				for (var xx : niz2) {
					for (var yy:xx) {
						System.out.print(yy + " ");
					}
					System.out.println();
				}
		//stringovi
			
			String str1 = "Lorem ipsum dolor sit amet";
				var str2 = (str1.length());
				var str3 = str1.substring(0,10);
				var str4 = str1.substring(10).toUpperCase();
				var str5 = str1.split("o");
				
			System.out.println("\n" + str2 + "\n" + str3 +  str4 + "\n" + str5 +"\n");
		
		//klase
			
			class Kvadrat{
				double stranicaA, stranicaB;
				
				public Kvadrat(double A, double B) {
					stranicaA = A;
					stranicaB = B;
				}
				public double povrsina() {
					return stranicaA * stranicaB;
				}
				public double obim() {
					return stranicaA*2+stranicaB*2;
				}
			}
		//nova klasa
			class Krug {
				double poluprecnik;
				
				public Krug(double r) {
					poluprecnik = r;
				}
				
				public double obim(){
					return 2*poluprecnik * Math.PI;
				}
				public double povrsina(){
					return poluprecnik*poluprecnik * Math.PI;
				}
			}
		//unos parametara
			System.out.println("uneti poluprecnik kruga: ");
			double parR = in.nextInt();
			System.out.println("uneti stranice pravugaonika, A i B: ");
			double parA = in.nextInt();
			double parB = in.nextInt();
		//kreiranje objekta
		   //klasa  ime objekta		= new prosledjivanje parametara
			Kvadrat kvadratobjekat = new Kvadrat(parA,parB);
			Krug krugobjekat = new Krug(parR);
			
		//pozivanje fukcije
			var povrsinakvadrata = kvadratobjekat.povrsina();
			var obimkvadrata = kvadratobjekat.obim();
			var povrsinakruga = krugobjekat.povrsina();
			var obimkruga = krugobjekat.obim();
			
			if (povrsinakvadrata > obimkvadrata)
				System.out.println("jeste!\n");
			else
				System.out.println("nije!\n");
			
			System.out.printf("razlika povrsina je: %.5f \nzbir obima je: %.5f",
					povrsinakvadrata-povrsinakruga, obimkvadrata+obimkruga );
			 //komentar2
	
			
	}
}

