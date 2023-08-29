package Hackerrank;

public class extralongFactorial {
	 public static void extraLongFactorials(int n) {
		    // Write your code here
		    long num=n;
		    long i=n;   
		    while(i>1){   
		        i--; 
		        num=num*i; 
		        }
		        System.out.println(num);
		        
		    }
	public static void main(String[] args) {
	        extraLongFactorials(30);

	}

}
