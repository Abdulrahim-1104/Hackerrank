package Hackerrank;
import java.util.*;
public class marcCupcake {
public static long mcc(List<Integer> calories) {
	Collections.sort(calories);
	long minimumMiles=0;
	for(int i=0;i<calories.size();i++) { 
		 long pow= (long)Math.pow(2, i);
		long val=calories.get((calories.size()-1)-i);
		minimumMiles=minimumMiles+(val*pow);
	}
	return minimumMiles;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
	     List<Integer> arr=new ArrayList<>();
	     System.out.println(Math.pow(2, 1));
	     System.out.println("Enter a element for arr");
	     for(int i=0;i<4;i++) {
	    	 arr.add(scn.nextInt());
	     }
	     System.out.println(mcc(arr));
	     scn.close();
	}

}
