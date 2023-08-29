package Hackerrank;
import java.util.*;
public class equlalizeArray {

    public static int equalizeArray(List<Integer> arr) {
    // Write your code here
    int min=Integer.MAX_VALUE;
    int minimalDeletion=0;
    for(int i=0;i<arr.size();i++){
        minimalDeletion=Integer.MAX_VALUE;
        for(int j=0;j<arr.size();j++){
                if(arr.get(i)!=arr.get(j)){
                	if(minimalDeletion==Integer.MAX_VALUE) {
                		minimalDeletion=0;
                	} 
                    minimalDeletion++;
                } 
                if(arr.get(i)==arr.get(j)){
                    if(i>j){ 
                        break;
                    } 
                }
            
        }
        if(minimalDeletion<min){
            min=minimalDeletion;
        }
    }
    return min;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 List<Integer> list = new ArrayList<>();
 list.add(1);
 list.add(2);
 list.add(3);
 list.add(1);
 list.add(2);
 list.add(3);
 list.add(3);
 list.add(3);
 System.out.println(equalizeArray(list));
	}

}
