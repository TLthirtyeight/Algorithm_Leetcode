package removeDuplicatesfromSortedArray;

class Solution {
    public int removeDuplicates(int[] nums) {
		   int numslength=nums.length;
		   int tempnumslength=numslength;
		 if(numslength==1){
			 return 1;
		 }
		 if(numslength==0){
			 return 0;
		 }
	     int left=0,right=1;
	  
	     int duplicatenum=0;
	     int leftval=-1;int rightval=-1;
	     while(right<tempnumslength){
	    	 leftval=nums[left];
	    	 rightval=nums[right];
	    	 if(leftval==rightval){
	    		 moveDuplicate(nums,right,tempnumslength);
	    		 duplicatenum++;
	    		 tempnumslength--;
	    		 
	    	 }else{
	    		 left++;
		    	 right++;
	    	 }
	    	 
	     }
	     
	 
	     
		 return numslength-duplicatenum;
   }
	
	public  void moveDuplicate(int[] nums,int dupnumPosition,int numslength){
		 for(int i=dupnumPosition;i<numslength;i++){
			 nums[i-1]=nums[i];
		 }
		
		
		
	}
}