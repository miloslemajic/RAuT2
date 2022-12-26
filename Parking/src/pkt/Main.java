package pkt;

public class Main {

	public static void main(String[] args) {
		
		Parking p = new Parking(5,100);
		
		Automobil a1 = new Automobil(1995, 800, "lada", 300000, 2);
		Autobus b1 = new Autobus(2010, 30000, 60, 3);
		
		System.out.println(p.Income());
		
		p.Park(a1, 1);
		p.Park(b1, 2);
		p.Park(a1, 0);
		p.Park(a1, 3);
		p.Park(b1, 4);
		
		System.out.println(p);
		
		p.Park(b1, 4);
		
		p.Leave(0);
		p.Park(b1, 0);
		System.out.println(p);
		
		System.out.println(p.Income());
		

	}

}
