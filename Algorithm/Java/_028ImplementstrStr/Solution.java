package _028ImplementstrStr;

public class Solution {
	public int strStr(String haystack, String needle) {
		if( needle.equals("") ) return 0;
	    if(haystack.equals("") ) return -1;
        return KMP(haystack,needle);
    }
	
	private int KMP(String haystack, String needle){
		int next[] = getNext(needle);
		int i=0, j=0;
		
		while( i<haystack.length() && j<needle.length() ){
			if( j==-1 || haystack.charAt(i) == needle.charAt(j) ){
				i++;
				j++;
			}
			else{
				if(j<1)
					j = -1;
				else	
					j = next[j-1];
			}
		}
		
		if(j==needle.length()){
			return i-needle.length();
		}
		return -1;
	}
	
	
	/**
	 * next[]: the length of the longest possible proper initial segment 
	 * @param needle  patterns Ä£Ê½´®
	 * @return
	 */
	private int[] getNext(String needle){
		int next[] = new int[needle.length()];
		next[0] = 0;
		int i = 1, j = 0;
		
		while ( i<needle.length() ) {
			while( j>0 && needle.charAt(i)!=needle.charAt(j) )
				j = next[j-1];
			if(needle.charAt(i)==needle.charAt(j))
				j++;
			
			next[i] = j;
			i++;
		}
		return next;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int next[] = new Solution().getNext("abcdabd");
		for (int i = 0; i < next.length; i++) {
			System.out.print(next[i]+" ");
		}
		System.out.print("   kmp:"+new Solution().strStr("", ""));
	}

}
