package Hackerrank;

import java.util.Arrays;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="He's the, main @ google ! at what?";
s=s.trim();
String str[]=s.split("[@,'!?\\s]");
for(int i=0;i<str.length;i++) {  
	System.out.println(str[i]);
}
	}
}
