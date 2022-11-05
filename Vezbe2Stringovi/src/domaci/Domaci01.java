package domaci;

public class Domaci01 {

	public static void main(String[] args) {

		//dom01
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
