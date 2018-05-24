package permutationSequence;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
	 public String getPermutation(int n, int k) 
     {
         int jiecheng=1;
         for(int i=1;i<=n;i++)
        	 jiecheng*=i;
         if(n<=1)return "1";
         StringBuilder sb=new StringBuilder();
         List<Integer> list=new ArrayList<Integer>();
         for(int i=1;i<=n;i++)
        	 list.add(i);
         k--;
         while(!list.isEmpty()){          //跟我原来的想法差一点，差一点就找到规律了
        	 jiecheng/=n;
        	 sb.append(list.get(k/jiecheng));
        	 list.remove(k/jiecheng);
        	 k%=jiecheng;
        	 n--;
         }
         return sb.toString();
		 
     }
	 public static void main(String[] args) {
		Solution2 s2=new Solution2();
	String result=	s2.getPermutation(4, 14);
	System.out.println(result);
	}
	 
}
