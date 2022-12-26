package pckt;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shop p=new Shop();
        
        Memory m1= new Memory("e123", "Intel", 5000., 128);
        Memory m2= new Memory("e124", "Intel", 55000., 1024);
        
        Processor p1=new Processor ("q12", "AMD", 12300.,15, 4 );
        Processor p2=new Processor ("q123", "AMD", 15300.,15, 8 );
        
        p.aadd(p2);
        p.aadd(p1);
        p.aadd(m1);
        p.aadd(m2);
        
        p.ispis();
        
        System.out.println(p.left());
        
        p.sale(p2);
        
        p.ispis();
        
        System.out.println(p.left());
	}

}
