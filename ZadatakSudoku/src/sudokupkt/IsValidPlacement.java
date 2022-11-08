package sudokupkt;

public class IsValidPlacement { //proverava da li je broj na pravom mestu(redu, koloni i kutiji)
	
	 static boolean isValidPlacement(int[][] board, int number, int row, int column) {
		    return !IsNumberIn.Row(board, number, row) &&
		        !IsNumberIn.Column(board, number, column) &&
		        !IsNumberIn.Box(board, number, row, column);
		  }

}
