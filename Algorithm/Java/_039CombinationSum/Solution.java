package _039CombinationSum;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> combination = new ArrayList<List<Integer>>();
		List<Integer> singleCombination = new ArrayList<Integer>();
		Arrays.sort(candidates);
		backtrackingCombination(combination, singleCombination, candidates, target, 0);
		
		return combination;
    }
	
	
	void backtrackingCombination(List<List<Integer>> combination, List<Integer> singleCombination, int[] candidates, int target, int start){
		if(target>0){
			for (int i = start; i <candidates.length && candidates[i]<=target; i++) {
				singleCombination.add(candidates[i]);
				backtrackingCombination(combination, singleCombination, candidates, target-candidates[i], i);
				singleCombination.remove(singleCombination.size()-1);			
			}
			
		}
		
		else if(target==0){
			 combination.add(new ArrayList<Integer>(singleCombination));
		}
	}
	
	
	
	
	/**	
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				int[] candidates = {2,2, 3, 6, 7};
				int target = 7;
				List<List<Integer>> combination = new Solution().combinationSum(candidates, target);
				for (int i = 0; i < combination.size(); i++) {
					for (int j = 0; j < combination.get(i).size(); j++) {
						System.out.print(combination.get(i).get(j)+" ");
					}
					System.out.println();
				}
	}

}
