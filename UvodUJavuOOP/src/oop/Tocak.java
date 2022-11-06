package oop;

class Tocak {
	
	double atmosfera; //pritisak

	  public Tocak() {
	    atmosfera = 2;
	  }

	  public void pusti(double v) {
	    atmosfera -= v;
	  }

	  public void napumpaj() {
	    atmosfera = 2;
	  }

	  @Override
	  public String toString() {
	    return "P: " + atmosfera;
	  }

	  @Override
	  public void finalize() {
	    System.out.println("Finalize: Tocak");
	  }


}
