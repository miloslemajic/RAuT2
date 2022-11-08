package sudokupkt;


public class Main extends SolveBoard{
	  
	  public static void main(String[] args) throws Exception {
	    
	    int[][] board = {
	        {7, 0, 2, 0, 5, 0, 6, 0, 0},
	        {0, 0, 0, 0, 0, 3, 0, 0, 0},
	        {1, 0, 0, 0, 0, 9, 5, 0, 0},
	        {8, 0, 0, 0, 0, 0, 0, 9, 0},
	        {0, 4, 3, 0, 0, 0, 7, 5, 0},
	        {0, 9, 0, 0, 0, 0, 0, 0, 8},
	        {0, 0, 9, 7, 0, 0, 0, 0, 5},
	        {0, 0, 0, 2, 0, 0, 0, 0, 0},
	        {0, 0, 7, 0, 4, 0, 2, 0, 3} 
	      };
	    
	    PrintBoard.x9(board);
	    
	    if (solveBoard(board)) {
	      System.out.println("\nSolved successfully!");
	    }
	    else {
	      System.out.println("\nUnsolvable board :(");
	    }
	    
	    PrintBoard.x9(board);
	    
	    
	    //citanje podataka
	    String data = ReadFile.asString("C:\\Users\\milos\\git\\Raut2\\ZadatakSudoku\\Data\\s02b.txt");
		  System.out.println("\n" + data );
		  
		  
		  String dataNew = data.replace(" ", "").replace("\n", ""); //izbacuje razmake i line break
		  String[] dataNewA=dataNew.split(""); //pretvara string u string[]
		  

		  int board3[][] = new int [9][9];
		 
	
		 for(int i = 0; i < 9; i++) {
			 for (int j = 0; j < 9; j++) {
				 for (var a : dataNewA) {
					 int dataElementInt = Integer.parseInt(a);
					  board3[i][j] = board3[i][j] + dataElementInt;
					 System.out.println(dataElementInt);
				 }
			 }
		 }
		 
		 
		 PrintBoard.x9(board3);
		 

  }
	  
	  





		
	
	
	   
	  
}

	

