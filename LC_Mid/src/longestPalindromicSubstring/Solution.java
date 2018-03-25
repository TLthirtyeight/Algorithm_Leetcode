package longestPalindromicSubstring;

class Solution {
		  public String longestPalindrome(String s) {
	  if(s.length()==0){
		  return null;
	  }
	  int slen=s.length();
	  short[][] isPal=new short[slen][slen];
	  int palhead=0,paltail=0;
	  int maxPalLen=1;
	  for(int i=0;i<s.length();i++){
		  isPal[i][i]=1;
	  }
	
		  for(int l=1;l<slen;l++){
			  for(int i=0;i+l<slen;i++){
			  int j=i+l;
			  if(l==1){
				  if(s.charAt(i)==s.charAt(j)){
					  isPal[i][j]=1;
					  if(j-i+1>maxPalLen){
						  palhead=i;paltail=j;
					  }
				  }
			  }else{
				  if(isPal[i+1][j-1]==1&&s.charAt(i)==s.charAt(j)){
					  isPal[i][j]=1;
					  if(j-i+1>maxPalLen){
						  palhead=i;paltail=j;
					  }
				  }
				  
				  
			  }
		  }
		  
		  
	  }
	  
       
	  return s.substring(palhead, paltail+1);
  }
}
