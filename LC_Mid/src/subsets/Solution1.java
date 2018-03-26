package subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1 {
	public List<List<Integer>> subsets(int[] nums) {
	    List<List<Integer>> list = new ArrayList<>();
	    Arrays.sort(nums);
	    backtrack(list, new ArrayList<Integer>(), nums, 0);
	    return list;
	}

	private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
	    list.add(new ArrayList<>(tempList));
	    for(int i = start; i < nums.length; i++){
	        tempList.add(nums[i]);
	        System.out.println("进入前 "+"templist "+tempList+"  i "+i+" start "+start);
	        backtrack(list, tempList, nums, i + 1);
	        tempList.remove(tempList.size() - 1);
	        System.out.println("删除后 "+"templist "+tempList+"  i "+i+" start "+start);
	    }
	}
	
	public static void main(String[] args) {
		Solution1 s1=new Solution1();
		int[] nums={1,2,3};
		List<List<Integer>> list=s1.subsets(nums);
		System.out.println(list);
	}
}
