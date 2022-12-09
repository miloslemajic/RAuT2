package pckt;

public class LinearSearch {
	static int linearSearch(int[] niz, int d, int g, int x) {
	    if(d < g) {
	        if(niz[d] == x)
	            return d;
	        else
	            return linearSearch(niz, d+1, g, x);
	    }
	    return -1;
	}

}
