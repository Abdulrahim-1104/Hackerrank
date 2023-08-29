package Hackerrank;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class minimumDistances {
public static int fun(List<Integer> a) {
	int n=a.size();
	HashMap<Integer,Integer> distances = new HashMap<>();
    
    int minDistance = -1; 
     
    for(int i = 0; i < n; i++)
    {
        if(distances.containsKey(a.get(i)))
        {
            //Calculate distance between like numbers
            int distance = Math.abs(distances.get(a.get(i)) - i); 
            
            if( distance < minDistance || minDistance == -1) 
            {
                minDistance = distance;
            }
            
            //Set start point to the old end point
            distances.put(a.get(i), i);
        }
        else
        {
            //Add a new starting point
            distances.put(a.get(i), i);
        }
    }
    
    return minDistance;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=5;
		List<Integer> l=new ArrayList<>();
		System.out.println("Enter a number");
for(int i=0;i<n;i++) {
	l.add(scn.nextInt());
}
scn.close();
	System.out.println(fun(l));
	} 

}
