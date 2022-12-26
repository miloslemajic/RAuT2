package pkt;

public abstract class proizvod {
    private static int countID=0;
    private final int ID=countID++;
    private double price;
    
    public proizvod (double price)
    {
        this.price=price;
    }
    
    public abstract double zapremina();
    public abstract char getType();
    public double getPrice()
    {
        return price;
    }
    public int getID()
    {
        return ID;
    }
    @Override
    public String toString()
    {
        return getType()+" , "+getID();
    }
            
    
}