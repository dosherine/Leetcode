package _035SearchInsertPosition;

public class Solution {
	public int searchInsert(int[] nums, int target) {
        int targetIndex = BinarySearch(nums, target, 0, nums.length-1);
        if(targetIndex>(nums.length-1))
        	return targetIndex;      
        if( targetIndex<0 )
        	return targetIndex+1;
        if( nums[targetIndex]<target )
        	return targetIndex+1;
        
        int i = targetIndex-1;
        while(i>=0){
        	if(target==nums[i]){
        		i--;
        	}
        	else{
        		break;
        	}
        }
        return i+1;
    }
	
	int BinarySearch(int[] nums, int target, int head, int tail){
		if(head>tail)
			return (head-1);
		
		if(head==tail){
			if(target==nums[head])
				return head;
			else if(target<nums[head]){
				return head;
			}
			else{
				return (head+1);
			}
		}
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
		int nums[]={3,5,7,9,10};
		System.out.println(new Solution().searchInsert(nums, 8));
	}

}
