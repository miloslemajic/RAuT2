package package2;
//import java.io.File;
import java.io.*;

public class Klasa1 {

	public static void main(String[] args) {
		
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
		
		/*var in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unos sa tastature: ");
		String x = in.readLine();
		System.out.printf("Ime: %s\n",x);*/
	}

}
