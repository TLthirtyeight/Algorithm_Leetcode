package mergeTwoSortedLists;



   class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
 
class Solution {
  	 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		    if(l1==null&&l2!=null){
			 return l2;
		 }else if(l1!=null&&l2==null){
			 return l1;
		 }else if(l1==null&&l2==null){
			 return null;
		 }
	        ListNode l1current=l1;
	        ListNode l2current=l2;
	        ListNode head=new ListNode(-999);
	        int v_l1current,v_l2current;
	        ListNode resulthead=null;int resultlength=0;
	        while(l1current!=null&&l2current!=null){
	        	v_l1current=l1current.val;
	        	v_l2current=l2current.val;
	        	if(v_l1current<=v_l2current){
	        		head.next=l1current;
	        		l1current=l1current.next;
	        	}else{
	        		head.next=l2current;
	        		l2current=l2current.next;
	        	}
	        	
	        	head=head.next;
	        	resultlength++;
	        	if(resultlength==1){
	        		resulthead=head;
	        	}
	        }
	        if(l1current==null){
	        	head.next=l2current;
	        }else{
	        	head.next=l1current;
	        }
	      return resulthead;   
	    }
}