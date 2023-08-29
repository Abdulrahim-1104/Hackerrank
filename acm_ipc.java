package Hackerrank;
import java.util.*;
public class acm_ipc {
    public static List<Integer> acmTeam(List<String> topic) {
    // Write your code here
    	List<Integer> list=new ArrayList<>();
 int max=Integer.MIN_VALUE;
 int n=topic.size();
 int count=0;
 int team=0;
 for(int i=0;i<n-1;i++) {
	 char ch1[]=topic.get(i).toCharArray();
		 for(int j=i+1;j<n;j++) { 
			 char ch2[]=topic.get(j).toCharArray(); 
		 count=0;
		 for(int k=0;k<ch1.length;k++) {
			  {
				 if((ch1[k]=='0' && ch2[k]=='0')) { 
					 count++;  
				 }
			 }
		 }
		 count=ch1.length-count;
		 if(count>=max) {
			 if(count==max) {
				 team++;
				 }
			 if(count>max) {
				 team=0;
				 team++;
				 max=count;
			 }
		 }
	 }
 }
 list.add(max);
 list.add(team);
 return list;
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<String> topic=new ArrayList<String>();
       topic.add("11101");      
       topic.add("10101");   
       topic.add("11001");   
       topic.add("10111");   
       topic.add("10000");   
       topic.add("01110");   
     
       
     System.out.println(  acmTeam(topic));
     
   
     
     
     
     
       
	}

}
