package _036ValidSudoku;

public class Solution {
	public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<9; i++){
        	for (int j = 0; j < 9; j++) {
        		if(board[i][j]!='.'){
        			//row
    				for(int m = 0; m < 9; m++){
    					if( m!=i){
    						if( board[i][j] == board[m][j] ){
    							return false;
    						}
    					}
    				}
    				//column
    				for(int n = 0; n < 9; n++){
    					if( n!=j){
    						if( board[i][j] == board[i][n] ){
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
    						if( board[i][j] == board[m][n] ){
    							return false;
    						}
    					}
    				}
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
