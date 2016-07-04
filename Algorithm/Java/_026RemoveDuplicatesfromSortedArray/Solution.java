package _026RemoveDuplicatesfromSortedArray;

public class Solution {
	public int removeDuplicates(int[] nums) {
        int new_start = 0;
        for (int i = 0; i < nums.length; i++) {
			if( i>0 && nums[i]==nums[i-1]){
				new_start++;
			}
			nums[i-new_start] = nums[i];
		}
        return nums.length - new_start;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,1,2,3,4,5,5,6,7};
		System.out.println(new Solution().removeDuplicates(nums));
		for(int i:nums){
			System.out.print(i+" ");
		}
	}

}
