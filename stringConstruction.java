package Hackerrank;

public class stringConstruction {
	 public static int sc(String s) {
		    // Write your code here
		  int count=0;
		     int track[]=new int[26];
		     for(int i=0;i<s.length();i++){
		        if(track[s.charAt(i)-97]==0) 
		            count++;
		            track[s.charAt(i)-97]=1;
		     }
		     return count;
		    }
public static int scc(String s) {
	int count=0;
String p="";
	for(int i=0;i<s.length();i++) {
		if(!p.contains(String.valueOf(s.charAt(i)))){
			count++;
		}
		p+=s.charAt(i);
	}
	return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String s="abac"; System.out.println(scc(s));
		 */
		StringBuffer sb=new StringBuffer("Rahim");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.codePointAt(2));
		System.out.println(sb.append(" jr"));
		System.out.println(sb.delete(1, 3));
	}

}
