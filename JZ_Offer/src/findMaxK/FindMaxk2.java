package findMaxK;



public class FindMaxk2 {
	  public static int findKthLargest(int[] nums, int k) {
	        if (k < 1 || nums == null) {
	            return 0;
	        }

	        return getKth(nums.length - k , nums, 0, nums.length - 1);//相当于找下标值，如，有7个数，第1大的数那就是找下标为6(7-1)，第二大就是下标为5（7-2）
	    }

	    public static int getKth(int k, int[] nums, int start, int end) {

	        int pivot = nums[end];         //其实这个函数最主要的目的就是返回一个下标，是的start~k  <K <=  k~end   (找下标)

	        int left = start;
	        int right = end;

	        while (true) {

	            while (nums[left] < pivot && left < right) {
	                left++;
	            }

	            while (nums[right] >= pivot && right > left) {
	                right--;
	            }

	            if (left == right) {
	                break;
	            }

	            swap(nums, left, right);
	        }

	        swap(nums, left, end);

	        if (k == left ) {     //
	            return pivot;
	        } else if (k < left ) {
	            return getKth(k, nums, start, left - 1);
	        } else {
	            return getKth(k, nums, left + 1, end);
	        }
	    }

	    public static void swap(int[] nums, int n1, int n2) {
	        int tmp = nums[n1];
	        nums[n1] = nums[n2];
	        nums[n2] = tmp;
	    }
	    public static void main(String[] args) {
			int []nums={4,7,2,1,5,8,3};
			System.out.println(findKthLargest(nums, 5));
		}
}

