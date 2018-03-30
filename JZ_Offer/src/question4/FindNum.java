package question4;

import java.util.Arrays;

public class FindNum {
         private static int[][] matrix={
        		 {1,2,8,9},
        		 {2,4,9,12},
        		 {4,7,10,13},
        		 {6,8,11,15}
         };
         
         static boolean  find(int[][] matrix,int rows,int cols,int key){
        	 boolean isfind=false;
        	 if(rows<=0||cols<=0)
        	      return isfind;
        	 
        	 int temprow=0;int tempcol=cols-1;
        	 while(temprow<=rows&&tempcol>=0){
        		 if(matrix[temprow][tempcol]==key){
        			 System.out.println(temprow+" "+tempcol);
        			 return true;
        		 }else if(matrix[temprow][tempcol]<key){
        			 temprow++;
        		 }else{
        			 tempcol--;
        		 }
        		 
        	 }
        	 
        	 return isfind;
        	 
         }
         public static void main(String[] args) {
        //	 System.out.println(Arrays.toString(matrix));
			System.out.println(find(matrix, 4, 4, 12));
		}
         
}
