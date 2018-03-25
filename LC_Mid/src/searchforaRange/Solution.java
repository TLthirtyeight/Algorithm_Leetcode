package searchforaRange;

class Solution {
    public int[] searchRange(int[] nums, int target) {
    int[] result=new int[2];
    result[0]=binarySearchForMinIndex(target, 0, nums.length-1, nums);
    result[1]=binarySearchForMaxIndex(target, 0, nums.length-1, nums);
    
    return result;
}
 
 public int binarySearchForMinIndex(int key,int left,int right,int[] array){
    	while(left<=right){
    		int middle=(left+right)/2;
    		if(array[middle]==key){
    			right=middle;
    			if(left==right){
    				return left;
    			}
    			//return middle;
    		}else if(array[middle]<key){
    			left=middle+1;
    		}else{
    			right=middle-1;
    		}
    		
    		
    	}
    	return -1;
     }
 
 
 public int binarySearchForMaxIndex(int key,int left,int right,int[] array){
    	while(left<=right){
    		int middle=(left+right)/2;
    		if(array[middle]==key){
    			left=middle;
    			if(left==right){
    				return left;
    			}
    			int temp=(left+right)/2;
    			if(right-left==1&&array[temp]==key){
    				return array[right]==key?right:left;
    			}
    			
    			//return middle;
    		}else if(array[middle]<key){
    			left=middle+1;
    		}else{
    			right=middle-1;
    		}
    		
    		
    	}
    	return -1;
     }
}