package _008StringtoIntege;

public class Solution {
	
	public int myAtoi(String str) {
		char charArr[] = str.toCharArray();
		
		//1.str==""
		if( charArr.length ==0) return 0;
		
		int i=0, sign = 1;
		long result = 0;
		
		//2.str has space
		while(charArr[i]==' ' && i<charArr.length ) i++;
		
		//3. str has sign
		if(charArr[i]=='+'||charArr[i]=='-'){
			sign = (charArr[i]=='-')?-1:1;
			i++;
		}
		
		while( i<charArr.length && charArr[i]<='9' && charArr[i]>='0'){
			result = result *10 + (charArr[i]-'0');
			i++;
			//4. str has overflow
			if( result>Integer.MAX_VALUE || result<Integer.MIN_VALUE)
				return (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
			
		}
		
		result = result * sign;
		
		
		
        return (int)result;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Solution().myAtoi("9223372036854775809"));
	}

}
