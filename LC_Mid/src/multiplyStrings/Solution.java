package multiplyStrings;

import java.util.Arrays;

public class Solution {
	 public String multiply(String num1, String num2) {
		 
		 /****
		  * 实在想不出什么巧妙的方法，只能用最朴素的。先自己实现两个字符串相加的方法
		  * 然后个数少的每一位与长的字符串相乘，乘完后补零。。。。
		  * 
		  */
	     
		 if(num1.equals("0")||num2.equals("0"))return "0";
		 boolean isnum1longerthannum2=num1.length()>num2.length();
		 String longer="";
		 String shorter="";
		 longer=isnum1longerthannum2?num1:num2;
		 shorter=isnum1longerthannum2?num2:num1;
		 return multiplyLongAndShort_and_completezero(longer, shorter);
		 
	    }
	 
	 
	 public String multiplyLongAndShort_and_completezero(String longer,String shorter){
		 int shortsize=shorter.length();
		 String result="";
		 for(int i=0;i<shortsize;i++){
			 char c=shorter.charAt(shortsize-i-1);
			 String t=multiplyLongAndShort_withOnlyTheLastBit(longer,shorter,c , i);
			 result=add(result, t);
		 }
		 return result;
	 }
	 
	 public String multiplyLongAndShort_withOnlyTheLastBit(String longer ,String shorter,char c,int bitIndex){
		 int size=longer.length();
		 int carry=0;
		 char[] result=new char[size+1];
		 for(int i=size-1;i>=0;i--){
			 int a=longer.charAt(i)-'0';
			 int b=c-'0';
			 int sum=a*b+carry;
			 result[i+1]=(char) (sum%10+'0');
			 carry=sum/10;
		 }
		 result[0]=(char) (carry+'0');
		 String temp=charArray2String(result);
		 for(int i=0;i<bitIndex;i++){
			 temp+="0";
		 }
		 return temp;
	 }
	 
	 public String add(String n1,String n2){
		 if(n1.equals("")&&!n2.equals(""))return n2;
		 if(n2.equals("")&&!n1.equals(""))return n1;
		 int carry=0;
		 boolean isn1longerthann2=n1.length()>n2.length();
		 String complete_short="";String complete_long="";
		 complete_short=isn1longerthann2?completeWithZero(n1, n1):completeWithZero(n2, n1);
		 complete_long=isn1longerthann2?n1:n2;
		 
		 
		 int stringsize=complete_short.length();
		 int i=stringsize-1;
		 char[] result=new char[stringsize+1];
		 while(i>=0){
			 int a=complete_long.charAt(i)-'0';
			 int b=complete_short.charAt(i)-'0';
			 int sum=a+b+carry;
			 carry=sum>=10?1:0;
			 result[i+1]=(char) (sum>=10?((sum-10)+'0'):sum+'0');
			 i--;
			 
		 }
		 result[0]=carry==1?'1':'0';
		 return charArray2String(result);
		 
	 }
	 
	 public String charArray2String(char[] array){
		// int sum=0;
//		 for(int i=0;i<array.length;i++){
//			 sum=sum*10+(array[i]-'0');
//		 }
		 
		 if(array[0]=='0')
			 array=Arrays.copyOfRange(array,1,array.length);
		     
		return String.copyValueOf(array);
		 
	 }

	 
	 public String completeWithZero(String longer,String shorter){
		 int zerolength=longer.length()-shorter.length();
		 String complete_short="";
		 for(int i=0;i<zerolength;i++){
			 complete_short+="0";
		 }
		 complete_short+=shorter;
		 return complete_short;
	 }
	 
	 public static void main(String[] args) {
		String n1="1";
		String n2="1";
		Solution s=new Solution();
		String result=s.add(n1, n2);
		System.out.println(result);
//		Long aaa=999999999999999999l;
//		long bbb=9999l;
//		System.out.println(aaa+bbb);
		System.out.println(s.multiply(n1, n2));
	}
	 
}
