package pkt;

public abstract class Nekretnina {
    

    private static int count = 0;
    private final int ID = count++;
    private String lokacija;
    private int kupovna_cena;
    
    public Nekretnina(String lokacija, int kupovna_cena){
        this.lokacija = lokacija;
        this.kupovna_cena = kupovna_cena;
    }
    
    public abstract char getType();
    
    public int getID() {
            return ID;
    }
    
    public int getCena(){
        return kupovna_cena;
    }
    
    public abstract double getTax();
    
    @Override 
	public String toString() {
            return getType() + "_" + getID() + " [" + lokacija + "], [" + kupovna_cena + "]" ;
	}
    
}
