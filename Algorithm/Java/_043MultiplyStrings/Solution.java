package _043MultiplyStrings;

public class Solution {
	public String multiply(String num1, String num2) {
        char num1_arr[] = num1.toCharArray();
        char num2_arr[] = num2.toCharArray();
        int result[] = new int[num1.length()+num2.length()];
        for (int i = num2_arr.length-1; i>=0; i--) {
			for (int j = num1_arr.length-1; j >=0 ; j--) {
				int temp_mul = ((num2_arr[i]-'0') * (num1_arr[j]-'0')) + result[i+j+1];
				result[i+j+1] = temp_mul%10;
				result[i+j] += temp_mul/10 ;
			
			}
		}
        String resStr ="";
        boolean findHead = false;
        for (int i = 0; i<result.length; i++) {
			if(result[i]==0 && !findHead)
				continue;
			if(result[i]!=0)
				findHead = true;
			resStr+=Integer.toString(result[i]);
		}
        if(resStr.equals(""))
        	resStr+="0";
        return resStr;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Solution().multiply("123", "456"));
	}

}
