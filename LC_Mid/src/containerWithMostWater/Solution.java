package containerWithMostWater;

import java.util.Arrays;

class Solution {
		 public String longestCommonPrefix(String[] strs) {
	 if(strs.length==0){
		 return "";
	 }
	 if(strs.length==1){
		 return strs[0];
	 }
	 String tempresult=commonPrefixWith2String(strs[0], strs[1]);
	    if(strs.length==2){
	    	return tempresult;
	    }else{
	    	for(int j=2;j<strs.length;j++){
	    		tempresult=commonPrefixWith2String(tempresult, strs[j]);
	    	}
	    	return tempresult;
	    }
    
   }


public String commonPrefixWith2String(String s1,String s2){
	 char[] temp=new char[100];
	 int templength=0;
	 for(int i=0;i<Math.min(s1.length(),s2.length());i++){
		 if(s1.charAt(i)==s2.charAt(i)){
			 temp[i]=s1.charAt(i);
			 templength++;
		 }else{
			 break;
		 }
	 }
	 if(templength>0){
		 return String.copyValueOf(Arrays.copyOf(temp, templength));
	 }else{
		 return "";
	 }
}
}
