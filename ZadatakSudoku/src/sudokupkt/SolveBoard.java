package sudokupkt;

public class SolveBoard {
	
	  static boolean solveBoard(int[][] board) {
		  
		    for (int row = 0; row < 9; row++) {				
		      for (int column = 0; column < 9; column++) {	// prolazi kroz tabelu
		        if (board[row][column] == 0) {				//i trazi 0 (prazno mesto)
		          for (int numberToTry = 1; numberToTry <= 9; numberToTry++) { //probava brojeve od 0 do 9
		            if (IsValidPlacement.isValidPlacement(board, numberToTry, row, column)) { //i upisuje
		              board[row][column] = numberToTry;								//ih ako valid=true
		              	
		              if (solveBoard(board)) { //rekurzija
		                return true;
		              }
		              else {
		                board[row][column] = 0; //poslednji na 0, proverava sledeci broj
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
