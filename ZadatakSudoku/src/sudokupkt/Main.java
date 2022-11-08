package sudokupkt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main  {
	  
	  public static void main(String[] args) throws Exception {
	    

	    //citanje podataka
	   int board[][]= FileDo.Read("C:\\Users\\milos\\git\\Raut2\\ZadatakSudoku\\Data\\s04d.txt");
		 
	   			PrintBoard.x9(board);

	   			if (SolveBoard.solveBoard(board)) {
			      System.out.println("\nSolved successfully!");
			    }
			    else {
			      System.out.println("\nUnsolvable board :(");
			    }
			    
			    PrintBoard.x9(board);
			    
			    FileDo.Write(board);
			    
			    int[][] DataZaUpis = { //nece da obradi rucno upisani podatke u txt file
			    		{ 0, 7, 6, 9, 0, 0, 0, 0, 0, }, 
			    		 { 0, 0, 8, 0, 0, 5, 7, 0, 0, }, 
			    		 {1, 5, 0, 0, 0, 0, 0,0, 0,}, 
			    		 {0, 0, 0, 0, 5, 0, 0, 0, 0,  }, 
			    		 {0, 1, 2, 8, 0, 0, 9, 0, 5, }, 
			    		 {0, 0, 7, 2, 0, 6 ,4, 1, 0 }, 
			    		 {2, 8, 0, 0, 0 ,7 ,1, 0, 0 } ,
			    		 {4, 0, 9, 0, 0 ,0 ,0, 0 ,0 } ,
			    		 { 0, 0, 0, 0, 0 ,0, 6, 0, 0} ,
			    	} ;
			    		
			    BufferedWriter outputWriter = null;
			    outputWriter = new BufferedWriter(new FileWriter("s04d.txt")); //kreiranje fajla
			    for (int i = 0; i < 9; i++) {
			        for (int j = 0; j < 9; j++) {
			        	outputWriter.write(DataZaUpis[i][j]+" "); //upis u fajl
			        }
			        outputWriter.write("\n");
			    }
			    outputWriter.close();
				
			    
	  }
	  
}

	

