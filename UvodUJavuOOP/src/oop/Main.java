package oop;

public class Main {

	public static void main(String[] args) {
		
		Krug k1 = new Krug(3);
		System.out.println("P = " + k1.povrsina());
		System.out.println("O = " + k1.obim());

		Tacka t1 = new Tacka(5, 6);
		Tacka t2 = new Tacka(3, 7);
		System.out.println("Tacka: " + t1.dist(t2));
		
		Krug k2 = new Krug(1, t1);
		boolean b = k2.isInside(t2);
		System.out.println(b);
		

		int niz[] = new int[5];
		for(var n : niz)
		    n = 5;
		for(var n : niz)
		    System.out.print(n + " ");
		System.out.print("\n");
		
		
		for(var i = 0; i < niz.length; ++i)
		    niz[i] = 5;
		for(var n : niz)
		    System.out.print(n + " ");
		System.out.print("\n");
		
		Tacka tovi[] = new Tacka[3];
		for(var i = 0; i < tovi.length; ++i) {
		    tovi[i] = new Tacka();
		    System.out.print(tovi[i] + " ");
		}
		System.out.print("\n");
		
		
		Tacka tovi2[] = {new Tacka(), new Tacka(), new Tacka(5, 3)};
		for(var i = 0; i < tovi.length; ++i) {
		    System.out.print(tovi2[i] + " ");
		}
		System.out.print("\n");

		
		Automobil a = new Automobil();
		System.out.println(a);
		a.vozi(120);
		System.out.println(a);

		a = new Automobil();
		System.out.println(a);

		System.gc();



	}

}
