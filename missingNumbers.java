package Hackerrank;
import java.util.*;
import java.util.Collections;
import java.util.stream.*;

public class missingNumbers {
public static List<Integer> mn(List<Integer> arr,List<Integer> brr){
	  List<Integer> noDup =brr.stream().distinct().collect(Collectors.toList());
	  List<Integer> result = new ArrayList<>();
	for(int i=0;i<noDup.size();i++) {
		int count1=0;
		int count2=0;
		int noDupval=noDup.get(i);
		for(int j=0;j<arr.size();j++) {
			int arrval=arr.get(j);
			if(noDupval==arrval) {
				count1++; 
			}
		}
		for(int k=0;k<brr.size();k++) {
			int brrval=brr.get(k);
			if(noDupval==brrval) {
				count2++;
			}
		}
		int last=Math.abs(count2-count1);
		if(last>0) {
			result.add(noDup.get(i));
		}
	}
	Collections.sort(result);
	return result;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
     List<Integer> arr=new ArrayList<>();
     List<Integer> brr=new ArrayList<>();
     System.out.println("Enter a element for arr");
     for(int i=0;i<10;i++) {
    	 arr.add(scn.nextInt());
     }
     System.out.println("Enter a element for brr");
     for(int i=0;i<13;i++) {
    	 brr.add(scn.nextInt());
     }
     System.out.println(mn(arr,brr));
     scn.close();
	}

}
