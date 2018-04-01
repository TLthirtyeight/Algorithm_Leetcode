package combinationSum2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		  List<List<Integer>> result=new ArrayList<List<Integer>>();
	      Arrays.sort(candidates);
		  backtrack(result, new ArrayList<Integer>(), candidates,0,0,target);
		  return result;
		  
	  } 
	  
	  
	  public void backtrack(List<List<Integer>> result,List<Integer> templist,int[] candidates,int start ,int tempsum,int target){
		  
		  if(tempsum==target){
			  result.add(new ArrayList<Integer>(templist));//result.add(templist);
			  return ;
		  }else if(tempsum>target){
			  return ;
		  }
		  for(int i=start;i<candidates.length;i++){
			  if(i>start&&candidates[i]==candidates[i-1])continue;
			  templist.add(candidates[i]);
			  tempsum+=candidates[i];
			  backtrack(result, templist, candidates,i+1, tempsum, target);
			  tempsum-=candidates[i];
			  templist.remove(templist.size()-1);
			  
		  }
		  
	  }
	  public static void main(String[] args) {
		Solution s=new Solution();
		int[] candidates={10, 1, 2, 7, 6, 1, 5};
//		List<List<Integer>> result=s.combinationSum2(candidates, 8);
//		System.out.println(result);
		List<List<Integer>>  l=new ArrayList<List<Integer>>();
		List<Integer> templist=new ArrayList<Integer>();
		templist.add(1);
		templist.add(2);
		templist.add(3);
		l.add(templist);
		templist.remove(1);
		System.out.println(l);
		
	}
	  
}
