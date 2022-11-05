package stringovi;

public class Zad01 {

	public static void main(String[] args) {
		String a = "Ovo je teskt ";
		System.out.println(a);
		
		String b = a + 5 + " zadatka";
		System.out.println(b);
		
		System.out.println("broj elemenata stringa je: " + a.length());
		
		System.out.println("prvi karakter: " + a.charAt(0));
		System.out.println("drugi karakter: " + a.charAt(1));
		System.out.println("poslednji element stringa a je: " + a.charAt(a.length()-1));
		

	}
}
