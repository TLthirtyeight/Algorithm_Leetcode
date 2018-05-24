package permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {
      
	public 	List<List<Integer>>  permutations(int[ ] array){
		
		Arrays.sort(array);
		List<List<Integer>> result=new ArrayList<List<Integer>>();
		int[] canbeused=new int[array.length];
		backtrack(result, new ArrayList<Integer>(), 0,array,canbeused);
		return result;
		
	}
	
	
	private void backtrack(List<List<Integer>> result ,List<Integer> templist,int depth,int[] candidates,int[] canbeused){
		if(depth==candidates.length){
			//templist.add(candidates[depth]);
			result.add(new ArrayList<Integer>(templist));
		}else{
			for(int i=0;i<candidates.length;i++){
//				if(depth==0&&i==2){
//					System.out.println();
//				}
				if(canbeused[i]==0){
					templist.add(candidates[i]);
					canbeused[i]=1;
					backtrack(result, templist, depth+1, candidates, canbeused);
					canbeused[i]=0;
					templist.remove(templist.size()-1);
				}
				
				
				
				
			}
			
			
		}
		
		
	}
	
	public static void main(String[] args) {
		Test1 test=new Test1();
		int[] array={1,2,3,4};
		List<List<Integer>> result=test.permutations(array);
		System.out.println(result.size());
		System.out.println(result);
	}
}
