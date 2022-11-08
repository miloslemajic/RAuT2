package sudokupkt;

public class IsValidPlacement {
	
	 static boolean isValidPlacement(int[][] board, int number, int row, int column) {
		    return !IsNumberIn.Row(board, number, row) &&
		        !IsNumberIn.Column(board, number, column) &&
		        !IsNumberIn.Box(board, number, row, column);
		  }

}
