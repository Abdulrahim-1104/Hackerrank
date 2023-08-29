package Hackerrank;
import java.util.*;
import java.util.ArrayList;

public class queensAttack {
static int maxld=0,maxrd=0,maxlt=0,maxrt=0,maxhv=0;
	public static int leftdown(int qrow,int qcol,ArrayList<ArrayList<Integer>> obs,int n) {
		int row=qrow;
		int col=qcol;
		int leftdown=0;
		int ld=0;
		boolean bool=false;
	if(obs.size()>0) {
		for(int i=0;i<obs.size();i++) {
			row=qrow;
			col=qcol;
			bool=false;
			  int obsrow=obs.get(i).get(0);
			  int obscol=obs.get(i).get(1);
				
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
						 ld=(obscol-1)+1;
						 if(ld>maxld) { 
							 maxld=ld; 
						 } 
					 }
					}
					else {
						leftdown=qrow-1;
						if(bool==true) {
							ld=(obsrow-1)+1;
							if(ld>maxld) { 
								 maxld=ld; 
							 }
							
						}
					}

			  
		}     
	}
	else {
		while(true) {
			if(col==1||row==1){
			  break;
			}
			row--;
			col--; 
			}
			if(col==1) {
			 leftdown=qcol-1;
			}
			else {
				leftdown=qrow-1;
				}
	}
		return leftdown;
	}
	public static int rightdown(int qrow,int qcol,ArrayList<ArrayList<Integer>> obs,int n) {
		int rightdown=0;
		int row=qrow;
		int col=qcol;
		boolean bool=false;
		int rd=0;
	if(obs.size()>0) {
		for(int i=0;i<obs.size();i++) {
			row=qrow;
			col=qcol;
			bool=false;
			  int obsrow=obs.get(i).get(0);
			  int obscol=obs.get(i).get(1);
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
					 rd=(obsrow-1)+1; 
					 if(rd>maxrd) { 
						 maxrd=rd; 
					 }
					
				 }
				}
				else {
					rightdown=n-qcol;
					if(bool==true) {
						rd=n-obscol+1;
						if(rd>maxrd) { 
							 maxrd=rd; 
						 }
						
					}
				}
		}
	}
	else {
		while(true) {
			if(row==1||col==n){
			  break;
			}
			row--;
			col++; 
			}
			if(row==1) {
			 rightdown=qrow-1;
			}
			else {
				rightdown=n-qcol;
			}
	}
	return rightdown;
	}
	public static int lefttop(int qrow,int qcol,ArrayList<ArrayList<Integer>> obs,int n) {
		int row=qrow;
		int col=qcol;
		int lefttop=0;
		int lt=0;
		boolean bool=false;
		if(obs.size()>0) {
			for(int i=0;i<obs.size();i++) {
				row=qrow;
				col=qcol;
				bool=false;
				  int obsrow=obs.get(i).get(0);
				  int obscol=obs.get(i).get(1);
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
							lt=(obscol-1)+1;
							if(lt>maxlt) { 
								 maxlt=lt; 
							 }
							
							
						 }
						}
						else {
							lefttop=n-qrow;
							if(bool==true) {
								lt=n-obsrow+1;
								if(lt>maxlt) { 
									 maxlt=lt; 
								 }
							
							}
						}
			}
		}
		else {
			while(true) {
				if(col==1||row==n){
				  break;
				}
				row++;
				col--; 
				}
				if(col==1) {
				 lefttop=qcol-1;
				}
				else {
					lefttop=n-qrow;
				}
		}
		return lefttop;
	}
	public static int righttop(int qrow,int qcol,ArrayList<ArrayList<Integer>> obs,int n) {
		int row=qrow;
		int col=qcol;
		int righttop=0;
        int rt=0;
		int rrt=0;
	if(obs.size()>0) {
		for(int i=0;i<obs.size();i++) {
			boolean bool=false;
			row=qrow;
			col=qcol;
			  int obsrow=obs.get(i).get(0);
			  int obscol=obs.get(i).get(1);
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
						 rt=n-obscol+1; 
						 if(rt>maxrt) { 
							 maxrt=rt; 
						 }
				      rrt=maxrt;		 
					 }
					}
					else {
						righttop=n-qrow;
						if(bool==true) {
							rt=n-obsrow+1;
							 if(rt>maxrt) {
								 maxrt=rt;
							 }
						rrt=maxrt;
						}
		}
		}
	}
	else {
		while(true) {
			if(col==n||row==n){
			  break;
			}
			row++;
			col++; 
			}
			if(col==n) {
			 righttop=n-qcol;
			}
			else {
				righttop=n-qrow;
	}
	}
	return righttop;
	}
	public static int horver(int qrow,int qcol,ArrayList<ArrayList<Integer>> obs,int n) {
		 int horver=(n+n)-2;
		 int row=qrow;
		 int col=qcol;
		 int d=0,u=0,l=0,r=0;
		 int maxd=0,maxu=0,maxl=0,maxr=0;
		if(obs.size()>0) {
			for(int i=0;i<obs.size();i++) {
				row=qrow;
				col=qcol;
				  int obsrow=obs.get(i).get(0);
				  int obscol=obs.get(i).get(1);
				 if(col==obscol) {  
					 if(obsrow<row){ //down    
		             d=(obsrow-1)+1;
		             if(d>maxd) {
		            	 maxd=d;
		             }
					 }
					 if(obsrow>row) { //up 
						 u=(n-obsrow)+1;
						 if(u>maxu) {
							 maxu=u;
						 }
					 }
						 }
				 if(row==obsrow) {
					 if(obscol<col) { //left
						l=(obscol-1)+1;
						if(l>maxl) {
							maxl=l;
						}
					
					 }
					 if(obscol>col) {   //right
						 r=(n-obscol)+1;
						 if(r>maxr) {
							 maxr=r;
						 }
					 }
				 }
			}
			maxhv=maxu+maxd+maxl+maxr;
		}
		return horver;
	}
	public static int queenattacks(int n,int k,int qrow,int qcol,ArrayList<ArrayList<Integer>> obstacles ) {		int leftDown=0,rightDown=0,leftTop=0,rightTop=0,horVer=0; 
		  leftDown=leftdown(qrow,qcol,obstacles,n)-maxld;
		  rightDown=rightdown(qrow,qcol,obstacles,n)-maxrd;
		  leftTop=lefttop(qrow,qcol,obstacles,n)-maxlt;
		  rightTop=righttop(qrow,qcol,obstacles,n)-maxrt;
		  horVer=horver(qrow,qcol,obstacles,n)-maxhv; 
		  return leftDown+rightDown+leftTop+rightTop+horVer; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		ArrayList<ArrayList<Integer>> obs=new ArrayList <ArrayList<Integer>>(); 
		int k=100000;
		int n=100000;
		int qrow=6453 ;
		int qcol=3654;
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
