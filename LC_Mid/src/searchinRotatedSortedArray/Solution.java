package searchinRotatedSortedArray;

class Solution {
	 public int search(int[] nums, int target) {
	        int minindex=searchMinIndex(nums);
	        int result=-1;
	        if(minindex==0){
	        	return binarySearch(target,0,nums.length-1,nums);
	        }
	        if((result=binarySearch(target,0,minindex-1,nums))>=0){
	        	return  result;
	        }
	        if((result=binarySearch(target,minindex,nums.length-1,nums))>=0){
	        	return  result;
	        }
		 
		     return result;
	    }
	 
	 
  
	 
	 public int searchMinIndex(int[] nums){
		 int result=-1;
	        int left=0;int right=nums.length-1;
	        int middle=left;
	        int minindex=left;
	        while(left<right){
	        	
	        	middle=(left+right)/2;
	        	if(right-left==1){
	        		minindex=right;
	        		break;
	        	}
	        	if(nums[middle]>nums[left]){
	        		left=middle;
	        	}else if(nums[middle]<nums[right]){
	        		right=middle;
	        	}
	        	
	        }
	        
	        return minindex;
	 }
	 
	  public int binarySearch(int key,int left,int right,int[] array){
	    	while(left<=right){
	    		int middle=(left+right)/2;
	    		if(array[middle]==key){
	    			return middle;
	    		}else if(array[middle]<key){
	    			left=middle+1;
	    		}else{
	    			right=middle-1;
	    		}
	    		
	    		
	    	}
	    	return -1;
	     }
}