package rotateImage;

import java.util.Arrays;

public class Solution {
	    public void rotate(int[][] matrix) {
	         int rows=matrix.length;
	         int cols=matrix[0].length;
	         
	         int[][] newmatrix=new int[rows][cols];
	         
	         for(int i=0;i<rows;i++){
	        	 for(int j=0;j<cols;j++){
	        		newmatrix[i][j]=matrix[i][j];
	        	 }
	         }
	         
	         for(int i=0;i<rows;i++){
	        	 for(int j=0;j<cols;j++){
	        		 int newx=j;
	        		 int newy=cols-1-i;
	        		 matrix[newx][newy]=newmatrix[i][j];
	        	 }
	         }
	         
//	         for(int i=0;i<rows;i++){
//	        	 for(int j=0;j<cols;j++){
//	        		 System.out.print(newmatrix[i][j]+" ");
//	        	 }
//	        	 System.out.println();
//	         }
	      
	         
	    }
	    
	    public static void main(String[] args) {
			int [][] matrix={{1,2,3},{4,5,6},{7,8,9}};
			Solution s=new Solution();
			s.rotate(matrix);
			   int rows=matrix.length;
		         int cols=matrix[0].length;
		         
		         System.out.println("***********");
		         for(int i=0;i<rows;i++){
		        	 for(int j=0;j<cols;j++){
		        		 System.out.print(matrix[i][j]+" ");
		        	 }
		        	 System.out.println();
		         }
		}
}
