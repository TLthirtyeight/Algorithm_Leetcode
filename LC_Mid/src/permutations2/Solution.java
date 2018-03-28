package permutations2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	  public List<List<Integer>> permuteUnique(int[] nums) {
		  List<List<Integer>> list = new ArrayList<>();
		    Arrays.sort(nums); // not necessary
		    int[] canbeusednum=new int[nums.length];
		   backtrack(list, new ArrayList<Integer>(), nums,canbeusednum);
		   return list;
	    }
	  
	/****
	 * 两个问题。1）如何去除多余分支 ，就是前面它的兄弟节点就是和它一样的。  if(i!=0&&nums[i]==nums[i-1]&&canbeusednum[i-1]==0)continue;
	 * 2）如何去除重复分支。使用一个数组记录那些已经被用了的
	 * 
	 */
	  

		private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums,int[] canbeusednum ){
		   if(tempList.size() == nums.length){
		      list.add(new ArrayList<>(tempList));
		   } else{
		      for(int i = 0; i < nums.length; i++){ 
		     //    if(tempList.contains(nums[i])) continue; // element already exists, skip
		    	
		    	 if(canbeusednum[i]==1)continue;
		         if(i!=0&&nums[i]==nums[i-1]&&canbeusednum[i-1]==0)continue;
		         canbeusednum[i]=1;
		         tempList.add(nums[i]);
		         backtrack(list, tempList, nums,canbeusednum);
		         tempList.remove(tempList.size() - 1);
		         canbeusednum[i]=0;
		      }
		   }
		}
	  
		public static void main(String[] args) {
			Solution s=new Solution();
			int[] nums={1,1,2,2};
			 List<List<Integer>> list =s.permuteUnique(nums);
			 System.out.println(list);
		}
}
