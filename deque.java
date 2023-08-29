package Hackerrank;
import java.util.*;
public class deque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Deque<Integer> deque = new ArrayDeque<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int n=6;
		int m=3;
		int res=0;
	    for (int i = 0; i < n; i++) {
            final int num = in.nextInt();
            deque.addLast(num);
            if (map.containsKey(num)) {
                map.put(num, map.get(num).intValue() + 1);
            } else {
                map.put(num, 1);
            }

            if (deque.size() == m + 1) {
                final int key = deque.removeFirst();
                final int v = map.get(key);
                if (v == 1) {
                    map.remove(key);
                } else {
                    map.put(key, v - 1);
                }
            }

            final int cnt = map.size();
            if (cnt > res) { res = cnt; }
        }
        System.out.println(res);		

	}

}











if(test*test==l){
    wid=test;
    len=test;
}else{
wid=test;
len=test+1;
if(wid*len<l)
    wid++;





















