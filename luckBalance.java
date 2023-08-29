package Hackerrank;
import java.util.*;
public class luckBalance {
public static List<List<Integer>> lb(List<List<Integer>> contests,int k) {
	return contests;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner scn=new Scanner(System.in);
          List<List<Integer>> contest=new ArrayList< >();
          for(int i=0;i<6;i++) { 
 			 contest.add(new ArrayList<Integer>());    
 		 }   
          System.out.println("Ente the number");
          for(int i=0;i<6;i++) {
        contest.get(0).add(scn.nextInt()); 
        contest.get(1).add(scn.nextInt());
          }
          System.out.println(lb(contest,3));
	}

}
