package Hackerrank;
import java.util.*;
public class queenAttacks {
	 static int nocells=0;
	static ArrayList<Integer> sum=new ArrayList<>();
	public static int leftdown(int qrow,int qcol,int obsrow,int obscol,int n) {
		int row=qrow;
		int col=qcol;
		int leftdown=0;
		boolean bool=false;
		while(true) {
			if(col==1||row==1){
			  break;
			}
			row--;
			col--; 
			if(obsrow==row&&obscol==col) {
				bool=true;
			}
			}
			if(col==1) {
			 leftdown=qcol-1;
			 if(bool==true) { 
				 nocells=(obscol-1)+1;
				 sum.add(nocells);
			 }
			}
			else {
				leftdown=qrow-1;
				if(bool==true) {
					nocells=(obsrow-1)+1;
					sum.add(nocells);
				}
			}
			return leftdown;
	}
	public static int rightdown(int qrow,int qcol,int obsrow, int obscol,int n) {
		int rightdown=0;
		int row=qrow;
		int col=qcol;
		boolean bool=false;
		while(true) {
			if(row==1||col==n){
			  break;
			}
			row--;
			col++; 
			if(obsrow==row&&obscol==col) {
				bool=true;
			}
			}
			if(row==1) {
			 rightdown=qrow-1;
			 if(bool==true) {
				 nocells=(obsrow-1)+1;
				 sum.add(nocells);
			 }
			}
			else {
				rightdown=n-qcol;
				if(bool==true) {
					nocells=n-obscol+1;
					sum.add(nocells);
				}
			}
			return rightdown;
	}
	public static int lefttop(int qrow,int qcol,int obsrow, int obscol,int n) {
		int row=qrow;
		int col=qcol;
		int lefttop=0;
		boolean bool=false;
		while(true) {
			if(col==1||row==n){
			  break;
			}
			row++;
			col--; 
			if(obsrow==row&&obscol==col) {
				bool=true;
			}
			}
			if(col==1) {
			 lefttop=qcol-1;
			 if(bool==true) {
				 nocells=(obscol-1)+1;
				 sum.add(nocells);
			 }
			}
			else {
				lefttop=n-qrow;
				if(bool==true) {
					nocells=n-obsrow+1;
					sum.add(nocells);
				}
			}
			return lefttop;
	}
	public static int righttop(int qrow,int qcol,int obsrow,int obscol,int n) {
		int row=qrow;
		int col=qcol;
		int righttop=0;
		boolean bool=false;
		while(true) {
			if(col==n||row==n){
			  break;
			}
			row++;
			col++; 
			if(obsrow==row&&obscol==col) {
				bool=true;
			}
			}
			if(col==n) {
			 righttop=n-qcol;
			 if(bool==true) {
				 nocells=n-obscol+1;
				 sum.add(nocells);
			 }
			}
			else {
				righttop=n-qrow;
				if(bool==true) {
					nocells=n-obsrow+1;
					sum.add(nocells);
				}
			}
			return righttop;
	}
	public static int horver(int qrow,int qcol,int obsrow,int obscol,int n) {
		 int horver=(n+n)-2;
		 int row=qrow;
		 int col=qcol;
		 if(col==obscol) { 
			 if(obsrow<row){ //down       
				  nocells=(obsrow-1)+1;
				  sum.add(nocells);
			 }
			 if(obsrow>row) { //up 
				 nocells=(n-obsrow)+1;
				 sum.add(nocells);
			 }
				 }
		 if(row==obsrow) {
			 if(obscol<col) { //left
				 nocells=(obscol-1)+1;
				 sum.add(nocells);
			 }
			 if(obscol>col) {
				 nocells=(n-obscol)+1;
				 sum.add(nocells);
			 }
		 }
		 return horver;
	}
	 public static boolean obstaclesExits(int qrow,int qcol,ArrayList<ArrayList<Integer>> obstacles) {
  for(int i=0;i<obstacles.size();i++) {
	if(  obstacles.get(i).contains(qrow)&&obstacles.get(i).contains(qcol)) {
		return true;
	}
  }
           return false;
	}
public static int queenattacks(int n,int k,int qrow,int qcol,ArrayList<ArrayList<Integer>> obstacles ) {
int leftDown=0,rightDown=0,leftTop=0,rightTop=0,horVer=0; 

if(obstacles.size()>0) {
	 for(int i=0;i<obstacles.size();i++) {    
		  int row=obstacles.get(i).get(0);
		  int col=obstacles.get(i).get(1); 
		  leftDown=leftdown(qrow,qcol,row,col,n);
		  rightDown=rightdown(qrow,qcol,row,col,n);
		  leftTop=lefttop(qrow,qcol,row,col,n);
		  rightTop=righttop(qrow,qcol,row,col,n);
		  horVer=horver(qrow,qcol,row,col,n);  
	    }
 }
 else {
	  leftDown=leftdown(qrow,qcol,0,0,n);
	  rightDown=rightdown(qrow,qcol,0,0,n);
	  leftTop=lefttop(qrow,qcol,0,0,n);
	  rightTop=righttop(qrow,qcol,0,0,n); 
	  horVer=horver(qrow,qcol,0,0,n);
 }
  int diagonals=leftDown+rightDown+leftTop+rightTop+horVer;
  int con=sum.stream().mapToInt(i -> i).sum();
  return diagonals-con;  

}
	public static void main(String[] args) {
	ArrayList<ArrayList<Integer>> obs=new ArrayList <ArrayList<Integer>>(); 
	int k=3;
	int n=5;
	int qrow=4;
	int qcol=3;
 for(int i=0;i<k;i++) {
	 obs.add(new ArrayList<Integer>());
 }
 obs.get(0).add(0,5);
 obs.get(0).add(1,5);
 obs.get(1).add(0,4);
 obs.get(1).add(1,2);
 obs.get(2).add(0,2);
 obs.get(2).add(1,3);
System.out.println(obstaclesExits(2,2,obs));  
System.out.println(obs);
System.out.println(queenattacks(n,k,qrow,qcol,obs));
	}

}
