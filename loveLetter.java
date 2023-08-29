package Hackerrank;

public class loveLetter {
public static int ll(String s) {
	int count=0;
	int n=s.length();
	for(int i=0;i<n;i++) {
		if(s.charAt(i)!='a') {
			if(s.charAt(i)!=s.charAt(n-i-1) && s.charAt(i)>s.charAt(n-i-1)) {
				char c=s.charAt(n-i-1);  
				count+=s.charAt(i)-s.charAt(n-i-1); 
				s=s.substring(0,i)+c+s.substring(i+1);
			}
		}
	}
	
	return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="adslkfja";
       System.out.println(ll(s));
       String sub=s.substring(s.length()/2,s.length());
       System.out.println(sub);
	}

}
