package _013RomanToInteger;

public class Solution {
	
	public int romanToInt(String s) {
		char operate[] = new char[s.length()-1];
		char char_arr[] = s.toCharArray();
		for(int i=1; i<s.length(); i++){
			if( transRomanToInteger( char_arr[i-1])<transRomanToInteger(char_arr[i]) ){
				operate[i-1] = '-';
			}
			else{
				operate[i-1] = '+';
			}
		}
		
		
		for( int i=0; i<operate.length; i++){
			if(operate[i]=='-'){
				char temp = s.charAt(i);
				char_arr[i] = char_arr[i+1];
				char_arr[i+1] = temp;
			}
		}
		
		int final_res = transRomanToInteger(char_arr[0]);
		
		for( int i=0; i<operate.length; i++){
			if(operate[i]=='-'){
				final_res -= transRomanToInteger(char_arr[i+1]);
			}
			else{
				final_res += transRomanToInteger(char_arr[i+1]);
			}
		}
		
		return final_res;
    }
	
	private int transRomanToInteger(char roman){
		switch (roman) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Solution().romanToInt("I"));
	}
	
	
}
