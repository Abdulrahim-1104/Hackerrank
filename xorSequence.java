package Hackerrank;
import java.util.*;
public class xorSequence {
public static long xs(long l,long r) {
  long current=0;
  long temp=0;
  if((l&3)==3) {
	  current=0;
  }
  else if((l&3)==0) {
	  current=l;
  }
  else if((l&3)==1) {
	  current=1;
  }
  else {
	  current=l+1;
  }
  long total=current;
  while(l<r) { 
	  temp=current^(++l);
	  total^=temp;
	  current=temp;
  }
	return total;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long x=350791522994237L;
		long y=914349540072320L; 
		System.out.println(xs(x,y));
	}

}
