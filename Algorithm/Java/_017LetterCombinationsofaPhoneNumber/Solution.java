package _017LetterCombinationsofaPhoneNumber;
import java.util.LinkedList;
import java.util.List;
public class Solution {
	
	public List<String> letterCombinations(String digits) {
		LinkedList<String> result = new LinkedList<String>();
		if(digits.equals("")) return result;
		result.add("");
        String trans_function[][] = {
        		{"0"},                // 0
        		{"1"},                   // 1
        		{"a","b","c"},        // 2
        		{"d","e","f"},        // 3
        		{"g","h","i"},        // 4        
        		{"j","k","l"},        // 5
        		{"m","n","o"},        // 6
        		{"p","q","r","s"},    // 7
        		{"t","u","v"},        // 8
        		{"w","x","y","z"}     // 9
        		};
        
        for(int i=0 ; i<digits.length(); i++){
        	String strs[] = trans_function[digits.charAt(i)-'0'];
        	
        	while( result.peek().length()==i ){
        		String head_str = result.remove();
	        	for( String ch: strs ){
	        		result.add(head_str+ch);
	        	}
        	}
        }
        
        return result;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(new Solution().letterCombinations(""));
	}

}
