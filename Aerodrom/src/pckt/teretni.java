package pckt;

public class teretni extends avion {
    
    private double nosivost;
    
    public teretni (double tezina, double nosivost)
    {
        super (tezina);
        this.nosivost=nosivost;
    }
    
    @Override 
    public char getType()
    {
        return 'T';
    }
    
    @Override
    public double getWeight()
    {
        return nosivost+super.getWeight();
    }
            
            
            
            
            
            
            
    
}
