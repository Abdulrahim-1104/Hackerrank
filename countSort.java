package Hackerrank;
import java.util.*;
public class countSort {
public static List<Integer> cs1(List<Integer>arr){
    int max=Collections.max(arr);
    Integer result[] = new Integer[arr.size()];
    for(int j=0;j<arr.size();j++){ 
        result[j]=0; 
    }
    for(int i=0;i<arr.size();i++){
     result[arr.get(i)]+=1;
    } 
    List<Integer> list= Arrays.asList(result);
    return list;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		List<Integer> list =new ArrayList<>();
		System.out.println("Enter the elements");
		for(int i=0;i<100;i++) {
			list.add(scn.nextInt());
		}
        System.out.println(cs1(list));
        System.out.println(Collections.max(list));
        scn.close();
	}

}
