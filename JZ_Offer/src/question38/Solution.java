package question38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	 public List<List<Integer>> printCombination(int[] candidates) {
	        List<List<Integer>> res = new ArrayList<>();
	        Arrays.sort(candidates);
	        backtrack(candidates, 0, res, new ArrayList<Integer>());
	        return res;
	    }
	    
	   
	   //排了序之后直接break的话效率比较高
	    private void backtrack(int[] candidates, int start, List<List<Integer>> res, List<Integer> list) {
//	        if (target == 0) {
//	            res.add(new ArrayList<>(list));
//	            return;
//	        }
//	        for (int i = start; i < candidates.length; i++) {
//	            if (target < candidates[i]) break;
//	            if (target >= candidates[i]) {
//	                list.add(candidates[i]);
//	                backtrack(candidates, target - candidates[i], i, res, list);
//	                list.remove(list.size() - 1);
//	            }
//	        }
	    
	    		for(int i=start;i<candidates.length;i++){
	    			list.add(candidates[i]);
	    			res.add(new ArrayList<Integer>(list));
	    			backtrack(candidates, i+1, res, list);
	    			list.remove(list.size()-1);
	    		}
	    	
	    	
	    }
	    public static void main(String[] args) {
			Solution s=new Solution();
			int [] array={1,2,3,4};
			List<List<Integer>> res=s.printCombination(array);
			System.out.println(res.size());
			System.out.println(res);
		}
}
