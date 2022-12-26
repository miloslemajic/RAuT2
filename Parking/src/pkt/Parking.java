package pkt;

public class Parking {
	
	private Vozilo mesta[];
    private double tax;
    private int max_br_mesta;
    
    public Parking (int max_br_mesta, double tax) {
    	this.max_br_mesta = max_br_mesta;
    	this.tax = tax;
    	mesta = new Vozilo[max_br_mesta];
    }
	
	//• Parkiranje novog vozila (ako postoji slobodno mesto)
    public boolean Park(Vozilo v, int i) {
    	if(mesta[i]!=null)
        {
            System.out.println("Parking je pun!");
            return false;
        }
        mesta[i]=v;
        System.out.println("Uparkiraj");
        return true;
    }
	//• Izlaz vozila sa parkinga (uklanjanje sa parkinga)
    public boolean Leave(int i) {
    	mesta[i]=null;
        System.out.println("Isparkiraj");
        return true;
    }
	//• Prikaz zarade, koja se računa po formuli: cena jednog sata*vreme provedeno na parkingu
    public double Income() {
    	double zarada=0;
        
        for (int i=0; i<max_br_mesta; i++){
            if(mesta[i]!=null){
            	if (mesta[i].getType() == 'A')
            		zarada+=mesta[i].getTime()*tax;
            	else
            		zarada+=mesta[i].getTime()*(tax*1.3);
            }
        }
        return zarada;
    }
	//• Prikaz broja slobodnih mesta
    public int Free() {
    	int brojac = 0;
    	for (int i=0; i<max_br_mesta; i++){
    		if (mesta[i]==null) brojac++;
    	}
    	return brojac;
    }
	//• Prikaz broja trenutno zauzetih parking mesta
    public int Taken() {
    	int brojac = 0;
    	for (int i=0; i<max_br_mesta; i++){
    		if (mesta[i]!=null) brojac++;
    	}
    	return brojac;
    	
    }
	//• Ispis podataka o svim vozilima na parkingu
    @Override
    public String toString()
    {
        StringBuilder s= new StringBuilder();
        
        for (int i=0; i<max_br_mesta; i++)
        {
        s.append("Mesto "+(i+1)+": ")
        .append((mesta[i]!=null)? mesta[i]:"<<empty>>")
        .append("\n");  
        }
        return s.toString();
    }
	
}
