package Hackerrank;

public class hallowenSales {
	public static int howManyGames(int p, int d, int m, int s) {
		  int noOfGames=1;
		  int moneyInWallet=p; 
		  int dupP=p-d;
		  while(true) {
			  moneyInWallet+=dupP;
			  if(p>s) {
				  noOfGames=0;
				  break;
			  }
			  if(p<=m) {
				  noOfGames=s/p; 
				  break;  
			  }
			  else {  
				  if(dupP>m) { 
					  dupP=dupP-d; 
				  }
				  else {
					  dupP=m;
				  }
				  
				  if(moneyInWallet>=s) {
					  break;
				  }
				  noOfGames++;
			  } 
		  }
		  return noOfGames;  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println(howManyGames(20,3,6,80));
	}

}
