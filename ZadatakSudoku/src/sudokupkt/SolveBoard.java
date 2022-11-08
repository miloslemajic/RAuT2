package sudokupkt;

public class SolveBoard {

	  static boolean solveBoard(int[][] board) {
		    for (int row = 0; row < 9; row++) {
		      for (int column = 0; column < 9; column++) {
		        if (board[row][column] == 0) {
		          for (int numberToTry = 1; numberToTry <= 9; numberToTry++) {
		            if (IsValidPlacement.isValidPlacement(board, numberToTry, row, column)) {
		              board[row][column] = numberToTry;
		              
		              if (solveBoard(board)) {
		                return true;
		              }
		              else {
		                board[row][column] = 0;
		              }
		            }
		          }
		          return false;
		        }
		      }
		    }
		    return true;
		  }
}
