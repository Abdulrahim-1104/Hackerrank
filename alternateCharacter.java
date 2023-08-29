package Hackerrank;

public class alternateCharacter {
public static int ac(String str) {
	int count=0;
	for(int i=0;i<str.length()-1;i++){
	    if(str.charAt(i)==str.charAt(i+1)){
	    //    str=str.substring(0,i+1)+str.substring((i+1)+1);
	        count++;
	      //  i=i-1;
	    }
	}
	return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="AAABBAABB";
System.out.println(ac(str));
	}

}
 