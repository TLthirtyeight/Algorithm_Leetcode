package combinationSum;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	 public List<List<Integer>> combinationSum(int[] candidates, int target) {
		   List<List<Integer>> list = new ArrayList<>();
		   // Arrays.sort(nums); // not necessary
		   int[] canUsed=new int[candidates.length];
		   backtrack(list, new ArrayList<Integer>(), candidates,0,target,0);
		   return list;
	    }
	 
		private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums,int tempsum,int target,int start){
			   if(tempsum == target){
			      list.add(new ArrayList<>(tempList));
			      return ;
			   }else if(tempsum>target){
				   return ;
			   }else{
			      for(int i = start; i < nums.length; i++){ 
			    	  
			    		  tempsum+=nums[i];
					         tempList.add(nums[i]);
					         backtrack(list, tempList, nums,tempsum,target,i);
					         tempsum-=nums[i];
					         tempList.remove(tempList.size() - 1);
			    	  
			       
			         
			      }
			   }
			}
		
		public static void main(String[] args) {
			int[] nums={2, 3, 6, 7};
			Solution s=new Solution();
			List<List<Integer>>  result=s.combinationSum(nums, 7);
			System.out.println(result);
		}
	 
}
