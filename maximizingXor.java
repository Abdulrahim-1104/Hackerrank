package Hackerrank;
import java.util.*;
public class maximizingXor {
public static int mxor(int l,int r) {
    int max=Integer.MAX_VALUE;
    for(int i=l;i<=r;i++){
        for(int j=i;j<=r;j++){
            if((i^j)<max){
                max=i^j;
            }
        }
    }
    return max;
	
}
public static int mx(int l,int r) {
	int xor=l^r;
	int count=0;
	while(true) {
		count++;
		xor=xor>>1;
            if(xor==0) {
            	break;
            }
	}
	xor=(int) Math.pow(2,count)-1;
	return xor;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long dupp=~4294967295L;
		long dup=2147483648L;
		long l=1;
      long val =~l;
      long res=(long)Math.pow(2,32);
      long vall=val^dup;
      for(int i=31;i>=0;i--) {
    	  System.out.print(((l>>i)&1)); 
    	
      }
      System.out.println("");
      for(int i=31;i>=0;i--) {
    	  System.out.print(((val>>i)&1)); 
    	//  System.out.print((dup>>i)&1);
    	
      }
      System.out.println("");
      for(int i=32;i>=0;i--) {
    	  System.out.print(((res>>i)&1)); 
    	//  System.out.print((dup>>i)&1); 
    	
      }
      long j=val^res;
      System.out.println();
      System.out.println(l);
     System.out.println(val); 
 //    System.out.println(res);
     System.out.println(j); 
     //System.out.println(~l);
     System.out.println("");
     for(int i=34;i>=0;i--) {
   	  System.out.print((((j^1)>>i)&1)); 
   	//  System.out.print((dup>>i)&1); 
   	
     }
	}

}
