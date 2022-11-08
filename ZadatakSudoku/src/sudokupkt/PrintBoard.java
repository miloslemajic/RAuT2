package sudokupkt;

public class PrintBoard {
	
	   static void x9(int[][] board) {
		    for (int row = 0; row < 9; row++) {
		      for (int column = 0; column < 9; column++) {
		        System.out.print(board[row][column] + " ");
		      }
		      System.out.println();
		    }
		  }
}
