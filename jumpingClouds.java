package Hackerrank;
import java.util.*;
public class jumpingClouds {
	  public static int jumpingOnClouds(List<Integer> c) {
		    // Write your code here
		int n=c.size()-1;
		int i=0;
		int jump=0;
		while(i<=n-2){  
		    if(c.get(i+1)==1&&c.get(i+2)==0){ 
		        i=i+2;
		        jump++;
		    }
		    else if(c.get(i+1)==0&&c.get(i+2)==0){
		        i=i+2;
		        jump++;
		    }
		    else{
		        i++;
		        jump++;
		    } 
		}
		return jump;
		    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list=new ArrayList<>();
list.add(0);
list.add(0);
list.add(1);
list.add(0);
list.add(0);
list.add(1);
list.add(0);
System.out.println(jumpingOnClouds(list));
	}
	 obs.get(0).add(0,20001);
	 obs.get(0).add(1,20002);                      
	 obs.get(1).add(0,20001);
	 obs.get(1).add(1,20004);
	 obs.get(2).add(0,20000);
	 obs.get(2).add(1,20003);
	 obs.get(3).add(0,20002); 
	 obs.get(3).add(1,20003);
	 obs.get(4).add(0,20000);
	 obs.get(4).add(1,20004);
	 obs.get(5).add(0,20000);
	 obs.get(5).add(1,20002);
	 obs.get(6).add(0,20002);
	 obs.get(6).add(1,20004);
	 obs.get(7).add(0,20002);
	 obs.get(7).add(1,20002);
	 obs.get(8).add(0,564);
	 obs.get(8).add(1,323);
}
