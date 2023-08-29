package Hackerrank;
import java.util.*;
import java.math.BigInteger;
public class bigSorted {
    public static List<String> bigSorting(List<String> input) {
    // Write your code here
    	Collections.sort(input,new Comparator<String>() {

			@Override
			public int compare(String a, String b) {
				// TODO Auto-generated method stub
				if(a.length()>b.length()) return 1;
				else if(a.length()<b.length()) return -1;
				else {
					BigInteger b1=new BigInteger(a);
					BigInteger b2=new BigInteger(b);
					return b1.compareTo(b2);
				}
			}
    		
    	});
    return input;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> s=new ArrayList<>();
		s.add("6");
		s.add("31415926535897932384626433832795");
		s.add("1");
		s.add("3");
		s.add("10");
		s.add("3");
		s.add("5");
		System.out.println(s);
		System.out.println(bigSorting(s));
		
	}

}
