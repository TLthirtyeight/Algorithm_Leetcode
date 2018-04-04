package printMatrixInCircle;

public class Solve {

	public static final int[] NEXTDIR={1,2,3,0};   //下次方向
	
	public static final int RIGHT=0;
	
	public static final int DOWN=1;
	
	public static final int LEFT=2;
	
	public static final int UP=3;
	
	public static int rows=4;
	public static int cols=6;
	
	public int[][] checked=new int[rows][cols];
	
	public int nextDir(int x,int y,int status){
		int nextdir=-1;
		int tempx,tempy;
		switch(status){
		   case RIGHT:
			 tempx=x;
			 tempy=y+1;  
			 nextdir= checked(tempx,tempy)?RIGHT:NEXTDIR[RIGHT];
			break;
		
            case DOWN:
			
            	 tempx=x+1;
    			 tempy=y;  
    			 nextdir= checked(tempx,tempy)?DOWN:NEXTDIR[DOWN];
			break;
            
            
            case LEFT:
            	 tempx=x;
    			 tempy=y-1;  
    			 nextdir= checked(tempx,tempy)?LEFT:NEXTDIR[LEFT];
    			break;
            case UP:
            	 tempx=x-1;
    			 tempy=y;  
    			 nextdir= checked(tempx,tempy)?UP:NEXTDIR[UP];
    			break;
			
		}
		return nextdir;
	}
	
	public boolean checked(int x,int y){
		if(0<=x&&x<rows&&0<=y&&y<cols&&checked[x][y]==0)
			return true;
		
		return false;
	}
	
	public void printMatrix(int[][]  matrix,int x,int y,int status){
		if(checked[x][y]==1)
			return;
		System.out.print(matrix[x][y]+" ");
		checked[x][y]=1;
		int nextdir=-1;
		int tempx=-1,tempy=-1;
		if((nextdir=nextDir(x, y, status))!=-1){
			
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
			
			printMatrix(matrix, tempx, tempy, nextdir);
		}
	}
	
	public static void main(String[] args) {
//		int[][] matrix={
//				{1,2,3,4 },
//				{5,6,7,8},
//				{9,10,11,12},
//				{13,14,15,16}
//		};
//		int[][] matrix={
//				{1,2 },
//				{3,4}
//				
//		};
		
		int[][] matrix={
				{1,2,3,4 ,5,6 },
				{7,8,9,10,11,12},
				{13,14,15,16,17,18},
				{19,20,21,22,23,24}
		};
		
		Solve s=new Solve();
		s.printMatrix(matrix, 0, 0, RIGHT);
		
		
	}
	
	
}
