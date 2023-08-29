package Hackerrank;
import java.util.*;
import java.util.stream.Collectors;
public class twoChar {
	public static int tc(String s) {
		int maxLen=Integer.MIN_VALUE; 
		String noDup= Arrays.asList(s.split("")).stream().distinct().collect(Collectors.joining());
		for(int i=0;i<noDup.length()-1;i++) {
			String str=s;
			for(int j=i+1;j<noDup.length();j++) {
				str=s.replace(String.valueOf(noDup.charAt(i)), "");
				str=str.replace(String.valueOf(noDup.charAt(j)), ""); 
				int len=str.length()-1;
				for(int k=0;k<len;k++) {
					if(str.charAt(k)==str.charAt(k+1)) {
						str=str.replace(String.valueOf(str.charAt(k)), "");
						k=0;
						len=str.length()-1;
					}
			}
				if(str.length()>maxLen) {
					maxLen=str.length();
				}
		}
		}
		if(maxLen==Integer.MIN_VALUE) {
			maxLen=0;
		}
		return maxLen;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s= "asdcbsdcagfsdbgdfanfghbsfdab";
     System.out.println(tc(s));
   
	}

}
