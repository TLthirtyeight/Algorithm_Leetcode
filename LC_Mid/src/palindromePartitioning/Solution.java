package palindromePartitioning;

import java.util.ArrayList;
import java.util.List;

public class Solution {
   public List<List<String>> partition(String s) {
	   List<List<String>> list = new ArrayList<>();
	   // Arrays.sort(nums); // not necessary
	   backtrack(list, new ArrayList<String>(), s,0);
	   return list;
    }
   
   

	private void backtrack(List<List<String>> list, List<String> tempList, String s,int start){
	   if(start>= s.length()){
	      list.add(new ArrayList<>(tempList));
	   } else{
	      for(int i = start; i < s.length(); i++){ 
	    	 String tempString=s.substring(start,i+1);
	         if(isPalin(tempString)){
	        	 tempList.add(tempString);
		         backtrack(list, tempList, s,i+1);
		         tempList.remove(tempList.size() - 1); 
	         }
	         
	      }
	   }
	}
   
   public static boolean isPalin(String s){
	   if(s==null||s.equals("")||s.equals(" ")  ){
		   return false;
	   }
	   int start=0,end=s.length()-1;
	   while(start<=end){
		   if(s.charAt(start)==s.charAt(end)){
			   start++;
			   end--;
		   }else{
			   return false;
		   }
		  
	   }
	   return true;
   }
   
   
   public static void main(String[] args) {
	String s="aab";
	//System.out.println(isPalin(s));
	//System.out.println(s.substring(0,1));
	Solution sl=new Solution();
	List<List<String>> result=sl.partition(s);
	System.out.println(result);
  }
}
