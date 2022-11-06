package oop;

public class Rezervoar {
	
	double gorivo; //pritisak

	  public Rezervoar() {
	    gorivo = 60;
	  }

	  public void potrosi(double g) {
	    gorivo -= g;
	  }

	  public void natoci() {
	    gorivo = 60;
	  }

	  @Override
	  public String toString() {
	    return "R: " + gorivo;
	  }

	  @Override
	  public void finalize() {
	    System.out.println("Finalize: Gorivo");
	  }

}
