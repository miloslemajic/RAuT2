package oop;

class Krug {
Tacka c;
double r;
    
    public Krug(double rr) {
        r = rr;
        c = new Tacka();
	    this.r = r;
    }
    
	  public Krug(double r, Tacka t) {
		    this.r = r;
		    c = t;
	  }
    
    public double povrsina() {
        return r * r * Math.PI;
    }
    
    public double obim() {
        return 2 * r * Math.PI;
    }
    
	  boolean isInside(Tacka t) {
		    return c.dist(t) < r;
		  }
}