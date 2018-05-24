package insertInterval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import mergeIntervals.Solution2.IntervalComparator;





 
class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
	@Override
	public String toString() {
		// TODO Auto-generated method stub
	    return "["+start+" "+end+"]";
	}
      
}
 
class Solution {
	 private class IntervalComparator implements Comparator<Interval> {
	        @Override
	        public int compare(Interval a, Interval b) {
	            return a.start < b.start ? -1 : a.start == b.start ? 0 : 1;
	        }
	    }
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        intervals=solve(intervals,newInterval);
        return intervals;
    	
    }
    public List<Interval>  solve(List<Interval> intervals, Interval newInterval){
    	
        Interval currentinterval=newInterval;
        Iterator<Interval> iterator=intervals.iterator();
        
        List<Interval> newlist=new ArrayList<Interval>();
        if(intervals==null||intervals.size()==0){
        	newlist.add(newInterval);
        	return newlist;
        }
        boolean allnotcrossed=true;
    		
        while(iterator.hasNext()){
        	Interval interaval=iterator.next();
        //	iterator.remove();
        	if(isCrossed(interaval, currentinterval)){
        		allnotcrossed=false;
        		if(currentinterval!=newInterval){
        			newlist.remove(newlist.size()-1);
        		}
        		int left=Math.min(interaval.start, currentinterval.start);
        		int right=Math.max(interaval.end, currentinterval.end);
        	//	intervals.add(new Interval(left, right));
        		Interval i=new Interval(left, right);
        		newlist.add(i);
        		
        		currentinterval=i;
        		
        	}else{
        		//intervals.add(interaval);
        		newlist.add(interaval);
        	}
        }
        if(allnotcrossed){
        	newlist.add(newInterval);
        }
        intervals=new ArrayList<Interval>(newlist);
        Collections.sort(intervals, new IntervalComparator());
    	return intervals;
    }

    public boolean isCrossed(Interval i1,Interval i2){
		 boolean result=true;
		 if(i1.start>i2.end||i2.start>i1.end)
			 result=false;
		 return result;
	 }
    public static void main(String[] args) {
		Solution s=new Solution();
		Interval i1=new Interval(1,5);
//		Interval i2=new Interval(3,5);
//		Interval i3=new Interval(6,7);
//		Interval i4=new Interval(8,10);
//		Interval i5=new Interval(12,16);
		
		List<Interval> intervals=new ArrayList<Interval>();
		intervals.add(i1);
//		intervals.add(i2);
//		intervals.add(i3);
//		intervals.add(i4);
//		intervals.add(i5);
		
		Interval newInterval=new Interval(6,8);
		intervals=s.insert(intervals,newInterval);
		
		System.out.println(intervals);
		
		
	}

}