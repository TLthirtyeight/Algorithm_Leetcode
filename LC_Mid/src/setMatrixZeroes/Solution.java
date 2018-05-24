package setMatrixZeroes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {
	   static class ZeroPositon{
		   int row;
		   int col;
		   public ZeroPositon(int r,int c) {
			// TODO Auto-generated constructor stub
			  this.row=r;
			  this.col=c;
		  }
	   }
	   
	   public void  setZero(int[][] matrix ,int row_or_col,boolean isrow){
		   int matrixrow=matrix.length;
	        int matrixcol=matrix[0].length;
		   if(isrow){
			   for(int i=0;i<matrixcol;i++)
				   matrix[row_or_col][i]=0;
		   }else{
			   for(int i=0;i<matrixrow;i++)
				   matrix[i][row_or_col]=0;
		   }
	   }
	
	    public void setZeroes(int[][] matrix) {
	        List<ZeroPositon> list=new ArrayList<ZeroPositon>();
	        int matrixrow=matrix.length;
	        int matrixcol=matrix[0].length;
	        for(int i=0;i<matrixrow;i++){
	        	for(int j=0;j<matrixcol;j++){
	        		if(matrix[i][j]==0){
	        			list.add(new ZeroPositon(i, j));
	        		}
	        	}
	        }
	        Iterator<ZeroPositon> iterator=list.iterator();
	        while(iterator.hasNext()){
	        	ZeroPositon zeroposition=iterator.next();
	        	int row_index=zeroposition.row;
	        	setZero(matrix, row_index, true);
	        	int col_index=zeroposition.col;
	        	setZero(matrix, col_index, false);
	        }
	      System.out.println("hhh");
	    }
	    public static void main(String[] args) {
			int[][] matrix=new int[][]{
				{1},{0}
			};
			Solution s=new Solution();
			s.setZeroes(matrix);
		}
}
