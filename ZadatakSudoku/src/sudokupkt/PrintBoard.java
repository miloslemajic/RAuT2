package sudokupkt;

public class PrintBoard {
	
	   static void x9(int[][] board) { 
		    for (int i = 0; i < 9; i++) {
		      for (int j = 0; j < 9; j++) {
		        System.out.print(board[i][j] + " ");
		      }
		      System.out.println();
		    }
		  }
}