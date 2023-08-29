package Hackerrank;
import java.util.*;

import sun.tools.jconsole.ProxyClient.SnapshotMBeanServerConnection;
public class organisingContainerOfBalls {
	public static String organizingContainers(List<List<Integer>> container) {
		int total=0;
        LinkedList<Integer> con = new LinkedList<>();
        LinkedList<Integer> bal = new LinkedList<>();
          for(int i=0;i<container.size();i++) {
			int sum=0;
			int balls=0;
		              for(int j=0;j<container.size();j++) {
            	  sum+=container.get(i).get(j);
            	  balls+=container.get(j).get(i); 
              }
             con.add(sum);
             bal.add(balls);
		}
	    con.removeAll(bal);
	    if(con.isEmpty()) {
	    	return "Possible";
	    }
	    return "Impossible";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		List<List<Integer>> containers = new ArrayList<>();
		int k=4;
		for(int i=0;i<k;i++) {
			containers.add(new ArrayList<Integer>());
		}
	System.out.println("Enter a number");
	for(int i=0;i<containers.size();i++) {
		containers.get(i).add(0,scn.nextInt());
		containers.get(i).add(1,scn.nextInt());
		containers.get(i).add(2,scn.nextInt());
		containers.get(i).add(3,scn.nextInt());
	}
	scn.close();

	
	/*	containers.get(0).add(0,1);
		containers.get(0).add(1,3);
		containers.get(0).add(2,1);
		containers.get(1).add(0,2);
		containers.get(1).add(1,1);
		containers.get(1).add(2,2);
		containers.get(2).add(0,3);
		containers.get(2).add(1,3);
		containers.get(2).add(2,3);
		*/
		
		
		/*
	    containers.get(0).add(0,0);
		containers.get(0).add(1,2);
		containers.get(0).add(2,1);
		containers.get(1).add(0,1);
		containers.get(1).add(1,1);
		containers.get(1).add(2,1);
		containers.get(2).add(0,2);
		containers.get(2).add(1,0);
		containers.get(2).add(2,0);*/
	
		System.out.println(containers);
		System.out.println(organizingContainers(containers));
	}

}
