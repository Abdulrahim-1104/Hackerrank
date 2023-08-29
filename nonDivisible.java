package Hackerrank;
import java.util.*;
public class nonDivisible {
	 public static int nonDivisibleSubset(int k, List<Integer> s) {
		    // Write your code here
		        List<Integer> list;
		        int count,max=0;
		        for(int i=0;i<s.size();i++){
		            list=new ArrayList<Integer>();
		            list.add(s.get(i));
		            count=0;
		            for(int j=i;j<s.size();j++){
		                if(list.size()==1){
		                    if((s.get(i)+s.get(j))%k!=0){
		                        list.add(s.get(j));
		                        count++;
		                    }
		                }
		                else{            
		                      boolean bool=false;
		                    if((s.get(i)+s.get(j))%k!=0){ 
		                        for(int l=1;l<list.size();l++){
		                            bool=false;
		                            if((list.get(l)+s.get(j))%k==0){
		                                bool=true; 
		                                break;
		                            }
		                        }
		                        if(bool!=true){
		                            list.add(s.get(j));
		                            count++;
		                        }
		                    }
		                }
		            }
		            if(count>max){
		                max=count;
		            }
		        }
		        return max;
		    }
	 public static int  nonDivisibleSubsets(int k, List<Integer> s) {
		 List<Integer> list = new ArrayList<>();
		 List<Integer> c1;
		 List<Integer> c2;
		 boolean bool=false;
		 for(int i=0;i<=k/2;i++) {
			 c1=new ArrayList<Integer>(); 
			 c2=new ArrayList<Integer>();
			 for(int j=0;j<s.size();j++) {  
				 int val=s.get(j);
				if(bool==false) {
					if(val%k==0) {
						list.add(val);
						bool=true; 
						break;
					}
				}
				if(val%k==k-i) { 
					 if(k-i==i) { 
						 list.add(k);
						 break;  
					 }
					 else { 
					 c2.add(val);
					 }
				 }
				if(val%k==i) { 
					 c1.add(val);
				 } 
				
			 }
			 if(c1.size()>c2.size()) {
				 list.addAll(c1);
			 }
			 else if(c2.size()>c1.size()) { 
				 list.addAll(c2);
			 }
			 else {
				 continue;
			 }
		 }
		 return list.size();
 	 }
public static void main(String args[]) {
	List<Integer> list = new ArrayList<>();
	     
/*	list.add(770528134); 
	list.add(663501748);
	list.add(384261537);
	list.add(800309024);
	list.add(103668401);
	list.add(538539662); 
	list.add(385488901);
	list.add(101262949);
	list.add(557792122);
	list.add(46058493);*/
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	list.add(6);
	list.add(7);
	list.add(8);
	list.add(9);
	list.add(10);
	System.out.println(nonDivisibleSubsets(4,list));   
	
}
}
