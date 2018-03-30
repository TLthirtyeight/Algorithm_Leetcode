package question13;

public class MovintCount {
	    private  static int mazerow=39;
	    private  static int mazecol=14;
         private int[][] maze=new int[mazerow][mazecol];
         private static int threshold=10;
         private static int getBitSum(int num){
        	 int sum=0;
        	 while(num>0){
        		 sum+=num%10;
        		 num/=10;
        	 }
        	 return sum;
         }
         
         private static int allcount=0;
         private int[] dx={-1,1,0,0};             //上 下 左 右
         private  int[] dy={0,0,-1,1};
         
         
         private boolean canfind(int x,int y){
         	boolean  result=false;
         	if((0<=x&&x<mazerow) &&(0<=y&&y<mazecol))
         	     return true;
         	return result;
         }
         
         public void calAllPos(int x,int y){
        	 if(   (getBitSum(x)+getBitSum(y)<threshold)&&  canfind(x,y)  &&maze[x][y]==0){
        		 allcount++;
        		 maze[x][y]=1;
        		 System.out.println(x+" "+y);
        		 for(int i=0;i<4;i++){
        			 int newx=x+dx[i];
        			 int newy=y+dy[i];
        			 calAllPos(newx, newy);
        		 }
        	 }
         }
         public static void main(String[] args) {
			MovintCount mc=new MovintCount();
			 mc.calAllPos(0, 0)  ;
			 System.out.println(allcount);
			 
		}
}
