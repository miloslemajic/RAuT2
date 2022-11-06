package nip;

public class Main {

	public static void main(String[] args) {
		var o = new Osoba("1907987565522", "Pera", "Peric");
		var s = new Student("1907987565522", "Pera", "Peric",19,"EE15/2015","KTIOS",3);

		System.out.println(o);
		System.out.println(s);
		System.out.println(s.getUserName());
		
		Instrument orkestar[] = {new Klavir(), new Violina(), new Violina()};
		for(var i : orkestar)
		    i.sviraj();

		SmartPhone sp = new SmartPhone();
		sp.zovi("+381695695245");
		sp.play();
		sp.stop();
		sp.takePicture();
		
		Phone p = new Phone() {
		    @Override
		    public void zovi(String broj) {
		        System.out.println("Interfejs zove " + broj);
		    }
		};
		p.zovi("195");



	}

}
