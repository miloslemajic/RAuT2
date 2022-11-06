package sudokupkt;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) throws Exception
	  {
		
		   String data = readFileAsString("C:\\Users\\milos\\git\\Raut2\\ZadatakSudoku\\Data\\s02b.txt");
		    System.out.println(data);
		    
		    //convertovanje u matricu int [][]
		    //resavanje()??? 3x3? 9x9?
		    //upis
		    //provera
		
	  }
	
	//readfile
	 public static String readFileAsString(String fileName)throws Exception
	  {
	    String data = "";
	    data = new String(Files.readAllBytes(Paths.get(fileName)));
	    return data;
	  }
}
		
		
	

