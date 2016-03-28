package _2AddTwoNumbers;

public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = l1;
        ListNode head2 = l2;
        ListNode resHead = null;
        ListNode thisNode = null, nextNode = null ; 
        int isHead = 1;
        int thisBitDigit = 0;
        int carrayBit = 0;
        while(head1!=null || head2!=null){
            if(head1!=null && head2!=null){
                thisBitDigit = (head1.val + head2.val + carrayBit) % 10;
                carrayBit = (head1.val + head2.val + carrayBit) / 10;
                nextNode = new ListNode(thisBitDigit);
                
                head1 = head1.next;
                head2 = head2.next;
            }
            else if(head1!=null){
            	thisBitDigit = (head1.val + carrayBit) % 10;
                carrayBit = (head1.val + carrayBit) / 10;
                nextNode = new ListNode(thisBitDigit);
                head1 = head1.next;                  
            }
            else{              
            	thisBitDigit = (head2.val + carrayBit) % 10;
                carrayBit = (head2.val + carrayBit) / 10;
                nextNode = new ListNode(thisBitDigit);
                head2 = head2.next;  
            }
            if(isHead == 1){
                resHead = nextNode;
                thisNode = resHead;
                isHead = 0;
            }
            else{   
                thisNode.next = nextNode;
                thisNode = thisNode.next;
            }
        }
        while(carrayBit!=0){
            thisBitDigit  = carrayBit % 10;
            carrayBit = carrayBit / 10;
            nextNode = new ListNode(thisBitDigit);
            thisNode.next = nextNode;
            thisNode = thisNode.next;
        }
            
        return resHead;
    }
    
    public static void main(String args[]){
    	ListNode l1 = new ListNode(3);
    	ListNode node1 = new ListNode(7);
    	l1.next = node1;
//    	node1 = new ListNode(3);
//    	l1.next.next = node1;
    	ListNode l2 = new ListNode(9);
    	ListNode node2 = new ListNode(2);
    	l2.next = node2;
//    	node2 = new ListNode(4);
//    	l2.next.next = node2;
    	
    	
    	ListNode outputNode = l1;
    	while(outputNode!=null){
    		System.out.println(outputNode.val);
    		outputNode = outputNode.next;
    	}
    	outputNode = l2;
    	while(outputNode!=null){
    		System.out.println(outputNode.val);
    		outputNode = outputNode.next;
    	}
    	
    	ListNode sol = new Solution().addTwoNumbers(l1, l2);
    	outputNode = sol;
    	while(outputNode!=null){
    		System.out.println(outputNode.val);
    		outputNode = outputNode.next;
    	}
    }
}
