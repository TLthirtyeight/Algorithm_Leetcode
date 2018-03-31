package reverseLinkedList;




class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class ReverseLinkedList {
	
	public static ListNode last=null;
    
	public void solve(){
		
		
		
		
	}
	public static void print(ListNode ln){
		while(ln!=null){
			System.out.print(ln.val+" ");
			ln=ln.next;
		}
		System.out.println();
	}
	
	public static ListNode  reverseLinkedlist(ListNode ln){
		if(ln.next==null){
			last=ln;
			ln.next=null;
			return ln;
		}
		ListNode head=reverseLinkedlist(ln.next);
		last.next=ln;
		last=ln;
		ln.next=null;
		return head;
	}
	
	
	public static void main(String[] args) {
		
		ListNode l1=new ListNode(1);
		ListNode l2=new ListNode(2);
		ListNode l3=new ListNode(3);
		ListNode l4=new ListNode(4);
		ListNode l5=new ListNode(5);
		
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		print(l1);
		
		ListNode head=reverseLinkedlist(l1);
		print(head);
		
		
	}
	
	
}
