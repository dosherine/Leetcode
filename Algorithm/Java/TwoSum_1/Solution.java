package TwoSum_1;

public class Solution {
	public int[] twoSum(int[] nums, int target) {
        int solution[] = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    solution[0] = i;
                    solution[1] = j;
                    return solution;
                }
                    
            }
        }
        return null;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {2, 7, 11, 15};
		int target = 9;
		System.out.println(new Solution().twoSum(nums, target)[0]+" "+new Solution().twoSum(nums, target)[1]);
	}

}
