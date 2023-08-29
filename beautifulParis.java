package Hackerrank;
import java.util.*;
public class beautifulParis {
    public static int beautifulPairs(List<Integer> a, List<Integer> b) {
    // Write your code here
    int count=0;
    for(int i=0;i<a.size();i++){
        for(int j=0;j<b.size();j++){
            if(a.get(i)==b.get(j)){
                b.remove(j);
                count++;
            }
        }
    }
    if(count==a.size()) {
    	count=count-1;
    }
    else {
    	count=count+1;
    }
    return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scn=new Scanner(System.in);
     List<Integer> a = new ArrayList<>();
     List<Integer> b = new ArrayList<>();
     System.out.println("Enter for a");;
     int n=586;
     for(int i=0;i<n;i++) {
    	 a.add(scn.nextInt());
     }
     System.out.println("Enter for b");;
 for(int i=0;i<n;i++) {
	 b.add(scn.nextInt());
 }
 System.out.println(beautifulPairs(a,b));
 scn.close();
	}

}
