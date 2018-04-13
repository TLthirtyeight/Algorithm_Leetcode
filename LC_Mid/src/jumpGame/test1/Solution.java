package jumpGame.test1;



public class Solution {
	public static int  minIndexOfthefistture=0;
	 public boolean canJump(int[] nums) {
		 int len=nums.length;
		 if(len==1)return true;
		 boolean[] note=new boolean[len]; 
		 note[len-1]=true;
		 minIndexOfthefistture=len-1;
		 for(int i=len-2;i>=0;i--){
			 check(nums, i, note, len);
		 }
		 return note[0];
	 }
	 
	 public void check(int[] nums,int start,boolean[] note,int len ){   //时间复杂度n
		
		 int steps=nums[start];
		
//		 for(int i=start+1;i<=start+steps&&i<len;i++){
//			 if(note[i]==true){
//				 note[start]=true;
//				 return;
//			 }
//		 }
		 if(start+steps>=minIndexOfthefistture){
			 note[start]=true;
			 minIndexOfthefistture=start;
		 }
		 
	 }
	 
	 public static void main(String[] args) {
		 int[] nums={2,3,1,1,4};
			Solution s=new Solution();
			System.out.println(s.canJump(nums));
	}
}
