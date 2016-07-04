package _018_4Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Solution {
	
	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> result = new ArrayList();
		Arrays.sort(nums);
		
		for(int k=0; k<nums.length; k++){
			if( k>0 && nums[k]==nums[k-1] ) continue;
			int first_target = target - nums[k];
			
			int m, n;
	        for(int i=k+1; i<nums.length; i++){
	        	if( i>(k+1) && nums[i]==nums[i-1] ) continue;
	        	int temp_target = first_target - nums[i];
	        	m = i+1;
	        	n = nums.length-1;
	        	while(m<n){
	        		int temp_sum = nums[m]+nums[n]+nums[i];
	        		if( nums[m]+nums[n] == temp_target ){
	        			if(nums[m] == nums[m-1] && n<nums.length-1 && nums[n] == nums[n+1]){
	        				m++;
	        				n--;
	        				continue;
	        			}
	        			ArrayList newList = new ArrayList<Integer>();
	        			newList.add(nums[k]);
	        			newList.add(nums[i]);
	        			newList.add(nums[m]);
	        			newList.add(nums[n]);
	        			result.add( newList );
	        			m++;
	        			n--;
	        		}
	        		else if( nums[m]+nums[n] < temp_target ){	        			
	        			m++;
	        		}
	        		else{
	        			n--;
	        		}
	        	}
	        }
			
		}
		return result;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {-2,-2,-2,-1,-1,0,2,0,1,1,0,0,2,2};
		List< List<Integer> > result = new Solution().fourSum(nums, 3);
		for (int i = 0; i < result.size(); i++) {
			List<Integer> this_list = result.get(i);
			for (int j = 0; j < this_list.size(); j++) {
				System.out.print(this_list.get(j)+" ");
			}
			System.out.println();
		}
	}

}
