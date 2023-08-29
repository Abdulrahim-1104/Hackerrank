package Hackerrank;
import java.util.*;
public class weightedUniformString {
public static List<String> wus(String s,List<Integer> queries){
    List<Integer> list=new ArrayList<>();
    List<String> str=new ArrayList<>();
        boolean bool=false;
        int indx=0;
        int count=1;
        for(int i=0;i<s.length()-1;i++){
            if(!bool){
                indx=i;
                list.add(s.charAt(i)-96);
            }
            if(s.charAt(i)==s.charAt(i+1)){
                bool=true;
                count++;
                list.add(count*(s.charAt(i)-96));
            }
            else{
                count=1;
                bool=false;
            }
        }
        if(!bool){
            list.add(s.charAt(s.length()-1)-96);
        }
        else{
            count=(s.length()-1)-indx;
            list.add(count*s.charAt(s.length()-1));
        }
        for(int x:queries){
            str.add(list.contains(x)?"Yes":"No");
        }
       return str;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> q=new ArrayList<>();
          String s="abccddde";
          q.add(1);
          q.add(3);
          q.add(12);
          q.add(5);
          q.add(9);
          q.add(10);
          System.out.println(q);
          System.out.println(wus(s,q));
          System.out.println()
	}

}
