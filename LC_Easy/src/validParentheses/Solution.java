package validParentheses;

import java.util.Stack;

class Solution {
  	
	   public boolean isValid(String s) {
		   if(s.length()<2){
			   return false;
		   }
		   Stack<String>  stack=new Stack<String>();
		   stack.clear();
	       boolean result=true;
	       String tempright="";
			  char tr=' ';
	       
		   for(int i=0;i<s.length();i++){
			   char temp=s.charAt(i);
			   switch(temp){
			       case'(':
				   stack.add("(");
				   break;
			   
			       case '{':
			    	   stack.add("{");
				    break;
			       
			       case'[':
			    	   stack.add("[");
				break;
			   
			       case')':
			    	   if(stack.isEmpty()){
			    		   return false;
			    	   }
					   tempright=stack.pop();
					   tr=tempright.charAt(0);
					  if(tr!='(')return false;
					   break;
				   
				       case'}':
				    	   if(stack.isEmpty()){
				    		   return false;
				    	   }
				    	    tempright=stack.pop();
							   tr=tempright.charAt(0);
							  if(tr!='{')return false;
					    break;
				       
				       case']':
				    	   if(stack.isEmpty()){
				    		   return false;
				    	   }
				    	   tempright=stack.pop();
						   tr=tempright.charAt(0);
						  if(tr!='[')return false;
				    	 
					break;
			   
			   }
			   
			   
		   }
	       if(!stack.isEmpty()){
	    	   return false;
	       }
		   return result;
	    }
}