package nzdpaket;

import java.util.Scanner;


public class NzdResenje {
	
	static int NZDeuklidRek(int a, int b) {
		int r=a%b;
		if (r==0)
			return b;
		else
			return NZDeuklidRek(b,r);
	}
	
	static int  NZDeuklidite(int x, int y) {
		int a=(x>y)?x:y;
		int b=(x<y)?x:y;
		int temp;
		
		while(b!=0) {
			temp=a;
			a=b;
			b=temp%b;
		}
	return a;}
	
	//stejnova metoda ite
	static int NZDstejnIte(int a, int b)
    {
        if (a == 0)
            return b;
        if (b == 0)
            return a;
 
        int k;
        for (k = 0; ((a | b) & 1) == 0; ++k)
        {
            a >>= 1;
            b >>= 1;
        }
 
        while ((a & 1) == 0)
            a >>= 1;
 
        do
        {

            while ((b & 1) == 0)
                b >>= 1;
 
            if (a > b)
            {
                int temp = a;
                a = b;
                b = temp;
            }
 
            b = (b - a);
        } while (b != 0);
 
        return a << k;
    }
	
	static int NZDstejnRek(int a, int b){
		 if (a == b)
	         return a;
	
	     // GCD(0, b) == b; GCD(a, 0) == a,
	     // GCD(0, 0) == 0
	     if (a == 0)
	         return b;
	     if (b == 0)
	         return a;
	
	     // look for factors of 2
	     if ((~a & 1) == 1) // a is even
	     {
	         if ((b & 1) == 1) // b is odd
	             return NZDstejnRek(a >> 1, b);
	
	         else // both a and b are even
	             return NZDstejnRek(a >> 1, b >> 1) << 1;
	     }
	
	     // a is odd, b is even
	     if ((~b & 1) == 1)
	         return NZDstejnRek(a, b >> 1);
	
	     // reduce larger number
	     if (a > b)
	         return NZDstejnRek((a - b) >> 1, b);
	
	     return NZDstejnRek((b - a) >> 1, a);
	 }


	
	public static void main(String[] args) {
		
		var in = new Scanner(System.in);
		int x,y,NZD0=0,NZD1=0,NZD2=0,NZD3=0;
		
		System.out.println("Unesi broj x: ");
		x = in.nextInt();
		System.out.println("\nUnesi broj y: ");
		y = in.nextInt();
		
		
		//euklid iterativno
		long startTime0 = System.currentTimeMillis();
	      for(int i = 0; i < 50000; i++) {
	    	  
	    	  
	    	  NZD0 = NZDeuklidite(x,y);
	      }
	      long endTime0 = System.currentTimeMillis();
	      System.out.println("Vreme potrebno za racunanje NZD=" + NZD0 + "," 
	         + " Euklidovom metodom - iterativno : "+ (endTime0 - startTime0) 
	         + " milli seconds" );  
		   
	      //euklid rekurzivno
	      long startTime1 = System.currentTimeMillis();
	      for(int i = 0; i < 50000; i++) {

	        	 NZD1=NZDeuklidRek(x,y);
	         }
	      
	      
	      long endTime1 = System.currentTimeMillis();
	      System.out.println("Vreme potrebno za racunanje NZD=" + NZD1 + "," 
	    	         + " Euklidovom metodom - rekurzivno : "+ (endTime1 - startTime1) 
	    	         + " milli seconds" );
		
	      //binarno iterativno
	      long startTime2 = System.currentTimeMillis();
	      for(int i = 0; i < 50000; i++) {
	    	  
	    	  NZD2 = NZDstejnIte(x,y);
	    	
	      }
	      long endTime2 = System.currentTimeMillis();
	      System.out.println("Vreme potrebno za racunanje NZD=" + NZD2 + "," 
	    	         + " Stejnovom metodom - iterativno : "+ (endTime2 - startTime2) 
	    	         + " milli seconds" );
	      
	      //stejn rekurzivno
	      long startTime3 = System.currentTimeMillis();
	      for(int i = 0; i < 50000; i++) {
	    	  
	    	  NZD3 = NZDstejnRek(x,y);
	      }
	      long endTime3 = System.currentTimeMillis();
	      System.out.println("Vreme potrebno za racunanje NZD=" + NZD3 + "," 
	    	         + " Stejnovom metodom - rekurzivno : "+ (endTime3 - startTime3) 
	    	         + " milli seconds" );
	      
		
		
	}
}
