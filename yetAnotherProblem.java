package Hackerrank;
import java.util.*;
public class yetAnotherProblem {
	public static List<List<Integer>> permutationCombination(List<Integer> arr){
		List<List<Integer>> list = new ArrayList<>();
		int val=0;
		for(int i=0;i<arr.size();i++) {
			list.add(new ArrayList<Integer>());  
			val=i;
			for(int j=0;j<arr.size()-1;j++) {
					list.get(i).add(arr.get(val));
					if(val>arr.size()-2) {
						val=-1;
					}
					list.get(i).add(arr.get(++val));
			}
			
		}
		return list;
	}
	public static List<Integer> anotherMinimaxProblem(List<Integer> a) {
		    // Write your code here
		List<Integer> list = new ArrayList<>();
		boolean bool=true;
		int total=0;
		int indx=0;
		int result=0;
		int min=Integer.MAX_VALUE;
           for(int i=0;i<a.size();i++) {
        	   int val=i;
        	   int max=Integer.MIN_VALUE;
        	   for(int j=0;j<a.size()-1;j++) {
        		   int val1=a.get(val);
        		   if(val>a.size()-2) {
        			   val=-1;
        		   }
        		   int val2=a.get(++val);
        		   int xor=val1^val2; 
        		   if(xor>max) {
        			   max=xor;
        		   }
        		   total+=xor;
        	   }
        	   list.add(max);
        	   if(total<min) {
        		   min=total;
        		   bool=true;
        	   }
        	   else {
        		   bool=false;
        	   }
           }
           //boundary condition
 
           return list;
		    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list = new ArrayList<>();
list.add(77);
list.add(49);
list.add(90);
list.add(110);
list.add(69);
list.add(63);
list.add(4);
list.add(249);
list.add(244);
list.add(245);
//list.add(4);
Collections.sort(list);
System.out.println(permutationCombination(list));
System.out.println(anotherMinimaxProblem(list));

	}

}
