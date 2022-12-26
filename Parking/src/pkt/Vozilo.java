package pkt;

public abstract class Vozilo {
	
	private static int count = 0;
	private final int ID = count++;
	private int cena;
	private int godiste;
	
	public Vozilo(int godiste, int cena) {
		this.cena = cena;
		this.godiste = godiste;
	}
	
	public  int getYear() {
		return godiste;
	}
	
	public double getPrice() {
		return cena;
	}
	public abstract char getType();
	public int getID() {
		return ID;
	}
	public abstract int getTime();
	
	@Override 
	public String toString() {
		return getType() + "_" + getID() + " [" + godiste + "], [" + cena + "]" ;
	}
}
