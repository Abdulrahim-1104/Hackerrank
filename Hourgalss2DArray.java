package Hackerrank;
import java.util.*;

public class Hourgalss2DArray {
	      public static boolean allNegative(  ArrayList<ArrayList<Integer>>  a){
	            for(int i=0;i<a.size();i++){ 
	                for(int j=0;j<a.get(i).size();j++){
	                    if(a.get(i).get(j)==0){
	                        break;
	                    }
                    if(a.get(i).get(j)>0){
	                        return false; 
	                    }
	                }
	            }
	            return true;
	        }
	    public static void main(String[] args){
	       ArrayList<ArrayList<Integer>> ar= new ArrayList<>();
	       for(int i=0;i<6;i++) { 
	    	   ar.add(new ArrayList<Integer>());
	       }
	       ar.get(0).add(0, -1);
	       ar.get(0).add(1, -1);
	       ar.get(0).add(2, 0);
	       ar.get(0).add(3, -9);
	       ar.get(0).add(4, -2);
	       ar.get(0).add(5, -2);
	       ar.get(1).add(0, -2);
	       ar.get(1).add(1, -1);
	       ar.get(1).add(2, -6);
	       ar.get(1).add(3, -8);
	       ar.get(1).add(4, -2);
	       ar.get(1).add(5, -5);
	       ar.get(2).add(0, -1);
	       ar.get(2).add(1, -1);
	       ar.get(2).add(2, -1);
	       ar.get(2).add(3, -2);
	       ar.get(2).add(4, -3);
	       ar.get(2).add(5, -4);
	       ar.get(3).add(0, -1);
	       ar.get(3).add(1, -9);
	       ar.get(3).add(2, -2);
	       ar.get(3).add(3, -4);
	       ar.get(3).add(4, -4);
	       ar.get(3).add(5, -5);
	       ar.get(4).add(0, -7);
	       ar.get(4).add(1, -3);
	       ar.get(4).add(2, -3);
	       ar.get(4).add(3, -2);
	       ar.get(4).add(4, -9);
	       ar.get(4).add(5, -9);
	       ar.get(5).add(0, -1);
	       ar.get(5).add(1, -3);
	       ar.get(5).add(2, -1);
	       ar.get(5).add(3, -2);
	       ar.get(5).add(4, -4);
	       ar.get(5).add(5, -5); 
	             System.out.println(ar);
	             int max=0;
	             int sum=0;
	            if(!allNegative(ar)) {
	            	 for(int k=0;k<4;k++){
		                 for(int l=0;l<4;l++){
		       sum=ar.get(k).get(l)+ar.get(k).get(l+1) +ar.get(k).get(l+2)+ar.get(k+1).get(l+1)+ar.get(k+2).get(l)+ar.get(k+2).get(l+1)+ar.get(k+2).get(l+2);
		      
		    	  if(sum>0) {
		    		  if(sum>max){       
			               max=sum; 
			              }
		    	  }
		                 } 
		                                        
		             }
	            }
	            else {
	            	 for(int k=0;k<4;k++){
		                 for(int l=0;l<4;l++){
		       sum=ar.get(k).get(l)+ar.get(k).get(l+1) +ar.get(k).get(l+2)+ar.get(k+1).get(l+1)+ar.get(k+2).get(l)+ar.get(k+2).get(l+1)+ar.get(k+2).get(l+2);
 if(k==0&&l==0) {
       max=sum;		     	   
		       }
 if(sum>max){        
			               max=sum;  
			              }
		                 } 
		                                        
		             }
	            }
	             System.out.println(max);
	    }
	}

