package uniquePaths;

public class Solution {
     public int uniquePaths(int m, int n) {//第一次提交就AC！！！
        if(n==0||m==0)return 0;
        int [][] paths=new int[n+1][m+1];
//        for(int col=0;col<m+1;col++)
//        	paths[n][col]=0;
//        for(int row=0;row<n+1;row++)
//        	paths[row][m]=0;
        paths[n-1][m-1]=1;
        for(int i=n-1;i>=0;i--){
        	for(int j=m-1;j>=0;j--){
        		if(i==n-1&&j==m-1)continue;
        		paths[i][j]=paths[i+1][j]+paths[i][j+1];
        	}
        }
        return paths[0][0];
        	
        
    }
     public static void main(String[] args) {
		Solution s=new Solution();
		int result=s.uniquePaths(7, 3);
		System.out.println(result);
	}
}
