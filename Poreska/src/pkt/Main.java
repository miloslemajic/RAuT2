package pkt;

public class Main {
    public static void main(String[] args) {
        Poreska p = new Poreska(5,2);
        Kuca k1 = new Kuca("Novo Naselje", 200000, 108, 201,2,950,400);
        Stan s1 = new Stan("Grbavica",130000,57,2,7);
        Stan s2 = new Stan("Liman 5",88888,88,8,8);

        System.out.println (p.Income());

        p.Dodaj(k1, 1);
        p.Dodaj(k1, 2);
        p.Dodaj(s1, 0);
        p.Dodaj(s1, 3);
        p.Dodaj(s2, 4);
    
        System.out.println(p);
        System.out.println ("Zarada: " + p.Income());
    
        p.Dodaj(k1, 4);
        
        p.Izbaci(2);
        
        p.Dodaj(s2,2);
        
        System.out.println(p);
        System.out.println ("Zarada: " + p.Income());
    }
}
