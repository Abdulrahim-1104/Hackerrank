package Hackerrank;
import java.util.*;
public class largestPermutation {
public static List<Integer> lp(int k,List<Integer> arr){
	   boolean bool=false;
	      for(int i=0;i<k;i++){
	          int max=i;
	          bool=false;
	          for(int j=i;j<arr.size();j++){
	              if(arr.get(j)>arr.get(max)){
	                  max=j;
	                  bool=true;
	              }
	          }
	          if(bool){
	              int temp=arr.get(max);
	              arr.add(max,arr.get(i));
	              arr.remove(max+1);
	              arr.add(i,temp);
	              arr.remove(i+1);
	          }
	      }
	return arr;
}
public static List<Integer> lpp(int k,List<Integer> arr){
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
int max=Integer.MIN_VALUE;
for(int i=0;i<arr.size();i++) {
	if(arr.get(i)>max) {
		max=arr.get(i);
	}
	map.put(arr.get(i),i);
}
int temp=0;
for(int i=0;i<k;i++) {
	if(i==arr.size()-1) {
		break;
	}
    if (arr.get(i) == max) {
        k++;
        max = max - 1;
        continue;
    } else {
    	temp=arr.get(i);
    	arr.add(i,max);
    	arr.remove(i+1);
        arr.add(map.get(max),temp);
        arr.remove(map.get(max)+1); 
        map.replace(temp, map.get(max));
        map.replace(max,i);
        max = max - 1;
    }
}
return arr;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner snc= new Scanner(System.in);
     List<Integer> arr= new ArrayList<Integer>();
     for(int i=0;i<5;i++) {
    	 arr.add(snc.nextInt());
     }
     System.out.println(arr);
     System.out.println(lpp(5,arr));
	}

}
