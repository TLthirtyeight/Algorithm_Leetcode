package findMaxK;

import java.util.PriorityQueue;

public class Quick_find {
	  public static int partition(int[] arr,int low,int high){  
	        int temp=arr[low];  
	        while(low<high){  
	            while(arr[high]<=temp&&high>low)  
	                --high;  
	            arr[low]=arr[high];  
	            while(arr[low]>=temp&&low<high)  
	                ++low;  
	            arr[high]=arr[low];  
	        }  
	        arr[high]=temp;  
	        return high;          
	    }  
	    public static void find_k(int k,int[] arr,int low,int high){  
	        int temp=partition(arr,low,high);  
	        if(temp==k-1){  
	            System.out.print("第"+k+"大的数是："+arr[temp]);  
	        }else if(temp>k-1){  
	            find_k(k,arr,low,temp-1);             
	        }else{  
	            find_k(k-temp,arr,temp+1,high);  
	        }  
	    }  
	    public static int findKthLargest(int[] nums, int k) {
	        PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
	        for (int i : nums) {
	            q.offer(i);

	            if (q.size() > k) {
	                q.poll();
	            }
	        }

	        return q.peek();
	    }
	  
	    public static void main(String[] args) {  
	        int[] arr={3,1,2,5,4,7,6};  
	        find_k(3,arr,0,arr.length-1);  
	    }  
}
