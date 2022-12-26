package pkt;

public class Automobil extends Vozilo {
	
	
	private String model;
	private int predjena_kilometraza;
	private int vpnp;

	public Automobil(int godiste, int cena, 
					String model, int predjena_kilometraza, int vpnp) {
		super(godiste, cena);
		this.model = model;
		this.predjena_kilometraza = predjena_kilometraza;
		this.vpnp = vpnp;
	}
	
	@Override 
    public char getType()
    {
        return 'A';
    }
	
	public int getTime() {
		return vpnp;
	}

	@Override 
	public String toString() {
		return super.toString() + " " + model + " " + predjena_kilometraza + " " + vpnp ;
	} 
	
    
}
