package Hackerrank;
import java.util.*;
public class countSort2 {
public static List<Integer> cs2(List<Integer> arr){
	int max=Collections.max(arr);
	List<Integer> res=new ArrayList<>();
	Integer result[]=new Integer[arr.size()];
	int count[]=new int[max+1];
	// intial count as zero
	for(int i=0;i<max+1;i++) {
		count[i]=0;
	}
	// now incrementing the array element at the index
	for(int i=0;i<arr.size();i++) {
		int val=arr.get(i);
		count[val]++;
	}
	// finding the cumulative in the same count array
	for(int i=1;i<count.length;i++) {
		count[i]=count[i-1]+count[i];
	}
	//finally sorting the array
	for(int i=0;i<arr.size();i++) { 
		result[count[arr.get(i)]-1]=arr.get(i);
		count[arr.get(i)]--;
	} 
	res=Arrays.asList(result);
	return res;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
       System.out.println("Enter the unsorted array");
       for(int i=0;i<5;i++) {
    	   list.add(scn.nextInt());
       }
       System.out.println(cs2(list));
       scn.close();
       
	}

}
