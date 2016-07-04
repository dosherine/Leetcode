package _012IntegertoRoman;

import java.util.ArrayList;

public class Solution {
	
	public String intToRoman(int num) {
		ArrayList<Integer> remainder = new ArrayList<Integer>();
		ArrayList<Character> roman = new ArrayList<Character>();
        while(num!=0){
        	remainder.add( num % 10);
        	num = num / 10;
        }
        
        
        for(int i=remainder.size()-1; i>=0; i--){
            if( remainder.get(i)==0){
            	continue;
            }
            else if( remainder.get(i)<=3 ){
            	char this_char = transIntToRoman( 1*(int)Math.pow(10, i));
            	for(int j=0;j<remainder.get(i);j++){
            		roman.add( this_char );
            	}
            }
            else if( remainder.get(i)<5 ){
            	char subtractor = transIntToRoman( 1*(int)Math.pow(10, i));
            	char minuend = transIntToRoman( 5*(int)Math.pow(10, i) );
            	roman.add(subtractor);
            	roman.add(minuend);
            }
            else if( remainder.get(i)<=8 ){
            	char subtractor = transIntToRoman( 1*(int)Math.pow(10, i));
            	char minuend = transIntToRoman( 5*(int)Math.pow(10, i) );
            	roman.add(minuend);
            	for(int j=0; j<(remainder.get(i)-5); j++){
            		roman.add(subtractor);
            	}
            }
            else{
            	char subtractor = transIntToRoman( 1*(int)Math.pow(10, i));
            	char minuend = transIntToRoman( 10*(int)Math.pow(10, i) );
            	roman.add(subtractor);
            	roman.add(minuend);
            }
        }
        
        String final_res="";
        
        for(int i=0; i<roman.size(); i++){
        	final_res += roman.get(i);
        }
        
        return final_res;
    }
	
	private char transIntToRoman(int num){
		switch (num) {
		case 1:
			return 'I';
		case 5:
			return 'V';
		case 10:
			return 'X';
		case 50:
			return 'L';
		case 100:
			return 'C';
		case 500:
			return 'D';
		case 1000:
			return 'M';
		default:
			return ' ';
		}
	}
	
	public static void main(String args[]){
		System.out.println( new Solution().intToRoman(99) );
	}
}
