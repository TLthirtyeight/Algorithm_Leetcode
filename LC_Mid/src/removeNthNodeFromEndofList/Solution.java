package removeNthNodeFromEndofList;


  
   class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
 
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode p1,p2;
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        p1=dummy;p2=dummy;
        
        while(n-->0){
        	p1=p1.next;
        	
        }
    	 while(p1.next!=null){
    		 p1=p1.next;
    		 p2=p2.next;
    	 }
    	 p2.next=p2.next.next;
    	 return dummy.next;
    }
}
