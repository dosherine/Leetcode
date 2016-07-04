package _037SudokuSolver;


public class Solution {
	public void solveSudoku(char[][] board) {
		backtracking(board);
		
		
    }
	
	boolean backtracking(char[][] board){
		for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.'){
                    for(char c = '1'; c <= '9'; c++){//trial. Try 1 through 9 for each cell
                        if(isValid(board, i, j, c)){
                            board[i][j] = c; //Put c for this cell

                            if(backtracking(board))
                                return true; //If it's the solution return true
                            else
                                board[i][j] = '.'; //Otherwise go back
                        }
                    }
                    return false;
                }
            }
        }
        return true;
	}
	
	
	public boolean isValid(char board[][], int i, int j, char c){
		//row
		for(int m = 0; m < 9; m++){
			if( m!=i){
				if( c == board[m][j] ){
					return false;
				}
			}
		}
		//column
		for(int n = 0; n < 9; n++){
			if( n!=j){
				if( c == board[i][n] ){
					return false;
				}
			}
		}
		int k_row = i/3;
		int k_column = j/3;
		//sub-box
		for(int m = k_row*3; m < k_row*3+3; m++){
			for(int n = k_column*3; n < k_column*3+3; n++)
			if( m!=i && n!=j){
				if( c == board[m][n] ){
					return false;
				}
			}
		}
		return true;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
