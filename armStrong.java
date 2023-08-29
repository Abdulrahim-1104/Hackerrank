package Hackerrank;

public class armStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=820;
		int count=String.valueOf(n).length();  
		int temp=n;
		int total=0; 
		while(temp>0) {
			int mod=temp%10;
			int num=1;
			for(int i=1;i<=count;i++) {
				num=num*mod;
			}
			temp=temp/10;
			total=total+num;
		}
      if(n==total) {
    	  System.out.println("Yes");
      }
      else
       System.out.println("No");
	}

}
