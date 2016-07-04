package _034SearchforaRange;

import javax.naming.BinaryRefAddr;

public class Solution {
	public int[] searchRange(int[] nums, int target) {
        int range[] = new int[2];
        int targetIndex = BinarySearch(nums, target, 0, nums.length-1);
        if(targetIndex == -1){
        	range[0] = range[1] = -1;
        }
        else{
        	int i , j;
            i = j = targetIndex;
            
            while(i>=0){
            	if(nums[i]==target){
            		i--;
            	}
            	else{
            		break;
            	}
            }
            
            while(j<nums.length){	
            	if(nums[j]==target){
            		j++;
            	}
            	else {
    				break;
    			}
            }
            range[0] = i+1;
            range[1] = j-1;
        }
        
        return range;
    }
	
	int BinarySearch(int[] nums, int target, int head, int tail){
		if(head>tail)
			return -1;
		
		int mid = (head + tail) /2;
		if(target==nums[mid])
			return mid;
		else if(target<nums[mid]){
			return BinarySearch(nums, target, head, mid-1);
		}
		else{
			return BinarySearch(nums, target, mid+1, tail);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {2,2};
		int test[] = new Solution().searchRange(nums, 1);
		System.out.println(test[0]+" "+test[1]);
	}

}
