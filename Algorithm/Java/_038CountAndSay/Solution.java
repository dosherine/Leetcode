package _038CountAndSay;

public class Solution {
	public String countAndSay(int n) {
        String n_str = Integer.toString(1);
        while(n-->1){
        	char[] n_charArray = n_str.toCharArray();
        	n_str = "";
        	int k=1;
	        for (int i = 0; i < n_charArray.length; i++) {
				if( i>0){
					if( n_charArray[i]==n_charArray[i-1]){
						k++;
					}
					else{
						n_str = n_str + Integer.toString(k) + n_charArray[i-1];
						k=1;
					}
				}
			}

	        n_str += Integer.toString(k) + n_charArray[n_charArray.length-1];
	        System.out.println(n_str);
        }
        return n_str;
    }
	
	
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Solution().countAndSay(4);
	}

}
