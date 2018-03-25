package fourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
	 public List<List<Integer>> fourSum(int[] nums, int target) {
     Arrays.sort(nums);
     List<List<Integer>> result=new ArrayList<List<Integer>>();
     for(int i=0;i<nums.length-3;i++){
   	  if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
   		         int[] temp=new int[nums.length-i-1];
   				  System.arraycopy(nums, i+1,  temp,0, nums.length-i-1);
   				 
   				  List<List<Integer>> tempresult=threeSum(temp, target-nums[i]);
   				  addFirstEle(result,tempresult,nums[i]);
   				  
   	  }
     }
	 
	 
	 return result;
   }

public void addFirstEle(   List<List<Integer>> r,   List<List<Integer>> tr,int firstele){
	 Integer te=new Integer(firstele);
	 for(int i=0;i<tr.size();i++){
		 List<Integer> list=new ArrayList<Integer>(tr.get(i));
		 list.add(te);
		 r.add(list);
	 }
	 
}

public static int[] copyOf(int[] original, int newLength) {
	 int[] copy=new int[newLength];
	 System.arraycopy(original, 0, copy, 0, Math.min(original.length, newLength));
   return copy;
}

public static int[] test={
	 -1, 0, 1, 2, -1, -4
};
public static int[] test1={
	 1, 0, -1, 0, -2, 2
};
public  List<List<Integer>> threeSum(int[] nums, int target) {
    List<List<Integer>> result=new ArrayList<List<Integer>>();
    Arrays.sort(nums);
    int left,right,c;
    for(int i=0;i<nums.length-2;i++){
   	  if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
   			 left=i+1; right=nums.length-1;
   	    	 c=target-nums[i];
   	    	 while(left<right){
   	    		 if(left<right&&nums[left]+nums[right]<c){
   	    			 left++;
   	    		 }else if(left<right&&nums[left]+nums[right]>c){
   	    			 right--;
   	    		 }else{
   	    			 result.add(Arrays.asList(nums[i],nums[left],nums[right]));
   	    			 while(left<right&&nums[left]==nums[left+1]){
   	    				 left++;
   	    			 }
   	    			 left++;
   	    			 while(  left<right&&nums[right]==nums[right-1]){
   	    				 right--;
   	    			 }
   	    			 right--;
   	    		 }
   	     	 } 
   	  }
   
   	
   	 
    }
	 return result;
   }
}