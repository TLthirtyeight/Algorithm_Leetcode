package minimumPathSum;

public class Solution {
	 public int minPathSum(int[][] grid) {
		 if(grid==null)return 0;
	     int row=grid.length;
	     int col=grid[0].length;
		 int [][] pathlengths=new int[row+1][col+1];
		 for(int i=0;i<=col;i++)
			 pathlengths[row][i]=Integer.MAX_VALUE;
		 for(int j=0;j<=row;j++)
			 pathlengths[j][col]=Integer.MAX_VALUE;
		 for(int i=row-1;i>=0;i--){
			 for(int j=col-1;j>=0;j--){
				 if(i==row-1&&j==col-1){
					 pathlengths[i][j]=grid[i][j];
				 }else{
					 pathlengths[i][j]=Math.min(pathlengths[i+1][j],pathlengths[i][j+1])+grid[i][j];
				 }
				 
			 }
		 }
	     return pathlengths[0][0];
	    }
}
