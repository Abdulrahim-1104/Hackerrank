package Hackerrank;

import java.util.*;

public class beautifulTriplets {
public static int fun(int d,List<Integer> a) {
	Collections.sort(a);
	int count=0;
	for(int i=0;i<a.size()-2;i++) {
		for(int j=i+1;j<a.size()-1;j++) {
			if(a.get(j)-a.get(i)>d) {
			break;
			}
			else {
			for(int k=j+1;k<a.size();k++) { 
				if(a.get(k)-a.get(j)>d) {
					break;
				}
				else {
					if(a.get(j)-a.get(i)==d&&a.get(k)-a.get(j)==d){
						count++  ;
					}
					else {
						continue;
					}
				}
			}
			}
		}
	} 
	return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(4);
		l.add(5);
		l.add(7);
		l.add(8);
		l.add(10);
		System.out.println(fun(3,l));

	}

}
