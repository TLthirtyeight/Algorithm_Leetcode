package validSudoku;

class Solution {
	  public boolean isValidSudoku(char[][] board) {
	      boolean row=checkRow(board);
	      boolean col=checkCol(board);
	      boolean square=checkLittleSquare(board);
	      System.out.println(row+" "+col+" "+square);
		  boolean result=row&&col&&square;
		  return result;
		  
	    }
	public static boolean  checkRow(char[][] board){
	     boolean result=true;
	     
	        for(int i=0;i<9;i++){
	        	   int[] count=new int[10];
	        	for(int j=0;j<9;j++){
	        		if(board[i][j]!='.'){
	        			int index=board[i][j]-'0';
	        			count[index]++;
	        			if(count[index]>1){
	        				return false;
	        			}
	        		}
	        	}
	        	
	        	
	        }
	        
	        
	        return result;
	}
	
  public static boolean checkCol(char[][] board){
	   boolean result=true;
    
     for(int j=0;j<9;j++){
  	   
  	   int[] count=new int[10];
     	for(int i=0;i<9;i++){
     		if(board[i][j]!='.'){
     			int index=board[i][j]-'0';
     			count[index]++;
     			if(count[index]>1){
     				return false;
     			}
     		}
     	}
     	
     	
     }
     
     
     return result;
	}
  
public static boolean checkLittleSquare(char[][] board){
  boolean result=true;

  int[]  x={0,0,0,3,3,3,6,6,6};
  int[]  y={0 ,3,6,0,3,6,0,3,6};
  for(int i=0;i<9;i++){
  	  int[] count=new int[10];
  	int startx=x[i];int  starty=y[i];
  	if(i==2){
  		System.out.println("xx");
  	}
  	for(int j=0;j<9;j++){
  		int deltax=j/3;
  		int deltay=j%3;
  		
  		
  		if(board[startx+deltax][starty+deltay]!='.'){
  			int index=board[startx+deltax][starty+deltay]-'0';
  			count[index]++;
  			if(count[index]>1){
  				return false;
  			}
  		}
  	}
  	
  	
  }
  return result;
  
}
}