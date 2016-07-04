package _005LongestPalindromicSubstring;

public class Solution {
	
	public String longestPalindrome(String s){
		String sub_str = "";
        for(int i=0; i<s.length(); i++){
        	if(i==0) 
        		sub_str += s.charAt(0);
     	    
        	int res[] = isPalindromic(i, i, s);  //类似aba这类回文串
        	if( (res[1]-res[0]+1)>sub_str.length() ){
        		sub_str = s.substring(res[0],res[1]+1);  
        	}
        	res = isPalindromic(i, i+1, s);    //类似abba这类回文串
        	if( (res[1]-res[0]+1) > sub_str.length() ){
        		sub_str = s.substring(res[0],res[1]+1);   	
        	}
        }
        return sub_str;
	}
	
	public int[] isPalindromic(int m, int n, String s){
		int mn[] = new int[2];
		while( (m>=0) && (n<s.length()) ){
			if(s.charAt(m)!=s.charAt(n)){
				mn[0] = m+1;
				mn[1] = n-1;
				return mn;
			}
			m--;
			n++;
		}
		mn[0] = m+1;
		mn[1] = n-1;
		return mn;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Solution().longestPalindrome("abccabaa"));
	}

}
