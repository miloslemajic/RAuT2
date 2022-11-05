package stringovi;

public class Zad02 {

	public static void main(String[] args) {
		
		String a = " ovo je teskt 6 zadatka ";
		System.out.println(a);
		
		a = a.trim();
		System.out.println(a);
		
		String podstring;
		podstring = a.substring(4);
		System.out.println("podstring1: " + podstring);
		podstring = a.substring(4,9);
		System.out.println("podstring2: " + podstring);
	}

}
