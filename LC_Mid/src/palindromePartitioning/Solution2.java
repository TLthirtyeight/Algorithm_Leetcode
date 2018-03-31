package palindromePartitioning;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution2 {
	 List<List<String>> list;
	    boolean[][] p;
	    public List<List<String>> partition(String s) {
	        list = new LinkedList<>();
	        if(s==null || s.length()==0) return list;
	        int len = s.length();
	        p = new boolean[len][len];
	        for(int i=0;i<len;i++){
	            p[i][i] = true;
	            int l = i-1;
	            int r = i+1;
	            while(l>-1 && r<len && s.charAt(l)==s.charAt(r)){
	                p[l][r] = true;
	                l--;
	                r++;
	            }
	            l = i;
	            r = i+1;
	            while(l>-1 && r<len && s.charAt(l)==s.charAt(r)){
	                p[l][r] = true;
	                l--;
	                r++;
	            }
	        }
	        helper(s, new ArrayList<String>(), 0);
	        return list;
	    }
	    public void helper(String s, List<String> cur, int k){
	        if(k == s.length()){
	            list.add(new ArrayList<String>(cur));
	            return;
	        }
	        for(int i=k;i<p.length;i++){
	            if(p[k][i]){
	                cur.add(s.substring(k, i+1));
	                helper(s, cur, i+1);
	                cur.remove(cur.size()-1);
	            }
	        }
	    }
}
