package Hackerrank;
import java.util.*;
public class ladyBud {
	   public static String happyLadybugs(String s) {
        boolean bool=false;
        boolean bools=false;
        char ch[]=s.toCharArray();
         Arrays.sort(ch);
         String ss=String.valueOf(ch); 
         HashSet<Character> set=new HashSet<Character>();
         for(char c:ss.toCharArray())
         {
             set.add(Character.valueOf(c));
         }
         if(set.iterator().next()=='_') {
        	 return "YES";
         }
         for(char c:set) {
             if(c=='_') {
                 break;
             }
             bool=false;
             int count=0;
             for(int j=0;j<s.length();j++) {
                 if(c==s.charAt(j)) {
                     count++;
                 }
                 if(count>=2) {
                	 break;
                 }
             }
             if(count<=1) { 
                 bools=true;
                 break;
             }
             if(count>1) {
                 bool=true;
             }
         }
         if(bools==true) {
        	 return "NO";
         }
    	   if(!s.contains("_")){
               for(int i=1;i<s.length()-1;i++) {
               if(s.charAt(i)==s.charAt(i+1)||s.charAt(i)==s.charAt(i-1)){
                      bool=true;
                            }
               else {
                   bool=false;
                   break;
               }
               }
         }
         if(bool==true) {
             return "YES";
         }
 
             return "NO";
	        
	   }
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
      String str="RBY_YBR";
System.out.println(happyLadybugs(str));
	}

}
