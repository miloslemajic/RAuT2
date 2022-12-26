package pckt;

public abstract class avion {
    
    private static int count =0;
    private final int ID=count++;
    
    private double tezina;
    
    public avion(double tezina)
    {
        this.tezina=tezina;
    }
    
    
    public double getWeight()
    {
        return tezina;
    }
    
    public int getID()
    {
        return ID;
    }
    
    public abstract char getType();
            
    @Override
    public String toString()
    {
        return getType()+"_"+getID()+" ["+getWeight()+"]";
    }
            
}           