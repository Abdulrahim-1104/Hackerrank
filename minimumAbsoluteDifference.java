package Hackerrank;
import java.util.*;
public class minimumAbsoluteDifference {
public static int mad(List<Integer> arr) {
	for(int i=0;i<arr.size();i++) {
    	if(arr.get(i)<0) {
    		int val=arr.get(i)*-1; 
    	     arr.add(i,val); 
    		 arr.remove(i+1); 
    	}
    }
	Collections.sort(arr);
	return arr.get(1)-arr.get(0);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = new ArrayList<>();
		arr.add(3);
		arr.add(-7);
		arr.add(0);
        System.out.println(mad(arr));
	}

}
