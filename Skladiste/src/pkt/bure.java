package pkt;

public class bure extends proizvod{
    double r,h;
    
    public bure (double price, double r, double h)
    {
        super (price);
        this.h=h;
        this.r=r;
    }
    
    @Override
    public char getType()
    {
        return 'B';
    }
    
    @Override
    public double zapremina()
    {
        return r*r*3.14*h;
    }
    
    @Override
    public String toString()
    {
        return super.toString()+" ("+r+","+h+") "+super.getPrice();
    }
}
