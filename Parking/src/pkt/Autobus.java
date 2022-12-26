package pkt;

public class Autobus extends Vozilo {

	
	private int brojSedista;
	private int vpnp;

	public Autobus(int godiste, int cena,  int brojSedista, int vpnp) {
		super(godiste, cena);
		this.brojSedista = brojSedista;
		this.vpnp = vpnp;
	}
	
	@Override 
    public char getType()
    {
        return 'B';
    }
	
	public int getTime() {
		return vpnp;
	}
    
	@Override 
	public String toString() {
		return super.toString() + " " + brojSedista + " " + vpnp ;
	} 

	
}
