package replaceblank;

public class ReplaceBlank {

	public static char[] replaceBlank(char[] inputs,int charlistlen){
		if(inputs==null){
			return null;
		}
		int blanknum=0;
		for(int i=0;i<charlistlen;i++){
			if(inputs[i]==' '){
				blanknum++;
			}
		}
		char tempp1,tempp2;
		int p1=charlistlen-1;int p2=charlistlen+2*blanknum-1;
		while(p2!=p1){
			tempp1=inputs[p1];
			tempp2=inputs[p2];
			if(tempp1==' '){
				inputs[p2]='0';
				inputs[p2-1]='2';
				inputs[p2-2]='%';
			
				p2=p2-3;
				p1--;
			}else{
				
				inputs[p2]=inputs[p1];
				p1--;
				p2--;
			}
			
		}
		
		
		return inputs;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t=" we are happy #######################################";
		String t1="a bc######################";
		String t2=" ab########################";
        char[] test=t.toCharArray();
        
        System.out.println(ReplaceBlank.replaceBlank(test, 14));
	}

}
