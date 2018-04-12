package groupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	  public List<List<String>> groupAnagrams(String[] strs) {
	        if (strs.length == 0) return new ArrayList();
	        Map<String, List> ans = new HashMap<String, List>();
	        for (String s : strs) {
	            char[] ca = s.toCharArray();
	            Arrays.sort(ca);
	            String key = String.valueOf(ca);
	            if (!ans.containsKey(key)) ans.put(key, new ArrayList());     //思路原来就是这么简单。。。。排序！！！！
	            ans.get(key).add(s);
	        }
	        System.out.println(ans.values());
	        return new ArrayList(ans.values());
	    }
	  
	  public static void main(String[] args) {
		  String[] strs={"eat", "tea", "tan", "ate", "nat", "bat"};
		Solution  s=new Solution();
		List<List<String>> result=s.groupAnagrams(strs);
		System.out.println(result);
	}
}
