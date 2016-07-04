package _029DivideTwoIntegers;

public class Solution {
	
	public int divide(int dividend, int divisor) {
		if(divisor==0) return Integer.MAX_VALUE;
		if(dividend==Integer.MIN_VALUE && divisor==-1)
			return Integer.MAX_VALUE;
		if(dividend==0 ) return 0;
		if(divisor == 1) return dividend;
		if(divisor== -1) return -dividend;
		
		
		int sign = -1;  //result's sign
		if( (dividend>0 && divisor>0 ) || (dividend<0 && divisor<0 )){
			sign = 1;
		}
		long dvd =dividend, dvs = divisor;
		if( dividend<0 ) dvd = (long)0 - dividend;
		if( divisor<0 ) dvs = (long)0 - divisor;
		
		
		
		if(sign==-1) 
			return -getFactor(dvd,dvs);
		else 
			return getFactor(dvd,dvs);
    }
	
	private int getFactor(long dividend, long divisor){
		if(dividend==divisor){
			return 1;
		}
		if(dividend<divisor)
			return 0;
		
		int k = 1;
		long factor = divisor;
		while( factor < dividend){
			factor = factor<<1;		
			k = k<<1;
		}
		factor = factor >>1;
		k = k>>1;
		return  k+ getFactor(dividend-factor, divisor);
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(new Solution().divide(-2147483648
				, -1));
	}

}
