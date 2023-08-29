package Hackerrank;

public class beautifulString {
public static int bs(String b) {
	  int count=0;
	    for(int i=1;i<b.length()-1;i++){
	        if(b.charAt(i)=='1'){
	        	int v1=b.charAt(i-1)-48;
	        	int v2=b.charAt(i+1)-48; 
	          if(v1==0 && v2==0) {
	        	  b=b.substring(0,i+1)+'1'+b.substring(i+2); 
		            count++;
	          }
	        }
	    }
	   return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s="0101010";
  System.out.println(bs(s));
	}

}
