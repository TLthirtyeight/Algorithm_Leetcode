package permutations;

import java.util.ArrayList;
import java.util.List;

class Solution {
	   public List<List<Integer>> permute(int[] nums) {
		        int len=nums.length;
		        List<List<Integer>> result=new ArrayList<List<Integer>>();
			    recursive(0,result,nums);
			    
			    
			    return result;
			 
		    }
		 
		 public void  recursive(int depth,List<List<Integer>> result,int[] nums){
			 if(depth==nums.length){
				 result.add(arrays2List(nums));
				 return;
			 }else{
				 for(int j=depth;j<nums.length;j++){
					 swap(j,depth,nums);
					 recursive(depth+1, result, nums);
					 swap(j,depth,nums);
				 }
				 
				 
			 }
			 
			 
		 }
		 public void swap(int x,int y,int[ ] array){
	 		int temp=array[x];
	 		array[x]=array[y];
	 		array[y]=temp;
	 	}
		 public List<Integer> arrays2List(int[] nums){
			 List<Integer> list=new ArrayList<Integer>();
			 for(int i=0;i<nums.length;i++){
				 list.add(nums[i]);
			 }
			 return list;
		 }
	}