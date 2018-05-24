package wordSearch;

public class Solution {
	public int[][] canbeentered;
	public int havefoundcount=0;
	
	public static int r;
	public static int c;
	
	//public int[] dx={-1,0,1,0};    //上右下左
	//public int[] dy={0,1,0,-1};
	
	
	public int[] dx={0,1,0,-1};    //右下左上
	public int[] dy={1,0,-1,0};
	
   public boolean exist(char[][] board, String word) {
	    if(board==null||board.length==0||board[0].length==0)return false;
	    
	    if(word==null||word.equals("")||word.equals(" "))return false;
	    char[] wordarray=word.toCharArray();
	    
        int row=board.length;
        int col=board[0].length;
        if(row*col<word.length())return false;
        
        r=row;
        c=col;
        canbeentered=new int[row][col];
        
        for(int i=0;i<row;i++){
        	for(int j=0;j<col;j++){
        		 // canbeentered=new int[row][col];    //这个操作直接从16ms飙到343ms
        		 if(backtrack(canbeentered, board, wordarray,havefoundcount,i,j))return true;
        	}
        }
	   
	   return false;
    }
   
   public boolean backtrack(int[][] canbeentered,char[][] board,char[] wordarray,int havefoundcount,int startx,int starty){
	   
	   return search(canbeentered, board, wordarray, havefoundcount, startx, starty);
	   
   }
   
   public boolean search(int[][] canbeentered,char[][] board,char[] wordarray,int havefoundcount,int x,int y){
	  
	    if(canbeenteredthispos(canbeentered, x, y)){
	    	char tempc=board[x][y];
	    	char arrayc=wordarray[havefoundcount];
	    	if(tempc==arrayc){
	    		havefoundcount++;
	    		canbeentered[x][y]=1;
	    		if(havefoundcount==wordarray.length)return true;
	    		for(int i=0;i<4;i++){
	    			int newx=x+dx[i];
	    			int newy=y+dy[i];
	    			if(search(canbeentered, board, wordarray, havefoundcount, newx, newy))return true;
	    		}
	    		canbeentered[x][y]=0;
	    	}
	    	return false;
	    	
	    	
	    }
	    return false;
	   
	   
	   
   }
   
   public boolean canbeenteredthispos(int[][] canbeentered,int x,int y){
	  // boolean c1=(x>=0&&x<r);
	 //  boolean c2=(y>=0&&y<c);
     //  boolean c3=canbeentered[x][y]==0;
	   
     //  System.out.println(c1+" "+c2+" "+c3);
	   if((x>=0&&x<r)&&(y>=0&&y<c)&&canbeentered[x][y]==0){
		   return true;
	   }
	   return false;
   }
   public static void main(String[] args) {
	      Solution s=new Solution();
	      char[][] board={
	    		  
	    		   {'A','B','C','E'},
	    		   {'S','F','C','S'},
	    		   {'A','D','E','E'}
	    		 
	      };
	      String word="ABCB";
	      System.out.println(s.exist(board, word));
   }
   
}
