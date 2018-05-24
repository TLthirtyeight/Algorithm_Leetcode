package spiralMatrix2;

class Solution {
	
	public static final int[] x={0,1,0,-1};   //右下左上
	public static final int[] y={1,0,-1,0};
	public static final int[] status={0,1,2,3};//右下左上的方向
	
    public int[][] generateMatrix(int n) {
    	int [][] canentermatrix=new int[n][n];
    	int direction=0;
        int currentstatus=status[direction];
        int[][] matrix=new int[n][n];
        int currentX=0;
        int currentY=0;
        matrix[currentX][currentY]=1;
        canentermatrix[currentX][currentY]=1;
        for(int i=1;i<n*n;i++){
        	int nextX=currentX+x[currentstatus];
        	int nextY=currentY+y[currentstatus];
        	if(canEnter(nextX, nextY, canentermatrix, n)){
        		matrix[nextX][nextY]=i+1;
        		canentermatrix[nextX][nextY]=1;
        		currentX=nextX;
        		currentY=nextY;
        	}else{
        		i--;
        		direction++;
        		currentstatus=status[direction%4];
        	}
        	
        }
        return matrix;
    }
    public boolean canEnter(int x ,int y,int[][] canentermatrix,int n){
    	
//    	System.out.println(0<=x&&x<n);
//		System.out.println(0<y&&y<n);
//		System.out.println(canentermatrix[x][y]==0);
    	if( (0<=x&&x<n) && (0<=y&&y<n) && canentermatrix[x][y]==0 ) {
    	
    		return true;
    	}
    	return false;
    }
    
    public static void main(String[] args) {
		Solution s=new Solution();
		int n=4;
		int[][] matrix=s.generateMatrix(n);
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(matrix[i][j]+ " ");
			}
			System.out.println();
		}
	}
    
    
}
