package canPlaceFlowers;

public class Solution {
	  public boolean canPlaceFlowers(int[] flowerbed, int n) {
	      
		  int count=flowerbed.length;
		  if(count==1){
			  if(flowerbed[0]==0&&n==1){
				  return true;
			  }else if(n==0){
				  return true;
			  }
			  return false;
		  }else{
			  for(int i=0;i<count;i++){
				  if(n==0)break;
				  if(i==0&&count>1){
					  if(flowerbed[i]==0&&flowerbed[1]==0){
						  flowerbed[i]=1;
						  n--;
					  }
				  }else if(i==count-1&&count>1){
					  if(flowerbed[i-1]==0&&flowerbed[i]==0){
						  flowerbed[i]=1;
						  n--; 
					  }
				  }else{
					  if(flowerbed[i-1]==0&&flowerbed[i+1]==0&&flowerbed[i]==0){
						  flowerbed[i]=1;
						  n--; 
					  }
				  }
			  }
			  if(n<=0){
				  return true;
			  }else{
				  return false;
			  } 
		  }
		  
		  
		  
	    }
}
