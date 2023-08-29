package Hackerrank;
import java.util.*;
public class gridChallenge {
	public static List<String> gcc(List<String> grid){
		List<String> newGrid=new ArrayList<>();
		for(int i=0;i<grid.size();i++) {
			char temp[]=grid.get(i).toCharArray();
			Arrays.sort(temp);
			String s=new String(temp);
			newGrid.add(s);
		}
		return newGrid;
	}
public static String gc(List<String> grid) {
	//Collections.sort(grid);
      grid=gcc(grid);
	int n=grid.get(1).length();
	for(int i=0;i<n;i++) {
		for(int j=1;j<grid.size();j++) { 
			char V1=grid.get(0).charAt(i); 
			char V2=grid.get(j).charAt(i); 
			int v1=grid.get(0).charAt(i);
			int v2=grid.get(j).charAt(i);
			if(v1>v2) { 
				return "NO";
			}
		}
	}
return "YES";
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
        List<String> grid=new ArrayList<>();
        for(int i=0;i<1;i++) {
	    	 grid.add(scn.nextLine());
	     }
        System.out.println(gc(grid));
        scn.close();
        
	}

}
