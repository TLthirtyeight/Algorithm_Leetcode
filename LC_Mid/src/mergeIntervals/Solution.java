package mergeIntervals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


 class Interval {
	      int start;
	      int end;
	      Interval() { start = 0; end = 0; }
	      Interval(int s, int e) { start = s; end = e; }
	  }
public class Solution {
	 public List<Interval> merge(List<Interval> intervals) {
	        List<Interval> intervallist=new ArrayList<Interval>();
	        Iterator<Interval> it=intervals.iterator();
	        while(it.hasNext()){
	        	
	        }
		 
	    }
	 public boolean isCrossed(Interval i1,Interval i2){
		 boolean result=true;
		 if(i1.start>i2.end||i2.start>i1.end)
			 result=false;
		 return result;
	 }
	 
	 public Interval merge2Intervals(Interval i1,Interval i2){
		 int s=i1.start<i2.start?i1.start:i2.start;
		 int e=i1.end<i2.end?i2.end:i1.end;
		 return new Interval(s, e);
	 }
}
