package searcha2DMatrix;

public class Solution {
	  public boolean searchMatrix(int[][] matrix, int target) {
	        if(matrix==null||matrix.length==0||matrix[0].length==0) 
	        	return false;
	        int row=matrix.length;
	        int col=matrix[0].length;
	        int r=0;
	        int c=col-1;
	        while(r<row&&c>=0){
	        	if(matrix[r][c]==target){
	        		return true;
	        	}else if(matrix[r][c]<target){
	        		r++;
	        	}else if(matrix[r][c]>target){
	        		c--;
	        	}
	        	
	        }
	        return false;
	    }
	  
}
