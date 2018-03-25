package subsets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
	   List<List<Integer>> result=new ArrayList<List<Integer>>();
	   //空集
	   List<Integer> emptyset=new ArrayList<Integer>();
	   result.add(emptyset);
	   for(int i=0;i<nums.length;i++){
		   int element=nums[i];
		   constructResult(result,element);
	   }
	   return result;
    }
   
     public void constructResult(List<List<Integer>> result,int element){
    	     Iterator<List<Integer>> it=result.iterator();
    	     List<List<Integer>> tempresult=new ArrayList<List<Integer>>();
     	     while(it.hasNext()){
    	    	 List<Integer> temp=new ArrayList<Integer>(it.next());
        		 temp.add(element); 
        		 tempresult.add(temp);
    	     }
    		result.addAll(tempresult);
    	 
     }
}