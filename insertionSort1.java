package Hackerrank;
import java.util.*;
public class insertionSort1 {
	public static void rt(List<Integer> arr) {
		 int count=0;
	       for(int i=1;i<arr.size();i++){
	           for(int j=i;j>0;j--){
	        	   int jv=arr.get(j-1);
	        	   int iv=arr.get(j);
	               if(iv<jv){
	                   int temp=arr.get(j-1); 
	                   arr.set(j-1,arr.get(j)); 
	                   arr.set(j,temp); 
	                   count++;
	               }                     
	               else{
	                   break;
	               }
	           }
	           System.out.println(arr);
	       }
	       System.out.println(count);
	}
public static void is(List<Integer> s) {
	int val=s.get(s.size()-1);
    int indx=s.size()-1;
    int diff=0;
    for(int i=s.size()-2;i>=0;i--) {
         if(val<s.get(i)) {
    		diff=s.get(i);
    		Collections.swap(s, i, indx);
    		indx=i;
          for(int j=0;j<s.size();j++) { 
        	  if(val==s.get(j)) {
        	
        		  System.out.print(diff+" ");
        	  }
        	  else {
        		  System.out.print(s.get(j)+" ");
        	  }
          }
    	}
    	if(val>s.get(i)) {
    		s.set(i+1, val);
    		for(int k=0;k<s.size();k++) { 
    			System.out.print(s.get(k)+" ");
    		}
    		break;
    	}
    	System.out.println("");
    } 
    if(val==1) {
    	for(int k=0;k<s.size();k++) { 
			System.out.print(s.get(k)+" ");
		}
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          List<Integer> list = new ArrayList<Integer>();
          list.add(2);
          list.add(1);
          list.add(3);
          list.add(1);
          list.add(2);
         // list.add(2);       
         // is(list);
          rt(list);
	}
	//1 3 5 9 13 22 27 35 46 51 55 83 87 23
}
