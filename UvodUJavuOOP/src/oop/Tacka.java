package oop;

class Tacka {
	double x;
    double y;
    
    public Tacka(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Tacka() {
        x = 0.;
        y = 0.;
    }
    
    public double dist(Tacka t) {
        return Math.sqrt((t.x - x)*(t.x - x) + (t.y - y)*(t.y - y));
    }


}
