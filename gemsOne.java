package Hackerrank;
import java.util.*;
public class gemsOne {
public static int go(List<String> arr) {
    int min=Integer.MAX_VALUE; 
    int ind=0;
    for(int i=0;i<arr.size();i++){ 
        if(arr.get(i).length()<min){
            min=arr.get(i).length();
            ind=i;
        }
    }
    int count=0;
    for(int i=0;i<arr.get(ind).length();i++){ 
        boolean bool=true;
        for(int j=0;j<arr.size();j++){
            if(!arr.get(j).contains(String.valueOf(arr.get(ind).charAt(i)))){
                bool=false;
                break;
            }
        }
        if(bool){
            count++;
        }
    }
    return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scn=new Scanner(System.in);
//     List<String> arr=new ArrayList<>();
//     for(int i=0;i<100;i++) {
//    	 arr.add(scn.nextLine());
//     }   
//     System.out.println(go(arr));
     boolean b="a".contains(String.valueOf((char)97));
     System.out.println(b);
     //scn.close();
	}

}
