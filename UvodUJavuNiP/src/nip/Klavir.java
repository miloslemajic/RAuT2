package nip;

class Klavir extends Instrument {
	
	public Klavir() {
        super("Klavir");
    }
    
    @Override 
    public void sviraj() {
        System.out.println("Klavir svira ... ");
    }
}
