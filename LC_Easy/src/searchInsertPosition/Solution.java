package searchInsertPosition;

class Solution {
	
	 public int searchInsert(int[] nums, int target) {
	     int numslength=nums.length;
		 if(target>nums[numslength-1]){
			 return numslength;
		 }
		 if(target<nums[0]){
			 return 0;
		 }
		 if(numslength==1){
			 if(nums[0]<=target){
				 return 0;
			 }else {
				 return 1;
			 }
		 }
		 int low=0,high=numslength-1,middle=-1;
		 while(low<=high){
			 middle=(low+high)/2;
			 if(high-low==1){
				 if(nums[low]==target){
					 return low;
				 }else{
					 return high;
				 }
			 }else{
				 if(nums[middle]==target){
					 return  middle;
				 }else if(target<nums[middle]) {
					 high=middle;
				 }else{
					 low=middle;
				 }
			 }
			 
		 }
		 return -1;
	    }
}
