package rotateImage;

public class Solution2 {
    public void rotate(int[][] matrix) {      //传值引用！！！！下面的操作针对对的是复制的值（也是叫matrix）来改变的
        int rows=matrix.length;
        int cols=matrix[0].length;
        
        int[][] newmatrix=new int[rows][cols];
        
        for(int i=0;i<rows;i++){
       	 for(int j=0;j<cols;j++){
       		 int newx=j;
       		 int newy=cols-1-i;
       		 newmatrix[newx][newy]=matrix[i][j];
       	 }
        }
        
        for(int i=0;i<rows;i++){
       	 for(int j=0;j<cols;j++){
       		 System.out.print(newmatrix[i][j]+" ");
       	 }
       	 System.out.println();
        }
        
        matrix=newmatrix;
        
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
