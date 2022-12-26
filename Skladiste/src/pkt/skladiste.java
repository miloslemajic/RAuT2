package pkt;
import java.util.ArrayList;

public class skladiste {
    
    ArrayList<proizvod> Skladiste;
    private final double max_zapremina;
    private final int kapacitet;
    
    double trenutnaV;
    
    public skladiste(double max_zapremina, int kapacitet)
    {
        this.max_zapremina=max_zapremina;
        this.kapacitet=kapacitet;
        Skladiste = new ArrayList();
        trenutnaV=0;
    }
    
    
    public void add(proizvod p)
    {
        if((Skladiste.size()<kapacitet) && (trenutnaV+p.zapremina()<max_zapremina))
        {
            Skladiste.add(p);
            trenutnaV+=p.zapremina();
        }
        else
            System.out.println("Skladiste je puno");
    }
    
    public int brojProizvoda()
    {
        return Skladiste.size();
    }
    
    public int maxBrProizvoda()
    {
        return kapacitet;
    }
    
    
    public double trenutna_zapremina()
    {
        return trenutnaV;
    }
    
    
    public double trenutna()
    {
        double V=0;
        for (proizvod p:Skladiste)
        {
            V+=p.zapremina();
        }
        return V;
    }
    
    public double preostala_zapremina()
            {
                return max_zapremina-trenutnaV;
            }
    
    
    public double zarada()
    {
        double income=0;
        for (proizvod p:Skladiste)
        {
            income+=p.getPrice()*0.2;
        }
        return income;
    }
    
    public void ispis()
    {
        for (proizvod p:Skladiste)
        {
            System.out.println(p);
        }
    }
    
    public void remove(int i)
    {
        if(i>-1 && i<Skladiste.size())
        {
            Skladiste.remove(i);
        }
        else
            System.out.println("Ne postoji");
    }
    
    
    
}
