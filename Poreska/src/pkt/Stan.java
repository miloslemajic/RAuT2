package pkt;

public class Stan extends Nekretnina{
	   /* kvadraturi, 
	    broju soba, 
	    spratu na kom se nalazi 
	    kategoriji poreske takse po kvadratnom metru.*/
	    
	private int kvadratura;
	private int broj_soba;
	private int broj_sprata;


	 public Stan (String lokacija, int kupovna_cena, int kvadratura, 
	                int broj_soba, int broj_sprata){
	         super(lokacija,kupovna_cena);
	         this.kvadratura = kvadratura;
	         this.broj_soba = broj_soba;
	         this.broj_sprata = broj_sprata;
	     }

	 @Override
	  public char getType(){
	        return 'S';
	    }
	  
	  @Override
	  public double getTax(){
	      if (broj_soba <= 3)
	        return (kvadratura * 1000 + 0.05*super.getCena());
	      else
	         return (kvadratura * 850 + 0.05*super.getCena());

	  }
	  
	  @Override 
	    public String toString() {
	            return super.toString() + ", " + kvadratura + ", " + broj_soba + ", " + broj_sprata ;
	    } 
	}

