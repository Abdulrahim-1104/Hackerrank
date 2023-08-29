package Hackerrank;
import java.util.ArrayList;
import java.util.Scanner;

public class finished {
	public static int left(int n,int qrow ,int qcol,ArrayList<ArrayList<Integer>> obstacles) {
	int left=0;
	int col=qcol;
	boolean bool=false;
		while(true) {
		if(col==1) {
			break;
		}
		if(obstaclesExits(qrow,col,obstacles)) {
			bool=true;
			break;
		}
		left++;
		col--;
	}
		if(bool) {
			left=left-1;
		}
		return left;
	}
	public static int right(int n,int qrow ,int qcol,ArrayList<ArrayList<Integer>> obstacles) {
	int right=0;
	int col=qcol;
	boolean bool=false;
		while(true) {
		if(col==n) {
			break;
		}
		if(obstaclesExits(qrow,col,obstacles)) {
			bool=true;
			break;
		}
		right++;
		col++;
	}
		if(bool) {
			right=right-1;
		}
		return right;
	}
	public static int top(int n,int qrow ,int qcol,ArrayList<ArrayList<Integer>> obstacles) {
	int top=0;
	int row=qrow;
	boolean bool=true;
		while(true) {
		if(row==n) {
			break;
		}
		if(obstaclesExits(row,qcol,obstacles)) {
			bool=true;
			break;
		}
		top++;
		row++;
	}
		if(bool) {
			top=top-1;
		}
		return top;
	}
	public static int bottom(int n,int qrow ,int qcol,ArrayList<ArrayList<Integer>> obstacles) {
	int bottom=0;
	int row=qrow;
	boolean bool=false;
		while(true) {
		if(row==1) {
			break;
		}
		if(obstaclesExits(row,qcol,obstacles)) {
			bool=true;
			break;
		}
		bottom++;
		row--;
		
	}
		if(bool) {
			bottom-=1;
		}
		return bottom;
	}
	public static int leftdown(int n,int qrow,int qcol,ArrayList<ArrayList<Integer>> obstacles) {
		int leftdown=0;
		int row=qrow;
		int col=qcol;
		boolean bool=false;
		while(true) {
			if(row==1||col==1) {
				break;
			}
			if(obstaclesExits(row,col,obstacles)) {
				bool=true;
				break;
			}
			row--;
			col--;
			leftdown++;
		
		}
		if(bool) {
			leftdown-=1;
		}
		return leftdown;
	}
	public static int rightdown(int n,int qrow,int qcol,ArrayList<ArrayList<Integer>> obstacles) {
		int rightdown=0;
		int row=qrow;
		int col=qcol;
		boolean bool=false;
		while(true) {
			if(row==1||col==n) {
				break;
			}
			if(obstaclesExits(row,col,obstacles)) {
				bool=true;
				break;
			}
			row--;
			col++;
			rightdown++;
		
		}
		if(bool) {
			rightdown-=1;
		}
		return rightdown;
	}
	public static int lefttop(int n,int qrow,int qcol,ArrayList<ArrayList<Integer>> obstacles) {
		int lefttop=0;
		boolean bool=false;
		int row=qrow;
		int col=qcol;
		while(true) {
			if(row==n||col==1) {
				break;
			}
			if(obstaclesExits(row,col,obstacles)) {
				bool=true;
				break;
			}
			row++;
			col--;
			lefttop++;
		
		}
		if(bool) {
			lefttop-=1;
		}
		return lefttop;
	}
	public static int righttop(int n,int qrow,int qcol,ArrayList<ArrayList<Integer>> obstacles) {
		int righttop=0;
		int row=qrow;
		int col=qcol;
		boolean bool=false;
		while(true) {
			if(row==n||col==n) {
				break;
			}
			if(obstaclesExits(row,col,obstacles)) {
				bool=true;
				break;
			}
			row++;
			col++;
			righttop++;
			
		}
		if(bool) {
			righttop-=1;
		}
		return righttop;
	}
	 public static boolean obstaclesExits(int qrow,int qcol,ArrayList<ArrayList<Integer>> obstacles) {
         for(int i=0;i<obstacles.size();i++) {
      	 if(obstacles.get(i).get(0)==qrow&&obstacles.get(i).get(1)==qcol) {
      		 return true;
      	 }       	   
         }
         return false;
	}
	public static int queenattacks(int n,int k,int qrow,int qcol,ArrayList<ArrayList<Integer>> obstacles ) {
		int queenAttack=0;
		//horizondal and vetical
		queenAttack+=left(n,qrow,qcol,obstacles);
		queenAttack+=right(n,qrow,qcol,obstacles);
		queenAttack+=top(n,qrow,qcol,obstacles);
		queenAttack+=bottom(n,qrow,qcol,obstacles);
		//Diagonals
		queenAttack+=lefttop(n,qrow,qcol,obstacles);
		queenAttack+=righttop(n,qrow,qcol,obstacles);
		queenAttack+=leftdown(n,qrow,qcol,obstacles);
		queenAttack+=rightdown(n,qrow,qcol,obstacles);
		return queenAttack;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner scn=new Scanner(System.in);
		ArrayList<ArrayList<Integer>> obs=new ArrayList <ArrayList<Integer>>(); 
		int k=100000;
		int n=100000;
		int qrow=4564;
		int qcol=3988;
		for(int i=0;i<k;i++) {
			obs.add(new ArrayList<Integer>());
		}
	
	System.out.println("Enter a numbers");
for(int i=0;i<obs.size();i++) {
	obs.get(i).add(0,scn.nextInt());
	obs.get(i).add(1,scn.nextInt());
}
scn.close();

	System.out.println(obs);
	System.out.println(queenattacks(n,k,qrow,qcol,obs));

       
	}

}
