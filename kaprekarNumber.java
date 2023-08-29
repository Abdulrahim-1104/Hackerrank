package Hackerrank;

public class kaprekarNumber {
	 public static String removeCharAt(String s, int pos) {
	      return s.substring(0, pos) + s.substring(pos + 1);
	   }
public static void kaprekar(int p, int q) {
	boolean bool=false;
	for(int i=p;i<=q;i++) {
		if(i==1) {
			System.out.print(1+" "); 
			bool=true;
		}
		if(i==9) {
			System.out.print(9+" ");
			bool=true;
		}
		else {
			if(i>=90) {
				int sqr=i*i;
				int total=0;
				String str=Integer.toString(sqr);
				for(int j=0;j<str.length();j++) {
					int len=(str.length()/2)-1; 
					if((len+1/2)%2==0) {
						len=str.length()/2;
						int l=Integer.parseInt(str.substring(0, len));
						int r=Integer.parseInt(str.substring(len));
						total=l+r;
					}
					
					else {
						int l=Integer.parseInt(str.substring(0, len+1));
						int r=Integer.parseInt(str.substring(len));
						total=l+r; 
					}
				}
				if(total==i) {
				System.out.print(i+" ");
				bool=true;
				}
			}
				
			}
	}
	if(!bool) {
		System.out.println("INVALID RANGE");
	}
}
public static void kaprers(int p,int q) {
	int sqr=0;
	int total=0;
	for(int i=p;i<=q;i++) {
		if(i<=1) {
			System.out.print("1"+" ");
		}
		else if(i<=9&&i==9) {
			System.out.print("9"+" ");
		}
		else {
			if(i>10) {
				sqr=i*i;
				String s=Integer.toString(sqr);
				int mid=(s.length())/2-1;
				int len=s.length()-1;
				int left=0;
				int right=0;
				if(len==1) {
					left=s.charAt(0);
					right=s.charAt(1);
					total=left+right;
				}
				else {
					if(s.charAt(mid+1)==0) {
						  s=removeCharAt(s,mid+1);
						  mid=s.length()/2-1;
						}
					
				   left=Integer.parseInt(s.substring(0,mid+1));
				   right=Integer.parseInt(s.substring(mid+1)); 
				   total=left+right;
				   if(total==i) {
				   System.out.print(total+" "); 
				   }
				}
			}
		}
		}
}
	public static void main(String[] args) {
		int p=1;
		int q=99999;
         kaprers(p,q);

	}

}
