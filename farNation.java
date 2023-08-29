package Hackerrank;
import java.util.*;
public class farNation {
public static String farnation(List<Integer> b) {
	int loaf=0;
	if(b.get(0)%2!=0) {
		b.set(0,b.get(0)+1);
		loaf++;
		b.set(1,b.get(1)+1);
		loaf++;
	}
	int len=b.size()-1;
	for(int i=1;i<len;i++) {
		if(b.get(i)%2!=0) {
			if(b.get(i-1)%2!=0) {
				b.set(i-1,b.get(i-1)+1);
				loaf++;
				b.set(i,b.get(i)+1);
				loaf++;
			}
			else {
				b.set(i,(b.get(i)+1));
				loaf++;
				b.set(i+1,(b.get(i+1)+1));
				loaf++;
			}
		}
	}
	if(b.get(b.size()-1)%2!=0) {
		return "NO";
		}
	return String.valueOf(loaf);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=new ArrayList<>();
		l.add(1);
		l.add(2);
		//l.add(4);
	//	l.add(5);
		//l.add(6);
		System.out.println(farnation(l));
		System.out.println(l);

	}

}
