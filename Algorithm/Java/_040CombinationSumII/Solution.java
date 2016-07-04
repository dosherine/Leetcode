package _040CombinationSumII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> combination = new ArrayList<List<Integer>>();
		List<Integer> singleCombination = new ArrayList<Integer>();
		Arrays.sort(candidates);
		backtrackingCombination(combination, singleCombination, candidates, target, 0);
		
		return combination;
    }
	
	
	void backtrackingCombination(List<List<Integer>> combination, List<Integer> singleCombination, int[] candidates, int target, int start){
		if(target>0){
			for (int i = start; i <candidates.length && candidates[i]<=target; i++) {
				if( i>start && candidates[i]==candidates[i-1] )
					continue;
				singleCombination.add(candidates[i]);
				backtrackingCombination(combination, singleCombination, candidates, target-candidates[i], i+1);
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
		int[] candidates = {10, 1, 2, 7, 6, 1, 5};
		int target = 8;
		List<List<Integer>> combination = new Solution().combinationSum2(candidates, target);
		for (int i = 0; i < combination.size(); i++) {
			for (int j = 0; j < combination.get(i).size(); j++) {
				System.out.print(combination.get(i).get(j)+" ");
			}
			System.out.println();
		}
	}

}
