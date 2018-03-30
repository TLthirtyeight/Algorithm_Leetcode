package question12;

public class Backtrack {
  
    
    int [][] canEnter={
    		{1,1,1,1},
    		{1,1,1,1},
    		{1,1,1,1},
    };
    private int[] dx={-1,1,0,0};             //上 下 左 右
    private  int[] dy={0,0,-1,1};
    
    private  static final String path="bfce";
    
    private boolean isfind(char[][] grapth,int x,int y){
    	boolean isfind=false;
    	
    	
    	return isfind;
    }
    char[][] graph={
    		{'a','b','t','g'},
    		{'c','f','c','s'},
    		{'j','d','e','d'}
    };
    
    private void geAllPath(int x,int y,int depth,String pres){
    	
    	if(depth==4){
    	 //  String temp=String.valueOf(graph[x][y]);
    		System.out.println(pres); 
    		return ;
    	}
    	for(int i=0;i<4;i++){
    		int newx=x+dx[i];
    		int newy=y+dy[i];
    		if(canfind(newx, newy)&&canEnter[newx][newy]==1){
    			canEnter[newx][newy]=0;
    			
    			String s=String.valueOf(graph[newx][newy]);
    			geAllPath(newx,newy, depth+1,pres+s);
    			canEnter[newx][newy]=1;
    		}
    	}
    	
    }
    
    private boolean canfind(int x,int y){
    	boolean  result=false;
    	if((0<=x&&x<3) &&(0<=y&&y<4))
    	     return true;
    	return result;
    }
    
    
    public static void main(String[] args) {
    	Backtrack bt=new Backtrack();

    	
        bt.canEnter[0][0]=0;
    	bt.geAllPath(0, 0, 1, "a");
    	
    	
	}
    
}
