package Hackerrank;
import java.util.*;
public class brakect {
	 static String isBalanced(String s) 
	    {
	        Stack<Character> stack=new Stack<Character>();
	        boolean isBalanced=false;
	        for(int i=0;i<s.length();i++){
	            if(s.charAt(i)=='('||s.charAt(i)=='{'){
	                stack.push(s.charAt(i));
	            }
	            else{
	                if(s.charAt(i)==')'){
	                    if(stack.pop()=='('){
	                        isBalanced=true;
	                    }
	                    else{
	                        isBalanced=false;
	                        break;
	                    }
	                }
	                if(s.charAt(i)=='}'){
	                    if(stack.pop()=='{'){
	                        isBalanced=true;
	                    }
	                    else{
	                        isBalanced=false;
	                        break;
	                    }
	                }
	            }
	        }
	        if(stack.isEmpty()) {
	        	isBalanced=true;
	        }
	        else {
	        	isBalanced=false;
	        }
	        if(isBalanced){
	            return "true";
	        }
	        else{
	            return "false";
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* This is also a comment /* More comments */
		try 
		{
		    Float f1 = new Float("3.0");
		    int x = f1.intValue();
		    byte b = f1.byteValue();
		    double d = f1.doubleValue();
		    System.out.println(x + b + d);
		}
		catch (NumberFormatException e) /* Line 9 */
		{
		    System.out.println("bad number"); /* Line 11 */
		}
	}

}
