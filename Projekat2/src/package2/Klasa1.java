package package2;
//import java.io.File;
import java.io.*;
import java.util.Scanner;

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
		
		var in = new Scanner(System.in);
		System.out.print("unesi ceo broj: ");
		var x = in.nextInt();
		System.out.println(x+7);
		System.out.print("unesi realan broj: ");
		var y = in.nextFloat();
		System.out.println(y+7);
	}

}
