package pckt;

public class putnicki extends avion {
    
    private int kapacitet;
    private final int tezina_putnika=80;
    private final int tezina_kofera=30;
    
    public putnicki (double tezina, int kapacitet)
    {
        super(tezina);
        this.kapacitet=kapacitet;
    }
    
    @Override
    public char getType()
    {
        return 'P';
    }
    
    @Override
    public double getWeight()
    {
        
        return (tezina_putnika+tezina_kofera)*kapacitet+super.getWeight();
        
        
        
    }
    
}
