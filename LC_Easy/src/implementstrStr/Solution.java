package implementstrStr;

class Solution {
	  public int strStr(String haystack, String needle) {
		  if(haystack==null||needle==null){
			  return -1;
		  }else if(needle.length()==0){
			  return 0;
		  }
		  if(needle.length()>haystack.length()){
			  return -1;
		  }
		  char tempchar=' ';
		  char needlechar0=needle.charAt(0);
		  int needlelength=needle.length();
		for(int i=0;i<haystack.length();i++){
		      tempchar=haystack.charAt(i);
		      if(tempchar==needlechar0){
		    	  int matchlength=1;
		    	  while(matchlength<needlelength){
		    		  if(i+matchlength<haystack.length()){
		    			  char tempc1=haystack.charAt(i+matchlength);
			    		  char tempc2=needle.charAt(matchlength);
			    		  if(tempc2==tempc1){
			    			  matchlength++;
			    		  }else{
			    			  break;
			    		  } 
		    		  }
		    		  else{
		    			  break;
		    		  }
		    		  
		    	  }
		    	if(matchlength==needlelength) return i;
		    	  
		      }
		}
		  return -1;
	    }
}