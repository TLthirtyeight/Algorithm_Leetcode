package countandSay;

class Solution {
    public String countAndSay(int n) {
	     if(n==1){
	    	 return "1";
	     }else{
	    	 String tempforward=countAndSay(n-1);
	    	 return statistics(tempforward);
	     }
	     
		  
		  
		 
	    }
	  //统计n-1
	  public String statistics(String s){
		  int[] numlist=new int[10000];
		  int[]  numcountlist=new int[10000];
		  char tempa=' ';
		  char tempb=' ';
		  int numlistlength=0;
		  int i,j;
		  for( i=0;i<s.length();){
			  numlist[numlistlength++]=Integer.parseInt(s.charAt(i)+"");
			  tempa=s.charAt(i);
			  for( j=i;j<s.length();j++){
				  tempb=s.charAt(j);
				  if(tempa==tempb){
					  numcountlist[numlistlength-1]++;
				  }else{
					  i=j;
					  break;
				  }
				 
			  }
			  if(j==s.length()){
				  break;
			  }
			  
		  }
		 
		  /************统计后得出转换的************/
		  return getResultByList(numlist, numcountlist,numlistlength);
		  
	  } 
	  
	  public String getResultByList(int[] numlist,int[] numcountlist,int numlistlength){
		  String result="";
		  for(int i=0;i<2*numlistlength;i++){
			  if(i%2==0){
				  //numcountlist
				  result+=numcountlist[i/2];
			  }else{
				  result+=numlist[i/2];
			  }
			  
			  
		  }
		  
		  return result;
	  }
}