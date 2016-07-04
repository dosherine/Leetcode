package _015_3Sum;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    	List< List<Integer> > result = new ArrayList();
        Arrays.sort(nums);
        int m, n;
        for(int i=0; i<nums.length; i++){
        	if( i>0 && nums[i]==nums[i-1] ) continue;
        	int target = 0 - nums[i];
        	m = i+1;
        	n = nums.length-1;
        	while(m<n){
        		if( nums[m]+nums[n] == target ){
        			if(nums[m] == nums[m-1] && n<nums.length-1 && nums[n] == nums[n+1]){
        				m++;
        				n--;
        				continue;
        			}
        			ArrayList newList = new ArrayList<Integer>();
        			newList.add(nums[i]);
        			newList.add(nums[m]);
        			newList.add(nums[n]);
        			result.add( newList );
        			m++;
        			n--;
        		}
        		else if( nums[m]+nums[n] <= target ){
        			m++;
        		}
        		else{
        			n--;
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
		int nums[] = {-2,0,0,2,2};
		List< List<Integer> > result = new Solution().threeSum(nums);
		for (int i = 0; i < result.size(); i++) {
			List<Integer> this_list = result.get(i);
			for (int j = 0; j < this_list.size(); j++) {
				System.out.print(this_list.get(j)+" ");
			}
			System.out.println();
		}
		
	}

}
