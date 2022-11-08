package sudokupkt;

import java.nio.file.Files;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

public class FileDo {
	
		
		static int[][] Read(String fileName)throws Exception {
			 	String data = "";
			    data = new String(Files.readAllBytes(Paths.get(fileName))); //cita iz fajla
			    String dataNew = data.replace(" ", "").replace("\n", ""); //izbacuje razmake i line break
			    
				  int board[][] = new int [9][9]; //kreira tabelu 9x9
				  int brojac=0;

				 for(int i = 0; i < 9; i++) {
					 for (int j = 0; j < 9; j++) {
							  board[i][j] =+ ((dataNew.charAt(brojac) - '0')); //upis iz fajla u tabelu
							 brojac++;
					 }
				 }
				 return board;
				 }
		
		static void Write( int[][] board) throws IOException {
		    BufferedWriter outputWriter = null;
		    outputWriter = new BufferedWriter(new FileWriter("sudoku_solutions.txt")); //kreiranje fajla
		    for (int i = 0; i < 9; i++) {
		        for (int j = 0; j < 9; j++) {
		        	outputWriter.write(board[i][j]+" "); //upis u fajl
		        }
		        outputWriter.write("\n");
		    }
		    outputWriter.close();
		}	
		
}
