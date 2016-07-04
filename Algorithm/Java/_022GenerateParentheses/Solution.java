package _022GenerateParentheses;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	
	public List<String> generateParenthesis(int n) {
		LinkedList<String> resultList = new LinkedList<String>();
		generatePar(resultList, "", 0, 0, n);
		
		return resultList;
    }
	
	private void generatePar(LinkedList<String> resultList,String str, int pre, int post, int max){
		if(str.length()==max*2){
			resultList.add(str);
			return;
		}
		
		if(pre<max){
			generatePar(resultList, str+"(", pre+1, post, max);
		}
		if(post<pre){
			generatePar(resultList, str+")", pre, post+1, max);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> resultList = (LinkedList)new Solution().generateParenthesis(3);
		for(int i=0; i<resultList.size(); i++){
			System.out.print(resultList.get(i)+" ");
		}
	}

}
