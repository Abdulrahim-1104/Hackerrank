package Hackerrank;
import java.util.*;
public class absolutePermutation {
public static List<Integer> ap(int n,int k){
    List<Integer> list = new ArrayList<>();
    int val=(n/k)%2;
    if(val!=0 || (n%2!=0 && k!=0) || k>(n/2)){  
        list.add(-1);
        return list;
    }
  for(int i=1;i<=n;i++) {
		//if((n/i)%2==0) {
			  for(int j=1;j<=n;j++) {
				  if(!list.contains(j)) {
				  if(Math.abs(i-j)==k) {
					  list.add(j);
					  break;
				  }
				  }
			  }
		//}
  }
  if(list.size()!=n) {
	  list.clear();
	  list.add(-1);
  }
      return list;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ap(12 ,3)); 
  System.out.println(10/0);
	}

}
