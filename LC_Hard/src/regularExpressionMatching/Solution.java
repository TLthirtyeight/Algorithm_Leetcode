package regularExpressionMatching;

public class Solution {
	   public boolean isMatch(String s, String p) {
	        int s_len=s.length();
	        int p_len=p.length();
	        int s_ptr=0,p_ptr=0;
	        
	        if(s.equals(" ")||p.equals(" ")||s_len==0){
	        	return true;
	        }
	        
	       
	        
	        char head_s=s.charAt(0);
	        char head_p=p.charAt(0);
	        if(s_len==1&&p_len==1)
	        	return head_p==head_s;
	        
	        char second_p=p.charAt(1);
	        if(second_p=='*'){
	        	if(head_s==head_p||head_p=='.'){
	        		String s1="";
	        		String p1="";
	        		String p2="";
	        		if(s_len==1)
	        			s1=" ";
	        		s1=s.substring(1, s.length());
	        		if(p_len==2&&head_p!='.'){
	        			p1=p2=" ";
	        			return isMatch(s1,p1)||isMatch(s1,p2);	
	        		}else if(p_len==2){
	        			p1=new String(p);
	        			return isMatch(s1,p1);
	        		}
	        		else{
	        			p1=new String(p);
	        			p2=p.substring(2,p.length());
	        			return isMatch(s1,p1)||isMatch(s1,p2);	
	        		}
	        		
	        		
	        		
	        	}else{
	        		String p3="";
	        		if(p_len==2)
	        			p3=" ";
	        		else{
	        			p3=p.substring(2,p.length());
	        		}
	        		return isMatch(s, p3);
	        	}
	        	
	        	
	        }
	    else if(head_p=='.'){
	    	String news="";
	    	if(s_len==1)
	    		news=" ";
	    	news=s.substring(1,s.length());
	    	String p4="";
    		if(p_len==2)
    			p4=" ";
    		else{
    			p4=p.substring(2,p.length());
    		}
    		return isMatch(news, p4);
	    }else if(head_s==head_p){
	    	String news="";
	    	if(s_len==1)
	    		news=" ";
	    	news=s.substring(1,s.length());
	    	
	    	String newp="";
	    	   if(p_len==1)
	    		   newp=" ";
	    	   newp=p.substring(1,p.length());
	    	return isMatch(news, newp);
	    }
	        return false;
 }
	   
	   public static void main(String[] args) {
		String s="aa";
		String p="a";
		Solution sl=new Solution();
		System.out.println(sl.isMatch(s, p));
		
	}
	   
	   
}
