package uniquePaths2;

import java.util.Arrays;

public class Solution {
	  public int uniquePathsWithObstacles(int[][] obstacleGrid) {
	        if(obstacleGrid==null)return 0;
	        int row=obstacleGrid.length;
	        int col=obstacleGrid[0].length;
//	        int [][] tempobstacleGrid=new int[row+1][col+1];
//	        for(int i=0;i<row;i++){
//	        	for(int j=0;j<col;j++){
//	        		if(obstacleGrid[i][j]==1)tempobstacleGrid[i][j]=1;
//	        	}
//	        }
//	        for(int i=0;i<=col;i++)
//	        	tempobstacleGrid[row][i]=1;
//	        for(int j=0;j<=row;j++)
//	        	tempobstacleGrid[j][col]=1;
	     
	        
           /****
            * 
            */
//	        for(int i=0;i<row+1;i++){
//	        	for(int j=0;j<col+1;j++){
//	        		System.out.print(temppaths[i][j]+" ");
//	        	}
//	        		System.out.println();
//	        }
	        
	        
	        int[][] paths=new int[row+1][col+1];
	        
	        for(int i=0;i<row;i++){
	        	for(int j=0;j<col;j++){
	        		if(obstacleGrid[i][j]==1)paths[i][j]=0;
	        	}
	        }
	        
	        for(int i=row-1;i>=0;i--){
	        	for(int j=col-1;j>=0;j--){
	        		if((i==row-1&&j==col-1)&&obstacleGrid[i][j]==0){
	        			paths[i][j]=1;
	        		}else if(obstacleGrid[i][j]==1){
	        			continue;
	        		}else{
	        			paths[i][j]=paths[i+1][j]+paths[i][j+1];
	        		}
	        		
	        		
	        		
	        	}
	        }
	        return paths[0][0];
	    }
	  
	  public static void main(String[] args) {
		  Solution s=new Solution();
		  int[][] obstacleGrid={
				  { 0,0,0},
				  {0,1,0},
				  {0,0,0}
		  };
		 int result= s.uniquePathsWithObstacles(obstacleGrid);
		 System.out.println(result);
	}
}
