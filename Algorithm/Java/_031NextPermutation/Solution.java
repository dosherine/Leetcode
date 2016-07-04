package _031NextPermutation;

public class Solution {
	
	public void nextPermutation(int[] nums) {
		int post_num = nums[nums.length-1];
		int pre_num ;
		int min_index = nums.length-1;
        for (int i = nums.length-2; i > 0; i--) {
			pre_num = nums[i];
			if( pre_num>post_num ){
				
			}
		}
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
