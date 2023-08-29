package Hackerrank;

public class hackerrank {
    public static String hackerrankInString(String s) {
    // Write your code here
        String hck="hackerrank";
        int j=0;
        boolean bool=false;
        for(int i=0;i<hck.length();i++){
        bool=false;
        while(j<s.length()){
            if(hck.charAt(i)==s.charAt(j)){
                bool=true;
                j++;
                break;
            }
            j++;
        }
        }
        if(bool==true){
            return "YES";
        }
        else{
            return "NO";
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="rhackerank"; 
System.out.println(hackerrankInString(s));
	}

}
