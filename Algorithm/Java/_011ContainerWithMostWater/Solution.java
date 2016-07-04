package _011ContainerWithMostWater;

import java.util.ArrayList;


public class Solution {
	
	public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int area = 0 ;
        
        while(left<right){
        	area = Math.max(area, Math.min(height[left], height[right])*(right-left));
        	
        	if(height[left]<height[right]){
        		left ++;
        	}
        	else{
        		right --;
        	}
        }
        
        return area;
        
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height[] = {1,1};
		System.out.println(new Solution().maxArea(height));
	}

}
