package Hackerrank;

public class reducedString {
     public static String reducedstring(String s) {
    	 String str=s;
    	 int len=str.length();
    	 int i=0;
   while(i<len-1) {
    	len=str.length();
    	if(str.isEmpty()) {
    		return "Empty String"; 
    	}
    	char ch=str.charAt(i);
    	char chh=str.charAt(i+1);
    	if(ch==chh){
    		str=str.substring(0,i)+str.substring((i+1)+1); 
    		i=-1;
    	}
    	i++;
    } 
    return str;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abba";
		String strr=str.substring(0, 1) + str.substring(2 + 1);  
System.out.println(strr);
System.out.println(reducedstring(str));
}

}
