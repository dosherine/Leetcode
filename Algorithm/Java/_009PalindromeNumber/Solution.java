package _009PalindromeNumber;

public class Solution {
	
	public boolean isPalindrome(int x) {
		if(x<0) return false;
		String string = String.valueOf(x);
		for(int i=0,j=string.length()-1; i<j ;i++,j--){
			if(string.charAt(i) != string.charAt(j))
				return false;
		}
		return true;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print( new Solution().isPalindrome(123321));
	}

}
