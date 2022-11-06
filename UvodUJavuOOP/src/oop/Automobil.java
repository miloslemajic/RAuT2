package oop;

class Automobil {
	Tocak tockovi[];
	Rezervoar rezervoar;
	
	public Automobil() {
	    tockovi = new Tocak[4];
	    rezervoar = new Rezervoar();
	    for(int i = 0; i < tockovi.length; ++i)
	      tockovi[i] = new Tocak();
	  }

	  public void vozi(double km) {
	    if(km > 500) {
	      for(int i = 0; i < tockovi.length; ++i) 
	        tockovi[i].pusti(1);
	        rezervoar.potrosi(30);
	      return;
	      
	    }
	    if(km > 250) {
	      for(int i = 0; i < tockovi.length; ++i) 
	        tockovi[i].pusti(0.5);
	      	rezervoar.potrosi(15);
	      return;
	      
	    }
	    if(km > 100) {
	      for(int i = 0; i < tockovi.length; ++i) 
	        tockovi[i].pusti(0.3);
	      	rezervoar.potrosi(9);
	      
	    }
	    else {
	      for(int i = 0; i < tockovi.length; ++i) 
	        tockovi[i].pusti(0.1);
	      	rezervoar.potrosi(3);
	      
	    }
	  }
	    
	 
	      
	  

	  @Override 
	  public String toString() {
	    String r = "A(";
	    for(int i = 0; i < tockovi.length; ++i)
	      r += (tockovi[i] + " ");
	    return r + ")" + "(" + rezervoar + " )";
	  }
	  
	  

	  @Override 
	  public void finalize() {
	    System.out.println("Finalize: Auto");
	  }


}
