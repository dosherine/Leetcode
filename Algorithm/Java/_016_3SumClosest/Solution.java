package _016_3SumClosest;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	public int threeSumClosest(int[] nums, int target) {
        int sum = nums[0] + nums[1] + nums[2];
        
        Arrays.sort(nums);
        int m, n;
        for(int i=0; i<nums.length; i++){
        	if( i>0 && nums[i]==nums[i-1] ) continue;
        	int temp_target = target - nums[i];
        	m = i+1;
        	n = nums.length-1;
        	while(m<n){
        		int temp_sum = nums[m]+nums[n]+nums[i];
        		if( nums[m]+nums[n] == temp_target ){
        			return target;
        		}
        		else if( nums[m]+nums[n] < temp_target ){
        			if(Math.abs(sum-target)>Math.abs(temp_sum-target))
        				sum = temp_sum;
        			m++;
        		}
        		else{
        			if(Math.abs(sum-target)>Math.abs(temp_sum-target))
        				sum = temp_sum;
        			n--;
        		}
        	}
        }
        return sum;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {0,0,0};
		System.out.print(new Solution().threeSumClosest(nums, 1));
	}

}
