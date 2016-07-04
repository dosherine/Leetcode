package _027RemoveElement;


public class Solution {
	public int removeElement(int[] nums, int val) {
		int new_start = 0;
        for (int i = 0; i < nums.length; i++) {
			if(nums[i]==val){
				new_start ++;
			}
			else{
				nums[i-new_start] = nums[i];
			}
		}
        return nums.length - new_start;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {3,2,2,3};
		System.out.println(new Solution().removeElement(nums, 3));
		for(int i:nums){
			System.out.print(i+" ");
		}
	}

}
