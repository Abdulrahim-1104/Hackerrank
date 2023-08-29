package Hackerrank;
import java.util.*;
public class specialProblems {
public static int spcProb(int n, int k, List<Integer> arr) {
	int page=0;
	int spclProb=0;
	for(int i=0;i<n;i++) {
		page++;
		for(int j=1;j<=arr.get(i);j++) {
			 if(j%k==1&&j!=1) {
			    	page++;
			    }
			if(j==page) {
				spclProb++; 
			}
		   
		} 
	}
	return spclProb;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=new ArrayList<>();
		l.add(3);
		l.add(8);
		l.add(15);
		l.add(11);
		l.add(14);
		l.add(1);
		l.add(9);
		l.add(2);
		l.add(24);
		l.add(31);
         System.out.println(spcProb(10,1,l));
	}

} 
