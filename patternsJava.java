package Hackerrank;
import java.util.*;
public class patternsJava {
public static void ex1(String s){
	for(int i=0;i<s.length();i++) {
		for(int j=0;j<s.length();j++) {
			if(i==0) {
				System.out.print(s.charAt(j));
			}
			else {
				if(j==0) {
					System.out.print(s.charAt(i));
				}
				else if(j==s.length()-1){
					System.out.print(s.charAt(j-i));
				}
				else if(i==s.length()-1) {
					System.out.print(s.charAt(i-j));
				}
				else {
					System.out.print("0");
				}
			}
		}
		System.out.println("");
	}
}
public static void ex2(String s)  {
	int i=0;
	int j=0;
	do{
		j=0;
		 do{
			if(i==j) { 
				System.out.print(s.charAt(j));
			}
			else if(j==(s.length()-1)-i) { 
				System.out.print(s.charAt(i));  
			}
			else
				System.out.print(" ");
			
			j++;
		}while(j<s.length());
		i++;
		System.out.println(""); 
	}while(i<s.length()) ;
}
public static void ex3(int num) {
	int val=1;
	  int a[][]=new int[num][num];
       for(int i=0;i<num;i++) {
     	  for(int j=0;j<num;j++) {
     		  a[i][j]=0; 
     	  }
       }
      for(int i=0;i<num;i++) {
    	  for(int j=0;j<num;j++) {
    			System.out.print((a[i][j]=val++)+"  ");
    		
    	  }
    	  System.out.println("");
      }
}
public static void ex4(int n) {
	int oddVal=1;
	int evenVal=1;
	for( int i=0;i<n;i++) {
		for(int j=0;j<n;j++) { 
			if(i%2==0) {
				System.out.print(evenVal++ + " ");
			}
		else{
			System.out.print(oddVal-- +" ");
		}
	}
		if(i%2==0) {
			oddVal=evenVal+n-1;
		}
		else {
			evenVal=oddVal+n-1;
		} 
		System.out.println("");
}
}
public static void p1(int n){
	for(int v=1;v<n+n;v++) {
		int i=v;
		for(int j=1;j<n+n;j++) {
			if(i>n) {
				i=(n+n)-i;   
			}
			if(i!=1 && i!=n+n-1 && j!=1 && j!=n+n-1) {    
				if(j>=i&&j<=(n+n)-i) { 
					System.out.print(n-(i-1)+" "); 
				}
				else {
					int val=n-(j-1);
					if(j>n) {
						val=j-(n-1);
					}  
					System.out.print(val+" ");
				}
			}
			else {
				System.out.print(n+" ");
			}
		}
		System.out.println("");
	}
}
public static void spiralPattern(int n) {
int arr[][]=new int[n][n];
int minCol=0;
int maxCol=n-1;
int minRow=0;
int maxRow=n-1;
int val=1;
while(val<=n*n) {
//left to right
	for(int i=minCol;i<=maxCol;i++) {
	   arr[minRow][i]=val++;
}
	//top to bottom
	for(int j=minRow+1;j<=maxRow;j++) {
		arr[j][maxCol]=val++;
	}
	//right to left
	for(int k=maxCol-1;k>=minCol;k--) {
		arr[maxRow][k]=val++;
	}
	//bottom to top
	for(int l=maxRow-1;l>=minRow+1;l--) {
		arr[l][minRow]=val++;
	}
	minRow++;minCol++;maxCol--;maxRow--;
}

for(int i=0;i<n;i++) {
	for(int j=0;j<n;j++) {
		if(arr[i][j]<10) {
			System.out.print(arr[i][j]+"    ");
		}
		else {
			System.out.print(arr[i][j]+"   ");
		}
	}
	System.out.println("");
}

}
public static void pattern2(int n) {
	for(int i=0;i<n;i++) {
		int val=i;
		if(val > n/2) {
			val=(n-1)-val;
		}
		for(int j=0;j<n;j++) {
			if(j<=val) {
				System.out.print("* ");
			}
		}
		System.out.println("");
	}
}
public static String stringProblem(String str) {
	String result="";
	for(int i=0,j=1;i<str.length()&&j<str.length();i+=2,j+=2) {
		int end=str.charAt(j)-48;
		char ch=str.charAt(i);
		for(int k=0;k<end;k++) {
			result+=ch;
		}
	}
	return result;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //System.out.println(spiralPattern(5));
		spiralPattern(5);
}
}