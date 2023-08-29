package Hackerrank;
import java.util.*;
public class counterGame {
	  public static long isPower(long n){
	        long i=0,val=0;
	        while(true){
	            val=(long)2<<i;
	            if(val>=n){
	                break;
	            }
	            i++;
	        }
	        return val;
	    }
	    public static String counterGam(long n) {
	        // Write your code here
	           long dup=n,val=0;
	           boolean bool=true;
	           while(true){
	               if(val==1){
	                   break;
	               }
	               val=isPower(dup);
	               if(val!=dup){
	                   val=(long)val>>>1;
	                   val=dup-val;
	                   bool=bool?false:true;
	               }
	               else{
	                   val=val/2;
	                   bool=bool?false:true;
	               }
	               dup=val;
	           }
	           String result=bool?"Richard":"Louis";
	           return result;
	        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n=1533726144;
        System.out.println( counterGam(n));
	}

}
