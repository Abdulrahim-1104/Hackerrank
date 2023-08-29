package Hackerrank;

import java.math.BigInteger;
import java.util.*;

public class maxPerimeter {
public static List<Integer> mp(List<Integer> sticks){
	List<Integer> list = new ArrayList<>();
	List<Integer> result=new ArrayList<>();
	int sum=0;
	int total=0;
	int count=0;
	for(int i=0;i<3*(sticks.size()-2);i++) {
		if(list.size()==2) {
			if(sum<=sticks.get(count)) {
				list.clear();
				count=count-1;
				sum=0;
			}
			else {
				sum+=sticks.get(count);
				if(sum>total) {
					result.clear();
					result=new ArrayList<>(list);
					result.add(sticks.get(count));
					total=sum;
					count=count-1;
					sum =0;
					list.clear();
				}
				else {
					list.clear();
					count=count-1;
					sum=0;
				}
			}
		}
		else {
			list.add(sticks.get(count));
			sum+=sticks.get(count);
			count++;
		}
	}
	return result;
	
}
public static List<Integer> mpp(List<Integer> sticks){
	Collections.sort(sticks);
	List<Integer> result=new ArrayList<>();
    int n=sticks.size();
    long total=0;
	for(int i=0;i<n-2;i++) {
		for(int j=i+1;j<n-1;j++) {
			for(int k=j+1;k<n;k++) {
				int  a=sticks.get(i);
				int  b=sticks.get(j);
				int  c=sticks.get(k);
				if((a+b)<c) {
					break;
				}
				if((a+b)>c && (a+c)>b && (c+b)>a) {
				       long sum=a+b;
				       sum+=c;
					if(sum>total) {
						result.clear();
				       total=sum;	
				       result.add(a);
				       result.add(b);
				       result.add(c);
					}
				}		
			}
		}
	}
	if(result.isEmpty()) {
		result.add(-1);
	}
	return result;
}
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the number");
        for(int i=0;i<3;i++) {
        	list.add(scn.nextInt());
        }
        System.out.println(mpp(list));
        scn.close();
	}

}
