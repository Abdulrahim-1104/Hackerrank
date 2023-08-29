package Hackerrank;
import java.util.*;
public class cavityMap {
public static List<String>  cm(List<String> g) { 
	for(int i=1;i<g.size()-1;i++) {
		int max=Integer.MIN_VALUE;
		int indx=0; 
		boolean bool=false;
		for(int j=1;j<g.size()-1;j++) {
			int val=(int)g.get(i).charAt(j);
			int font=(int)g.get(i).charAt(j-1);
			int back=(int)g.get(i).charAt(j+1);
			int top=(int)g.get(i-1).charAt(j);
			int bottom=(int)g.get(i+1).charAt(j);
			if(val>max) {
				if(val>font&&val>back&&val>top&&val>bottom) {
					max=val;
					indx=j;
					bool=true;
				}
			}
			if(bool==true) {
				char[] myG =g.get(i).toCharArray(); 
				myG[indx] = 'X';
				String s=String.valueOf(myG);
				g.set(i, s); 
				max=Integer.MIN_VALUE;
			}
		}
			
	}
	return g;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> l=new ArrayList<String>();
      Scanner scn=new Scanner(System.in);
      int n=8;
      System.out.println("Enter a value");
for(int j=0;j<n;j++) {
	l.add(scn.nextLine());
}
  System.out.println(cm(l)); 
  scn.close();
	}

}
 
