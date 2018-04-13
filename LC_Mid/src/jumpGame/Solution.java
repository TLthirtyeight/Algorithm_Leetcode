package jumpGame;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	  public boolean canJump(int[] nums) {
	      int totallength=nums.length-1;
	      boolean[] note=new boolean[nums.length];
		  return backtrack( nums,0,nums.length-1,note);
		  
	    }

	private boolean backtrack(int[] nums, 
			int start,int end,boolean[] note) {
		if(note[start]==false){
			if(start==end)
			    return true;
			int steps=nums[start];
			boolean result=false;
			for(int i=start+1;i<=start+steps;i++){
				if(i>end)continue;
				boolean tempresult=backtrack(nums, i, end,note);
				result=result||tempresult;
				if(result==true)return true;
			}
			return result;
		}
		note[start]=true;
	    return false;
		
	}
	public static void main(String[] args) {
		int[] nums={3,2,1,0,4};
		Solution s=new Solution();
		System.out.println(s.canJump(nums));
	}
}
