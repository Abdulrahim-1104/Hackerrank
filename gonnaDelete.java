package Hackerrank;

import java.util.*;

public class gonnaDelete {
	public static int queenattacks(int n,int k,int r,int c,ArrayList<ArrayList<Integer>> obstacles ) {
	   HashMap<Integer, HashSet<Integer>> cache = new HashMap<>();
	    for (int i = 0; i < obstacles.size(); i++) {
	      if (cache.containsKey(obstacles.get(i).get(0))) { 
	        cache.get(obstacles.get(i).get(0)).add(obstacles.get(i).get(1));
	      } else {
	        cache.put(obstacles.get(i).get(0), new HashSet<Integer>());
	        cache.get(obstacles.get(i).get(0)).add(obstacles.get(i).get(1));
	      }
	    }
	    int counter = 0;
	    // right
	    for (int i = c + 1; i <= n; i++) {
	      if (cache.containsKey(r) && cache.get(r).contains(i)) {
	        break;
	      }
	      counter++;
	    }

	    // left
	    for (int i = c - 1; i >= 1; i--) {
	      if (cache.containsKey(r) && cache.get(r).contains(i)) {
	        break;
	      }
	      counter++;
	    }

	    // down
	    for (int i = r + 1; i <= n; i++) {
	      if (cache.containsKey(i) && cache.get(i).contains(c)) {
	        break;
	      }
	      counter++;
	    }

	    // up
	    for (int i = r - 1; i >= 1; i--) {
	      if (cache.containsKey(i) && cache.get(i).contains(c)) {
	        break;
	      }
	      counter++;
	    }

	    // up-left
	    for (int i = r - 1, j = c - 1; i >= 1 && j >= 1; i--, j--) {
	      if (cache.containsKey(i) && cache.get(i).contains(j)) {
	        break;
	      }
	      counter++;
	    }

	    // up-right
	    for (int i = r - 1, j = c + 1; i >= 1 && j <= n; i--, j++) {
	      if (cache.containsKey(i) && cache.get(i).contains(j)) {
	        break;
	      }
	      counter++;
	    }

	    // down-right
	    for (int i = r + 1, j = c + 1; i <= n && j <= n; i++, j++) {
	      if (cache.containsKey(i) && cache.get(i).contains(j)) {
	        break;
	      }
	      counter++;
	    }

	    // down-left
	    for (int i = r + 1, j = c - 1; i <= n && j >= 1; i++, j--) {
	      if (cache.containsKey(i) && cache.get(i).contains(j)) {
	        break;
	      }
	      counter++;
	    }

	    return counter;
	}
	public static void main(String args[]) {
		Scanner scn=new Scanner(System.in);
		ArrayList<ArrayList<Integer>> obs=new ArrayList <ArrayList<Integer>>(); 
		int k=100000;
		int n=100000;
		int qrow=4564;
		int qcol=3988;
		for(int i=0;i<k;i++) {
			obs.add(new ArrayList<Integer>());
		}
	
	System.out.println("Enter a numbers");
for(int i=0;i<obs.size();i++) {
	obs.get(i).add(0,scn.nextInt());
	obs.get(i).add(1,scn.nextInt());
}
scn.close();

	System.out.println(obs);
	System.out.println(queenattacks(n,k,qrow,qcol,obs));

	}

}
