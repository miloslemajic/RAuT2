package pkt;

public class Poreska {
    
    private Nekretnina lista[];
    private int broj_zaposlenih;
    private int max_br_nekretnina;
    
    public Poreska (int max_br_nekretnina, int broj_zaposlenih) {
        
    	this.max_br_nekretnina = max_br_nekretnina;
    	this.broj_zaposlenih = broj_zaposlenih;
    	lista = new Nekretnina[max_br_nekretnina];
    }
    
    
    
    //• Dodavanje nove nekretnine, ako postoji slobodno mesto 
        public boolean Dodaj(Nekretnina n, int i){
            if(lista[i]!=null)
            {
                System.out.println("Lista nekretnina je popunjena.");
                return false;
            }
            lista[i]=n;
            System.out.println("Nekretnina dodata na listu.");
            return true;
        }
        
        
        
    //•  Rušenje postojeće nekretnine (uklanjanje sa liste) 
        public boolean Izbaci(int i) {
			if (lista[i]!=null)
				lista[i]=null;
            System.out.println("Nekretnina je izbacena");
            return true;
        }
        
        //• Računanje ukupnog prihoda (zbir poreskih taksi svih nekretnina u listi) 
        public double Income() {
            double zarada=0;
            for (int i=0; i<max_br_nekretnina; i++){
                if (lista[i]!=null)
                    zarada+=lista[i].getTax();
            }
            return zarada;
        }
        
        
        
    //• Ispis podataka o svim nekretninama u listi 
        @Override
        public String toString()
        {
            StringBuilder s= new StringBuilder();

            for (int i=0; i<max_br_nekretnina; i++)
            {
            s.append("Nekretnina "+(i+1)+": ")
            .append((lista[i]!=null)? lista[i]:"<<empty>>")
            .append("\n");  
            }
            return s.toString();
        }
    
    
    
}