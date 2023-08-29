package Hackerrank;

public class sherlock {
	 public static int squares(int a, int b) {
		    int count=0;
		    int i;
		    while(a<=b){
		        i=2;  
		        while(i<=a/2){
		            if(i*i==a){
		                count++; 
		                break;
		            }
		            i++;
		        }
		        a++;
		    }
		    return count;
		    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(squares(3,9)); 
        System.out.println(Math.floor(4.9));
        System.out.println(Math.pow(2,3));
        System.out.println(Math.ceil(6.1));
        System.out.println(Math.sqrt(9)); 
	}

}
