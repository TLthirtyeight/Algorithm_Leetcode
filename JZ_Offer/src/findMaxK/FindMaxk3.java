package findMaxK;

public class FindMaxk3 {
      
	    public int findMaxK(int[] nums,int k){
	    	if(k<1||nums==null){
	    		return -99;
	    	}
	    	int result=getKthNum( nums,nums.length-k,0,nums.length-1);
	    	
	    	return nums[result];
	    }

		private int getKthNum(int[] nums,int k, int start, int end) {
			// TODO Auto-generated method stub
			
			if(start<end){
				int pivot=nums[end];
				int i=start-1;
				for(int j=start;j<end;j++){
					if(nums[j]<pivot){
						i++;
						swap(nums,i,j);
					}
				}
				i++;
				swap(nums,i,end);
				
				if(k==i){
					return i;
				}else if(k<i){
					return getKthNum(nums, k, start, i-1);
				}else{
					return getKthNum(nums, k, i+1, end);
				}
				
			}
			
			return start;
		
			
			
			
			
		}
	
		private void swap(int[] arrays,int i,int j){
			int temp=arrays[i];
			arrays[i]=arrays[j];
			arrays[j]=temp;
		}
		
		public static void main(String[] args) {
			int[] nums={4,7,2,1,5,8,3};
			FindMaxk3 fm3=new FindMaxk3();
			System.out.println(fm3.findMaxK(nums, 4));
			
		}
		
	
}
