package Hackerrank;

public class makingAnagram {
public static String removeChar(String str,char c) {
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)==c) {
			return str.substring(0,i)+str.substring(i+1);
		}
	}
	return str;
}
public static int makinganagram(String s1,String s2) {
	int count=0;
	for(int i=0;i<s1.length();i++) {
		if(s2.contains(String.valueOf(s1.charAt(i)))) {
			s2=removeChar(s2,s1.charAt(i));
		}
		else {
			count++;
		}
	}
	return count+s2.length();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String s1="absdjkvuahdakejfnfauhdsaavasdlkj"; String
		 * s2="djfladfhiawasdkjvalskufhafablsdkashlahdfa";
		 * System.out.println(makinganagram(s1,s2));
		 */
		String s="abcd";
		s=s.substring(1);
		System.out.println(s);
		s.equals(s);
//     char c='a';
//     str=removeChar(str,c);
//     System.out.println(str);
//     str=removeChar(str,c);
//     System.out.println(str);
     
 
	}

}
