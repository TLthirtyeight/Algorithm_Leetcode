package permutationSequence;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
	  int[] np = new int[10];  // n!

      public String getPermutation(int n, int k) 
      {
          np[0] = 1;
          for(int i=1;i<10;++i)
              np[i] = np[i-1]*(i+1);

          List<Integer> list = new ArrayList<>();
          for(int i=1;i<=n;++i)
              list.add(i);
          return getstr(list, k);
      }

      String getstr(List<Integer> list, int k)
      {
          if( list.size()==1 )
              return (""+list.get(0));

          int bucketLen = np[list.size()-2];
          int targetIndex = 0;
          for(int i=list.size()-1;i>=0;--i)   //为什么这样子弄可以选出来呢？
          {                                  //我第一步用k/bucketLen 得到一个数这个已经不对了
              if( k > (bucketLen*i) )
              {
                  targetIndex = i;
                  break;
              }
          }

          int res = list.get(targetIndex);
          list.remove(targetIndex);
          return res + getstr(list, k-targetIndex*bucketLen);
      }
      
      public static void main(String[] args) {
		Solution1 s1=new Solution1();
		String result=s1.getPermutation(4,14);
		System.out.println(result);
	}
}
