package pckt;

public class aerodrom {

    private avion terminali[];
    private double max_tezina;
    private double tax;
    private int max_br_mesta;
    
    public aerodrom (int max_br_mesta, double max_tezina, double tax)
    {
        this.max_tezina=max_tezina;
        this.max_br_mesta=max_br_mesta;
        this.tax=tax;
        terminali=new avion [max_br_mesta];
    }
    
    public boolean getFlightPermission(avion a, int i)
    {
        if(max_tezina<a.getWeight() || terminali[i]!=null)
        {
            System.out.println("Avion odbijen");
            return false;
        }
        terminali[i]=a;
        System.out.println("Dopusteno sletanje");
        return true;
        
        
          
    }
    
    
    
    
    public boolean takeOff(int i)
    {
        if(i<0 || i>terminali.length)
        {
            System.out.println("Nemoguce poletanje");
            return false;
        }
        
        if (terminali[i]==null)
        {
            return false;
        }
        
        terminali[i]=null;
        System.out.println("Dozvoljeno poletanje");
        return true;
        
     }
    
    
    public double income()        
    {
        double zarada=0;
        
        for (int i=0; i<max_br_mesta; i++)
        {
            if(terminali[i]!=null)
            {
                zarada+=terminali[i].getWeight()*tax;
            }
        }
        return zarada;
        
        
        
        
        
        
        
        
        
        
    }
    
    
    @Override
    
    public String toString()
    {
        StringBuilder s= new StringBuilder();
        
        for (int i=0; i<max_br_mesta; i++)
        {
        s.append("Terminal "+(i+1)+": ")
        .append((terminali[i]!=null)? terminali[i]:"<<empty>>")
        .append("\n");
                
                
                
                
                
                
    }
        
        
        return s.toString();
        
        
        
        
    }
}
