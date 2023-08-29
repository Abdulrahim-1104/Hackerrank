package Hackerrank;

public class cloudHopping {
	static int jumpingOnClouds(int[] c, int k) {
		 int n=c.length;
	        int energy=100; 
	        int i=0;
	       	        do {
	       	        	if(c[(i+k)%n]==1) 
	       	        		energy-=2;
	       	        	energy--; 
	       	        	i=(i+k)%n;
	       	        }while(i!=0);
	        return energy; 
        
    } 
public static void main(String args[]) {
	int c[]={1,1,1,0,1,1,0,0,0,0}; 
	System.out.println(jumpingOnClouds(c,3));
}
}
