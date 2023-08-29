package Hackerrank;
import java.util.*;
public class gameOfThrones {
public static String got(String s) {
	 int count=0;
	    int odd=0;
	    char[] arr1 = s.toCharArray();
	    String targetStr = "";
	    for (char value: arr1) {
	     if (targetStr.indexOf(value) == -1) {
	      targetStr += value;
	     }
	    }
	    for(int i=0;i<targetStr.length();i++){
	    	count=0;
	        for(int j=0;j<s.length();j++){
	            if(targetStr.charAt(i)==s.charAt(j)){ 
	                count++;
	            }
	        }
	        if(count%2!=0){
	            odd++;
	        }
	        if(odd>1){
	            return "NO";
	        }
	    }
	    return "YES";
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s="aaabbbb";
 System.out.println(got(s));
	}

}
