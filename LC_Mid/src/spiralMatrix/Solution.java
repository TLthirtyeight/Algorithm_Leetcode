package spiralMatrix;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	  public List<Integer> spiralOrder(int[][] matrix) {
		  System.out.println(matrix.length);
		  List<Integer> list=new ArrayList<Integer>();
		  if(matrix!=null&&matrix.length!=0){
		  rows=matrix.length;
		  cols=matrix[0].length;
		 int[][] checked=new int[rows][cols];
		  
		
			  printMatrix(matrix,0,0,RIGHT,list,checked);
		  }
		  
		  return list;
	    }
	  
	  

		public static final int[] NEXTDIR={1,2,3,0};   //下次方向
		
		public static final int RIGHT=0;
		
		public static final int DOWN=1;
		
		public static final int LEFT=2;
		
		public static final int UP=3;
		
		public static int rows=4;
		public static int cols=6;
		

		
		public int nextDir(int x,int y,int status,int[][] checked){
			int nextdir=-1;
			int tempx,tempy;
			switch(status){
			   case RIGHT:
				 tempx=x;
				 tempy=y+1;  
				 nextdir= checked(tempx,tempy,checked)?RIGHT:NEXTDIR[RIGHT];
				break;
			
	            case DOWN:
				
	            	 tempx=x+1;
	    			 tempy=y;  
	    			 nextdir= checked(tempx,tempy,checked)?DOWN:NEXTDIR[DOWN];
				break;
	            
	            
	            case LEFT:
	            	 tempx=x;
	    			 tempy=y-1;  
	    			 nextdir= checked(tempx,tempy,checked)?LEFT:NEXTDIR[LEFT];
	    			break;
	            case UP:
	            	 tempx=x-1;
	    			 tempy=y;  
	    			 nextdir= checked(tempx,tempy,checked)?UP:NEXTDIR[UP];
	    			break;
				
			}
			return nextdir;
		}
		
		public boolean checked(int x,int y,int[][] checked){
			if(0<=x&&x<rows&&0<=y&&y<cols&&checked[x][y]==0)
				return true;
			
			return false;
		}
		
		public void printMatrix(int[][]  matrix,int x,int y,int status,List<Integer> list,int[][] checked){
		    try{
		    	if(checked[x][y]==1)
					return;
				//System.out.print(matrix[x][y]+" ");
				list.add(matrix[x][y]);
				checked[x][y]=1;
				int nextdir=-1;
				int tempx=-1,tempy=-1;
				if((nextdir=nextDir(x, y, status,checked))!=-1){
					
					switch(nextdir){
					
					case RIGHT:
						 tempx=x;
						 tempy=y+1;
						break;
						
					case DOWN:
						 tempx=x+1;
		    			 tempy=y;  
						break;
						
					case LEFT:
						
						 tempx=x;
		    			 tempy=y-1;
						break;
						
					case UP:
						
						 tempx=x-1;
		    			 tempy=y; 
						break;
						
					}
					
					printMatrix(matrix, tempx, tempy, nextdir,list,checked);
				}
		    }catch(ArrayIndexOutOfBoundsException a){
		    	return ;
		    }
		
		}
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Solution s=new Solution();
//            int[][] matrix={
//    				{1,2,3 },
//    				{4,5,6},
//    				{7,8,9},
//    			
//    		};
            int[][] matrix={{1}};
            
          List<Integer>  list=s.spiralOrder(matrix);
          System.out.println(list);
	}

}
