package Hackerrank;
import java.util.*;
public class encryption {
	 static List<String> str=new ArrayList<>();
    public static String  encryptions(String s) {
    	
    	 List<String> finalstring=new ArrayList<>();
  		    s = s.replaceAll("\\s", "");
  	      double size=Math.sqrt(s.length());
  	      int row=0;
  	      int col=0;
  	      if(size*size==s.length()) {
  	    	  col=(int)size;
  	    	  row=(int)size;
  	      }
  	      else {
  	    	  col=(int)size;
  	    	  row=(int)size+1;
  	    	  if(col*row<s.length()) {
  	    		  col++;
  	    	  }
  	      }
  	 
         int temp=0;
         int j=0;
         String strings="";
         for(int i=0;i<row;i++) {
        	 finalstring.add(""); 
        	 for(j=temp;j<col+temp;j++) {
        		 if(row-1==i) {
        			 if(j>(s.length()%col)-1+temp) {  
        				 break;
        			 }
        		 }
        		 strings+=s.charAt(j);
        	 }
        	 str.add(strings);
        	 strings="";
        	 temp=j;
         }
         strings="";
       for(int i=0;i<col;i++) {
    	   for(int k=0;k<row;k++) {
    		   if(row-1==k) {
    			   if(i>(s.length()%col-1)) {
    				   break;
    			   }
    		   }
    		   strings+=str.get(k).charAt(i);
    	   }
    	   strings+=" ";
       }
         return strings;

  	       
  	         
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s="if man was meant to stay on the ground god would have given us roots";
		String s="feedthedog";
		  s = s.replaceAll("\\s", "");
		  System.out.println(s);
	    System.out.println(encryptions(s));
	    System.out.println(str);
	 //   System.out.println("imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau");

	    double size=Math.sqrt(s.length());
	      int row=0;
	      int col=0;
	      if(size*size==s.length()) {
	    	  col=(int)size;
	    	  row=(int)size;
	      }
	      else {
	    	  col=(int)size;
	    	  row=(int)size+1;
	    	  if(col*row<s.length()) {
	    		  col++;
	    	  }
	      }
	         System.out.println(row);
	         System.out.println(col);
	}

}





















