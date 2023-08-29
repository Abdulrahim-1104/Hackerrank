package Hackerrank;

public class strongPass {
 public static int sp(String s) {
	 int count=0;
	 boolean noBool=false;
	 boolean sBool=false;
	 boolean cBool=false;
	 boolean symBool=false;
	 int n=s.length();
		 for(int i=0;i<s.length();i++) {
		 if(!symBool) {
			 if((s.charAt(i)>=33&&s.charAt(i)<=47)||s.charAt(i)==64) {
				 symBool=true;
			 }
		 }
		 if(!sBool) {
			 if(s.charAt(i)>=97&&s.charAt(i)<=122) {
				 sBool=true;
			 }
		 }
		 if(!cBool) {
			 if(s.charAt(i)>=65&&s.charAt(i)<=90) {
				 cBool=true;
			 }
		 }
		 if(!noBool) {
			 if(s.charAt(i)>=48&&s.charAt(i)<=57) {
				 noBool=true;
			 }
		 }
	 }
	 if(!sBool) {
		 count++;
		 n++;
	 }
	 if(!cBool) {
		 count++;
		 n++;
	 }
	 if(!noBool) {
		 count++;
		 n++;
	 }
	 if(!symBool) {
		 count++;
		 n++;
	 }
	 if(n<6) {
		 count+=6-n;
	 }
	 return count;
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String s="A98*+";
       System.out.println(sp(s)); 
       char ch='#';
 
	}
	

}
