package stringovi;

public class Zad01 {

	public static void main(String[] args) {
		String a = "Ovo je teskt ";
		System.out.println(a);
		
		String b = a + 5 + " zadatka";
		System.out.println(b);
		
		System.out.println("broj elemenata stringa je: " + a.length());
		
		System.out.println("prvi karakter: " + a.charAt(0));
		System.out.println("drugi karakter: " + a.charAt(1));
		System.out.println("poslednji element stringa a je: " + a.charAt(a.length()-1));
		
		//zadatak01 recenica obrnuto
		String recenica = "Norvežanin Kjetil Jansrud osvojio je zlatnu medalju u "
				+ "superveleslalomu na Zimskim olimpijskim igrama u Sočiju "
				+ "pošto je za 30 stotih delova sekunde bio brži od drugoplasiranog "
				+ "Amerikanca Endrjua Vajbrehta.";
		
		for (int i = recenica.length(); i>0; i--) {
			//String recenica_obrnuto = recenica_obrnuto = recenica.charAt(i);
			System.out.println(recenica.charAt(i-1));
		}

	}
}
