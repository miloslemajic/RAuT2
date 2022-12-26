package pkt;

public class main {

	public static void main(String[] args) {
		

bure b1=new bure(2000, 1,1);
        
        
        
        sanduk s1=new sanduk(5000,1,2,3);
        
        
        skladiste s = new skladiste(60, 3); 
        
        s.add(s1);
        System.out.println(s.trenutna_zapremina());
        System.out.println(s.zarada());
        System.out.println(s.zarada());
        System.out.println(s.preostala_zapremina());
        System.out.println(s.maxBrProizvoda());
        System.out.println(s.trenutna());
        s.ispis();
        
        s.add(b1);
        System.out.println(s.trenutna_zapremina());
        System.out.println(s.zarada());
        System.out.println(s.zarada());
        System.out.println(s.preostala_zapremina());
        System.out.println(s.maxBrProizvoda());
        System.out.println(s.trenutna());
        s.ispis();
        
        bure b2 = new bure(1000,2,3);
        s.add(b2);
        s.ispis();
        
        bure b3 = new bure(1000,1,1);
        s.add(b3);
    }
    
}
