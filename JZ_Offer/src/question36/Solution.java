package question36;



class Node{
	public int val;
	public Node left;
	public Node right;
	public Node(int v){
		this.val=v;
	}
}


public class Solution {
	
	public static void printTree(Node tree){
		if(tree.left==null&&tree.right==null){
			System.out.println(tree.val);
		}else{
			if(tree.left!=null){
				printTree(tree.left);
			}
			System.out.println(tree.val);
			if(tree.right!=null){
				printTree(tree.right);
			}
		}
		
	}
	
	public static void print(Node ln){
		while(ln!=null){
			System.out.print(ln.val+" ");
			ln=ln.right;
		}
		System.out.println();
	}
	
	public static void printBack(Node ln){
		while(ln!=null){
			System.out.print(ln.val+" ");
			ln=ln.left;
		}
		System.out.println();
	}
	
	public static Node solve(Node treenode){
//		if(treenode.left==null&&treenode.right==null){
//			return treenode;
//		}else{
//			Node leftchild=solve(treenode.left);
//			leftchild.right=treenode;
//			treenode.left=leftchild;
//			
//			Node rightchild=solve(treenode.right);
//		    treenode.right=rightchild;
//		    rightchild.left=treenode;
//		    
//		    return treenode;
//		}
		Node thelastnodeinlast=null;
		convert(treenode, thelastnodeinlast);
		Node head=null;
		while(thelastnodeinlast!=null&&thelastnodeinlast.left!=null){
			thelastnodeinlast=thelastnodeinlast.left;
		}
		head=thelastnodeinlast;
		return head;
		
	}
	
	public static void convert(Node treenode, Node thelastNodeInList){
		if(treenode==null)
			return;
		if(treenode.left==null&&treenode.right==null){
			thelastNodeInList=treenode;
			return;
		}
		if(treenode.left!=null){
			convert(treenode.left, thelastNodeInList);
		}
		thelastNodeInList.right=treenode;
		treenode.left=thelastNodeInList;
		thelastNodeInList=treenode;
		
		if(treenode.right!=null){
			convert(treenode.right, thelastNodeInList);
		}
		
			
		
	}
	public static Node thelastnode=null;
	
	public static Node solve1(Node treenode){
		
		
		convert1(treenode);
		Node head=thelastnode;
		while(head!=null&&head.left!=null){
			head=head.left;
		}
		
		return head;
	}
	 
	public static void convert1(Node treenode){        //这个算法还是不太熟  
		if(treenode.left==null&&treenode.right==null){  //一下子想出来，之后还是要再想想才懂。。。。我不明白在哪里呢？
			if(thelastnode==null){
				thelastnode=treenode;
			}else{
				thelastnode.right=treenode;
				treenode.left=thelastnode;
				thelastnode=treenode;
			}
				
			
		}else{
			
			convert1(treenode.left);
			
			thelastnode.right=treenode;
			treenode.left=thelastnode;
			thelastnode=treenode;
			
			
			convert1(treenode.right);
			
			
		}
		
		
	}
	
	
    public static void main(String[] args) {
	
		Node val1=new Node(1);
		Node val2=new Node(2);
		Node val3=new Node(3);
		Node val4=new Node(4);
		Node val5=new Node(5);
		Node val6=new Node(6);
		Node val7=new Node(7);
		Node val8=new Node(8);
		Node val9=new Node(9);
		Node val10=new Node(10);
		Node val11=new Node(11);
		Node val12=new Node(12);
		Node val13=new Node(13);
		Node val14=new Node(14);
		Node val15=new Node(15);
		Node val16=new Node(16);
		
		val8.left=val4;
		val8.right=val12;
		
		val4.left=val2;
		val4.right=val5;
		
		val2.left=val1;
		val2.right=val3;
		
		val5.left=val6;
		val5.right=val7;
		
		
		val12.left=val10;
		val12.right=val14;
		
		
		val10.left=val9;
		val10.right=val11;
		
		val14.left=val13;
		val14.right=val15;
		
		printTree(val8);
		System.out.println("**************************************");
	Node head=	solve1(val8);
	print(head);	
		printBack(thelastnode);
		
	}       
	
	
}
