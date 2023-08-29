package Hackerrank;

public class sherlockBeast {
public static void sb(int n) {
	int num=n;
	int forFive=0;
	boolean bool=true;
while(true) {
	if((num%3==0 && (n-num)%5==0)) {
		if((n-num)==0) {
			forFive=n;
			break;
		}
		forFive=num;
		break;
	}
	if(num<=0) {
		if(n%3==0) {
			forFive=n;
			break;
		}
		else if(n%5==0) {
			forFive=0;
		}
	 else {
		bool=false;
		break;
	 }
	}
	num--;
}

for(int i=0;i<n;i++) {
	if(!bool) {
		System.out.print(-1);
		break;
	}
	if(i<forFive) {
		System.out.print(5);
	}
	else {
		System.out.print(3);
	}
}
System.out.println("");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          sb(5);  
	}

}
