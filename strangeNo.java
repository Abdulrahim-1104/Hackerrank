package Hackerrank;

public class strangeNo {
public static long strange(long t) {
     long top=1;
     long bottom=3;
     long multi=bottom;
     while(true) {
    	 if(t>=top&&t<=bottom) {
    		 break;
    	 }
    	 multi=multi*2;
    	 top=bottom+1;
    	 bottom=bottom+multi;
     }
     long val=t-top;
     val=multi-val;
     return val; 
}
public static long factorial(long n) {
	if(n==1) {
		return 1;
	}
	return n*factorial(n-1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	long n=10; 
	  System.out.println( factorial(4)); 	
       System.out.println(strange(12));
    
	}
}
