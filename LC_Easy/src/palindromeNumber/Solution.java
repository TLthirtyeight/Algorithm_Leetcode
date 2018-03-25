package palindromeNumber;

class Solution {
    public boolean isPalindrome(int x) {
      boolean result=true;
	    
	     String s=String.valueOf(x);
	     if(x<0){
	    	 return false;
	     }
	     for(int i=0;i<s.length()/2;i++){
	    	 if(s.charAt(i)!=s.charAt(s.length()-1-i))
	    		 return false;
	     }
	     
	     
	     
	     return result;
    }
}