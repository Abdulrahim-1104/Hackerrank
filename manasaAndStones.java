package Hackerrank;
import java.util.*;
public class manasaAndStones {
	public static List<Integer> fun(int n, int a, int b){
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(a*(n-1));
		set.add(b*(n-1));
		for(int i=1;i<=n-1;i++) {
			int sum=0;
			sum+=i*a;
			sum+=((n-1)-i)*b;
			set.add(sum);
		}
		List<Integer> list = new ArrayList<>(set);
		Collections.sort(list);
		return list; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println(fun(400,8,16));
	}

}
