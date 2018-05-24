package permutationSequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	
	public 	List<List<Integer>>  permutations(int[ ] array){
		
		Arrays.sort(array);
		List<List<Integer>> result=new ArrayList<List<Integer>>();
		int[] canbeused=new int[array.length];
		backtrack(result, new ArrayList<Integer>(), 0,array,canbeused);
		return result;
		
	}
	
	
	private void backtrack(List<List<Integer>> result ,List<Integer> templist,int depth,int[] candidates,int[] canbeused){
		if(depth==candidates.length){
			//templist.add(candidates[depth]);
			result.add(new ArrayList<Integer>(templist));
		}else{
			for(int i=0;i<candidates.length;i++){
//				if(depth==0&&i==2){
//					System.out.println();
//				}
				if(canbeused[i]==0){
					templist.add(candidates[i]);
					canbeused[i]=1;
					backtrack(result, templist, depth+1, candidates, canbeused);
					canbeused[i]=0;
					templist.remove(templist.size()-1);
				}
				
				
				
				
			}
			
			
		}
		
		
	}
	
	 public String getPermutation(int n, int k) {
		 int[] array=new int[n];
		    for(int i=0;i<n;i++){
		    	array[i]=i+1;
		    }
			List<List<Integer>> result=permutations(array);
			List<Integer> templist=result.get(k-1);
			StringBuilder sb=new StringBuilder();
			for(Integer i:templist){
				sb.append(i);
			}
			return sb.toString();
	    }
}
