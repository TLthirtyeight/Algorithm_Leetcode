package combinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2 {
	   public List<List<Integer>> combinationSum(int[] candidates, int target) {
	        List<List<Integer>> res = new ArrayList<>();
	        Arrays.sort(candidates);
	        backtrack(candidates, target, 0, res, new ArrayList<Integer>());
	        return res;
	    }
	    
	   
	   //排了序之后直接break的话效率比较高
	    private void backtrack(int[] candidates, int target, int start, List<List<Integer>> res, List<Integer> list) {
	        if (target == 0) {
	            res.add(new ArrayList<>(list));
	            return;
	        }
	        for (int i = start; i < candidates.length; i++) {
	            if (target < candidates[i]) break;
	            if (target >= candidates[i]) {
	                list.add(candidates[i]);
	                backtrack(candidates, target - candidates[i], i, res, list);
	                list.remove(list.size() - 1);
	            }
	        }
	    }
}
