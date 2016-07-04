package _019RemoveNthNodeFromEndofList;

import java.util.ArrayList;
import java.util.List;
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	List<ListNode> node = new ArrayList<ListNode>();
    	ListNode pListNode = head;
    	while(pListNode!=null){
    		node.add(pListNode);
    		pListNode = pListNode.next;
    	}	
    	node.add(null); //add tail with a null node
    	if(node.size()<=2) return null;  //head only has 1 node 
    	
    	if( (node.size()-n-2)<0 ) return node.get(1);
    	
    	node.get(node.size()-n-2).next = node.get(node.size()-n);
        return head;
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		ListNode qNode = head;
		ListNode pNode;
		pNode = new ListNode(2);
		qNode.next = pNode;
		qNode = qNode.next;
		
		pNode = new ListNode(3);
		qNode.next = pNode;
		qNode = qNode.next;
//		
//		pNode = new ListNode(4);
//		qNode.next = pNode;
//		qNode = qNode.next;
//		
//		pNode = new ListNode(5);
//		qNode.next = pNode;
//		qNode = qNode.next;
		
		ListNode pListNode = new Solution().removeNthFromEnd(head, 1);
		
		while(pListNode!=null){
			System.out.print(pListNode.val+" -> ");
			pListNode = pListNode.next;
		}
	}

}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}
 

