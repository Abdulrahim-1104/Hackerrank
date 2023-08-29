package Hackerrank;
import java.util.*;
public class closestNo {
	 public static List<Integer> cn(List<Integer> arr) {
		 List<Integer> list = new ArrayList<>();
		 int min=Integer.MAX_VALUE;
	     Collections.sort(arr);
	     for(int i=1;i<arr.size();i++){ 
	    	 int val=arr.get(i)-arr.get(i-1);
	    	 if(val<min){
	             min=val;
	             list.clear();
	         }
	    	   if(val==min){
	                 list.add(arr.get(i-1)); 
	                 list.add(arr.get(i));
	             }
	     }
	     return list;
		     
		    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=10;
		List<Integer> list =new ArrayList<>();
		for(int i=0;i<n;i++) {
			list.add(scn.nextInt());
		}
		Collections.sort(list); 
		System.out.println(list);
          System.out.println(cn(list));
          scn.close();
	}

}
