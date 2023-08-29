package Hackerrank;
import java.util.*;
public class fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Scanner scn=new Scanner(System.in);
	System.out.println("Enter a number");
	//int n=scn.nextInt();
	int n=7;
          int i=3;
          int temp=0;
          int fib=5;
          int count=0;
          int result=0;
          while(count<3) { 
        	  temp=fib; 
        	  fib=fib+i;
        	  i=temp;
        	  result+=i;
        	  count++;
        	  System.out.print(i+" ");
          }
          System.out.println("\n"+result);
	}

}
