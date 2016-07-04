package _020ValidParentheses;

import java.lang.Thread.State;
import java.util.Stack;

public class Solution {
	
	public boolean isValid(String s) {
		Stack stack = new Stack();
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
				stack.push(s.charAt(i));
			}
			else{
				if(stack.empty()) return false;
				char popElement = (Character)stack.pop();
				if(popElement=='(' && s.charAt(i)!=')') 
					return false;
				if(popElement=='{' && s.charAt(i)!='}') 
					return false;
				if(popElement=='[' && s.charAt(i)!=']') 
					return false;
			}
		}
		if(stack.empty())
			return true;
		return false;
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(new Solution().isValid("()({}[])"));
	}

}
