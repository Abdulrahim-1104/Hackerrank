package Hackerrank;

public class prisoner {
	public static int saveThePrisoner(int n, int m, int s) {
	    int candy=m;
	    int prisonerChairNo=s; 
	    int prisoner=n;
	    while(candy>1) {  
	        if(prisonerChairNo==prisoner){  
	            prisonerChairNo=1; 
	            candy--; 
	        }
	        else{  
	            prisonerChairNo++;
	            candy--; 
	        }
	    }
	    return prisonerChairNo; 
	 
	    }
	public static void main(String args[]) {
		System.out.print(saveThePrisoner(368127406, 680428368 ,105517295));
	}

}
