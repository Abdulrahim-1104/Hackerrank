package Hackerrank;
import java.util.*;
public class stick {
    public static int min(List<Integer> ar){
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<ar.size();i++){
            if(ar.get(i)<mini && ar.get(i)>0){
                mini=ar.get(i);
            }
        }
        return mini;
    }
  public static boolean isEmpty(List<Integer> ar){
        Collections.sort(ar);
        if(ar.get(ar.size()-1)==0){
            return true ; 
        }
        return false;
    }
    public static List<Integer> cutTheSticks(List<Integer> arr) {
    // Write your code here
     List<Integer> result= new ArrayList<>();
     int count=0;
     while(!isEmpty(arr)){
         count=0;
         int mini=min(arr);
         for(int i=0;i<arr.size();i++){
             if(arr.get(i)!=0){   
                 int val=arr.get(i)-mini;
                 arr.remove(i);
                 arr.add(i, val);  
                 count++;
             }
         }
         result.add(count);
     }
     return result;
    }
   public static void main(String args[]) {
	   List<Integer> list = new ArrayList<>();
	   list.add(5);
	   list.add(4);
	   list.add(4);
	   list.add(2);
	   list.add(2);
	   list.add(8);
	   System.out.println(cutTheSticks(list));
   }
}
