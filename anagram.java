package Hackerrank;
import java.util.*;
public class anagram {
	public static int an(String s) {
		if(s.length()%2!=0) {
			return -1;
		}
       int result=0;
       int count1=0;
       int count2=0;
       String sub1=s.substring(0,s.length()/2);
       String sub2=s.substring(s.length()/2,s.length());
       for(int i=0;i<s.length()/2;i++) {
    	   if(!sub2.contains(String.valueOf(s.charAt(i)))) {
    		   count1++;
    	   }
    	   if(!sub1.contains(String.valueOf(s.charAt(i+(s.length()/2))))) {
    		   count2++;
    	   }
       }
        if(count1==count2) {
        	result=count1;
        }
        else if(count1==0) {
        	result=count2;
        }
        else if(count2==0) {
        	result=count1;
        }
        else {
        	result=(s.length()/2)-(count1+count2)/2; 
        }
       return result;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="aaabbb";        
        System.out.println(an(s)); 
	}
}