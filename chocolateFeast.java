package Hackerrank;

public class chocolateFeast {
    public static int chocolateFeasts(int n, int c, int m) {
    	 int eatenBars=n/c;
         int wrappers=eatenBars; 
         int q=0;
         int r=0;
         while(wrappers>=m){ 
             q=wrappers/m;
             r=wrappers%m;
             wrappers=q+r;
             eatenBars+=q;
         } 
         return eatenBars;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(chocolateFeasts(6,2,2));
	}

}
