package maximumSubarray;

public class Solution {
	    public int maxSubArray(int[] nums) {
	        int[] b=new int[nums.length];
	        b[0]=nums[0];
	        int sum=b[0];
	        for(int i=1;i<nums.length;i++){
	        	if(b[i-1]<=0){
	        		b[i]=nums[i];
	        	}else{
	        		b[i]=b[i-1]+nums[i];
	        	}
	        	sum=b[i]>sum?b[i]:sum;
	        }
	        return sum;
	    }
	 public static void main(String[] args) {
		Solution s=new Solution();
		int[] nums={-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(s.maxSubArray(nums));
	}
}
