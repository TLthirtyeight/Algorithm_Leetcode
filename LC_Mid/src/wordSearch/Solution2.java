package wordSearch;

public class Solution2 {
	boolean res = false;
	public boolean exist(char[][] board, String word) {
	boolean[][] flag = new boolean[board.length][board[0].length];
	char[] c = word.toCharArray();

	    for(int i=0;i<board.length;i++)
	        for(int j=0;j<board[0].length;j++){
	            if(board[i][j]!=c[0])
	                continue;
	            search(c,0,board,i,j,flag);
	            if(res)
	                return true;
	            
	        }
	    return false;
	}
	private void search(char[] c,int i,char[][] board,int curRow,int curCol,boolean[][]flag){
	    if(res||i==c.length){
	        res = true;
	        return;
	    }
	    if(curRow<0||curRow>=board.length||curCol<0||curCol>=board[0].length||flag[curRow][curCol]||board[curRow][curCol]!=c[i])
	        return;
	    
	    flag[curRow][curCol] = true;
	   //the order below has significant influence on time complexity  
	    search(c,i+1,board,curRow,curCol+1,flag);//right
	    search(c,i+1,board,curRow+1,curCol,flag);//down
	    search(c,i+1,board,curRow,curCol-1,flag);//left
	    search(c,i+1,board,curRow-1,curCol,flag);//up
	    
	    flag[curRow][curCol] = false;
	}
}
