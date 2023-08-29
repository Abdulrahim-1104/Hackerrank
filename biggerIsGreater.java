package Hackerrank;

import java.util.Arrays;

public class biggerIsGreater {
	 public static String biggerIsGreaters(String w) {
		 String s=w;
		 int target=0;
		 String strings="";
		    boolean bool=false; 
		    for(int i=s.length()-1;i>0;i--) {
		    	int size=s.charAt(i-1);
		    	int index=s.charAt(i);
		    	if(size<index) {
		    		bool=true;
		    		target=i-1; 
		    		break;
		    	}
		    }
		    if(!bool) { 
		    	return "no answer";
		    }
		    
		    for(int i=s.length()-1;i>target;i--) { 
		    	int index=s.charAt(i);
		    	int targets=s.charAt(target);
		    	if(index>targets) {  
		    		char ch=s.charAt(i);  
		     		s=s.substring(0,i)+s.charAt(target)+s.substring(i+1);
		     		s=s.substring(0,target)+ch+s.substring(target+1);
		     		break;
		     	}
		    } 
		    strings=s.substring(0,target+1);
		    String remained=s.substring(target+1);
		    char arr[]=remained.toCharArray();
		    Arrays.sort(arr);
		    strings+=String.valueOf(arr);
		    return strings;
		    
		    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str= "dcba";
        System.out.println(biggerIsGreaters(str));
        for(int i=str.length()-1;i>-1;i--) { 
        	System.out.print(str.charAt(i));
        }
	}

}
