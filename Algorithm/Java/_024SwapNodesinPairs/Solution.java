package _024SwapNodesinPairs;


public class Solution {
	
	public ListNode swapPairs(ListNode head) {
		if(head==null||head.next==null){
			return head;
		}
        ListNode current_Node = head;
        ListNode pre_Node = head;
        ListNode pre_pre_node = null;
        ListNode newHeadNode = head.next;
        
        int count = 1;
        while(current_Node!=null){
        	if(count%2==0){
        		pre_Node.next = current_Node.next;
        		current_Node.next = pre_Node;
        		if(pre_pre_node!=null){
        			pre_pre_node.next = current_Node;
        		}
        		current_Node = current_Node.next;
        		pre_pre_node = current_Node;
        	}
        	else{
        		pre_Node = current_Node;
        	}
        	count++;
        	current_Node = current_Node.next;
        }
        return newHeadNode;
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
		
//		pNode = new ListNode(3);
//		qNode.next = pNode;
//		qNode = qNode.next;
//		
//		pNode = new ListNode(4);
//		qNode.next = pNode;
//		qNode = qNode.next;
//		
//		pNode = new ListNode(5);
//		qNode.next = pNode;
//		qNode = qNode.next;
		
		ListNode pListNode = new Solution().swapPairs(head);
		
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