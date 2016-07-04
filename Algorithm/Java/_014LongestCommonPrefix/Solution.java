package _014LongestCommonPrefix;

public class Solution {
	
	public String longestCommonPrefix(String[] strs) {      
		if(strs.length==0) return "";
		int min_size = strs[0].length();     
		
        String model_str = strs[0];
        for(int i=1; i<strs.length; i++){
        	min_size = Math.min(min_size, strs[i].length());
        	for(int j=0; j < min_size; j++){
        		if( model_str.charAt(j) != strs[i].charAt(j) ){
        			min_size = j;
        			break;
        		}
        	}
        }
        
        return model_str.substring(0,min_size);
    }
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strs[]={};
		System.out.print(new Solution().longestCommonPrefix(strs));
	}

}
