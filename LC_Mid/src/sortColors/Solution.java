package sortColors;

public class Solution {
	/***
	 * 问题1：i一定大于等于tailZero吗？   是的。nums[i]==0的时候i++，tailZero++
	 * 
	 * 
	 * 
	 * 
	 * 问题2；为什么0的时候i要加1而2的时候不用呢？
	 * 
	 * a.数组里只有0,1
	 * 
	 * 
	 *  a1.有点像quickSort中的partion方法。本来可以用两个一头一尾的指针，前面碰到1就停，后面碰到0就停，然后就交换
	 *  a2.也可以用算法导论里的那种for循环的方法，tailOne左边的全是0，tailZero到i之间的是1。其实现在也能解释问题3了。
	 *  
	 * 
	 * 问题3：循环条件为什么是i<=tailTwo?
	 * 
	 * 从上面的讨论可以知道tailTwo后的肯定是2
	 * 
	 */
	
	     public void sortColors(int[] nums) {
	        int sz=nums.length;
	        int tailZero=0;
	        int tailTwo=nums.length-1;
	        int i=tailZero;
	        while(i<=tailTwo){
	        	if(nums[i]==0){
	        		swap(nums,i++,tailZero++);
	        	}else if(nums[i]==2){
	        		swap(nums,i,tailTwo--);
	        	}else{
	        		i++;
	        	}
	        }
	    }
	     
	     public void swap(int[] array,int x,int y){
	    	 int temp=array[x];
	    	 array[x]=array[y];
	    	 array[y]=temp;
	     }
}
