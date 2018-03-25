package removeElement;

public class Solution {
	 public int removeElement(int[] nums, int val) {
         if(nums==null||nums.length==0){
	    	 return 0;
	     }
	     int left=-1,right=0;
	     for(right=0;right<nums.length;right++){
	    	 if(nums[right]!=val){
	    		 left++;
	    		 nums[left]=nums[right];
	    	 }
	    	 
	    	 
	     }
	     return left+1;
  }
}
