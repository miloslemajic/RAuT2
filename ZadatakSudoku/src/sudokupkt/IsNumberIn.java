package sudokupkt;

public class IsNumberIn {
	
	static boolean Row(int[][] board, int number, int row) { //proverava da li se broj number,
	    for (int i = 0; i < 9; i++) {						//nalazi u datom redu
	      if (board[row][i] == number) {
	        return true;
	      }
	    }
	    return false;
	  }
	  
	  static boolean Column(int[][] board, int number, int column) { //proverava da li se broj
	    for (int i = 0; i < 9; i++) {								//nalazi u datoj koloni
	      if (board[i][column] == number) {
	        return true;
	      }
	    }
	    return false;
	  }
	  
	  static boolean Box(int[][] board, int number, int row, int column) { //proverava da li se
	    int localBoxRow = row - row % 3;								//broj nalazi u 3x3 kutiji
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
