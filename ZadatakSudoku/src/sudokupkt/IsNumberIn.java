package sudokupkt;

public class IsNumberIn {
	
	static boolean Row(int[][] board, int number, int row) {
	    for (int i = 0; i < 9; i++) {
	      if (board[row][i] == number) {
	        return true;
	      }
	    }
	    return false;
	  }
	  
	  static boolean Column(int[][] board, int number, int column) {
	    for (int i = 0; i < 9; i++) {
	      if (board[i][column] == number) {
	        return true;
	      }
	    }
	    return false;
	  }
	  
	  static boolean Box(int[][] board, int number, int row, int column) {
	    int localBoxRow = row - row % 3;
	    int localBoxColumn = column - column % 3;
	    
	    for (int i = localBoxRow; i < localBoxRow + 3; i++) {
	      for (int j = localBoxColumn; j < localBoxColumn + 3; j++) {
	        if (board[i][j] == number) {
	          return true;
	        }
	      }
	    }
	    return false;
	  }

}
