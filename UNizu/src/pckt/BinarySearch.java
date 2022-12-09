package pckt;

public class BinarySearch {
	static int binarySearch(int[] niz, int d, int g, int x) {
	    if(g < d) {
	        var m = d + (g - d) / 2;
	        
	        if(niz[m] == x)
	            return m;
	            
	        if(niz[m] > x) {
	            return binarySearch(niz, d, m, x);
	        }
	        if(niz[m] < x) {
	            return binarySearch(niz, m, g, x);
	        }
	    }
	    return -1;
	}
}
