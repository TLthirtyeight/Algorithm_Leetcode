package question47;

public class Solution {
      public  int getMaxValue(int [][] gift){
    	   int row=gift.length;
    	   int col=gift[0].length;
    	   int[][] values=new int[row+1][col+1];
    	   for(int i=row-1;i>=0;i--){
    		   for(int j=col-1;j>=0;j--){
    			   values[i][j]=Math.max(values[i+1][j], values[i][j+1])+gift[i][j];
    		   }
    	   }
    	  return values[0][0];
       }
      public static void main(String[] args) {
		Solution s=new Solution();
		int[][] gift={  {1,10,3,8},
				{12,2,9,6},
				{5,7,4,11},
				{3,7,16,5}
				
		};
		int result=s.getMaxValue(gift);
		System.out.println(result);
	}
}
