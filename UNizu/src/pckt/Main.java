package pckt;

public class Main {

	public static void main(String[] args) {
		int[] niz1 = {1, 2, 7, 8, 9, 3, 5, 6, 0, 4};
		var x1 = LinearSearch.linearSearch(niz1, 0, niz1.length, 5);
		System.out.println(x1);
		
		int[] niz2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		var x2 = BinarySearch.binarySearch(niz2,0,niz2.length, 10);
		System.out.println(x2);

	}

}
