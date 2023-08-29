package Hackerrank;
import java.util.*;
class hRank {
	public static int binarySearch(ArrayList<Integer> a,int target) { 
		int start=0;
		int end=a.size()-1;
		while(start<=end) {  
			int mid = (start+end)/2; 
			if(target>a.get(mid))  
				start=mid+1;
			else if(target<a.get(mid)) {
				end=mid-1;
			}
			else  
				return a.get(mid);  
		}
		return -1; 
	}
	public static int common(ArrayList<ArrayList<Integer>> a) {    
		int common=0;
		int result=0;
		int j=0; 
		for(int i=0;i<a.get(0).size();i++) { 
			j=0;
			for(j=0;j<a.size();j++) { 
					if(binarySearch(a.get(j),a.get(0).get(i))!=-1) {   
					common++; 
					}
					else { 
					 common=0; 
					 break;
					}   
			}
			if(common==a.size()) { 
				common=0;
				result++; 
			}  
		} 
		return result;    
	} 
	   public static int birthdayCakeCandles(List<Integer> candles) {
	        int tallest=0;
	    for(int i=0;i<candles.size();i++){ 
	        for(int j=0;j<candles.size();j++){ 
	            if(i!=j){    
	                 if(candles.get(i)==candles.get(j)){ 
	                         tallest++;     
	                         break;
	                 }  
	            } 
	        }
	    } 
	    return tallest;

	    } 
	   public static int max(List<Integer> a) {
		   int max=0;
		   for(int i=0;i<a.size();i++) {
			max=a.get(i);
			for(int j=0;j<a.size();j++) {
				if(a.get(j)>max) { 
					max=a.get(j);
				}
			}
		   }
		   return max;
	   }
	   public static ArrayList<ArrayList<Integer>> sets(List<Integer> a,List<Integer> b) {
		   ArrayList<ArrayList<Integer>> list=new ArrayList<>();  
		 for(int l=1;l<=b.size()+a.size();l++) {  
		      list.add(new ArrayList<Integer>());    
		 }
		  int j=0; 
		  int p=0;
		  int c=0; 
		   for(int i=0;i<b.size();i++) {    
			   j=0;  
			  while(j<b.get(i)) {
				  j++;
				  if(j==0) { 
					  break;
				  } 
				  if(b.get(i)%j==0) { 
					  list.get(i).add(j); 
				  } 
			  } 
		   } 
		   for(int k=b.size();k<b.size()+a.size();k++) {    
			   p=0; 
			for(int m=0;m<max(b);m++) {      
			if(p<max(b)) { 
				
				 p=p+a.get(c);   
				 list.get(k).add(p); 
			}
			else {
				break;
			}
			} 
			c++; 
		   } 
		  
		   return list;  
	   }
public  static void main(String args[]) {
	
	//ArrayList<Integer> list = new ArrayList<>();
	List<Integer> a = new ArrayList<>();
	List<Integer> b = new ArrayList<>();
   a.add(2); 
   a.add(4);
   b.add(16);   
   b.add(32);
   b.add(96);
//b.add(12);
	
	/*
	
	list.add(18);
	list.add(90);
	list.add(90);   
	list.add(13);
	list.add(90);
	list.add(75);
	list.add(90);
	list.add(8);  
	list.add(90); 
	list.add(43); 
	System.out.println(birthdayCakeCandles(list));  
	*/
	System.out.println(sets(a,b));    
	System.out.println(common(sets(a,b)));  

}
}
