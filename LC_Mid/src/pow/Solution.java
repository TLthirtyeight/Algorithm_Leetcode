package pow;

public class Solution {
	 public double myPow(double x, int n) {
		 long l_n=n;
	        if(n>=0){
	        	  if(l_n==0)return 1;
	 		     if(l_n==1)return x;
	 		     if((l_n&1)==0){
	 		    	// return  myPow(x, n/2)*myPow(x, n/2);   //超时
	 			     return myPow(x*x, n/2);
	 		     }else{
	 		    	 //return x*myPow(x, n/2)*myPow(x, n/2);
	 		    	 return x*myPow(x*x, n/2);
	 		     }
	        }else{
	        	long tempn=-l_n;
	        	//return 1/myPow(x, tempn);
	        }
		   
		    	 
		     
		 
	    }
	 public static void main(String[] args) {
		Solution s=new Solution();
		double x=34.00515;
		int n=-3;
	//	System.out.println(s.myPow(1.000, -2147483648));
		System.out.println(Integer.MAX_VALUE);
	}
	 
}
