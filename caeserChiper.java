package Hackerrank;

public class caeserChiper {
	  public static String caesarCipher(String s,int k) {
		    // Write your code here
		  if(k==26) {
			  k=0;
		  } 
		  if(k>26){
			  k=k%26;
		  }
		           String string="";  
		           for(int i=0;i<s.length();i++){
		        	   int c=s.charAt(i);
		        	   if(c>=32&&c<=64||c>91&&c<=96||c>=123&&c<=127){
		        		   string+=s.charAt(i);
		        	   } 
		               else{ 
		                   int n=s.charAt(i)+k;
		                   if((n-k)>=97&&(n-k)<=122) {
		                	   if(n>122){
			                       n=(n-123)+97;
			                   }
		                   }
		                   else if((n-k)>=65&&(n-k)<=90) {
		                	  if(n>90) {
			                	   n=(n-91)+65;
			                   }
		                  }
		                string=string+(char)n;
		               }
		           }
		           return string;
		    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   String str="DNFjxo?b5h*5<LWbgs6?V5{3M].1hG)pv1VWq4(!][DZ3G)riSJ.CmUj9]7Gzl?VyeJ2dIPEW4GYW*scT8(vhu9wCr]q!7eyaoy.";
	   System.out.println(caesarCipher(str,45));
	   System.out.println("WGYcqh?u5a*5<EPuzl6?O5{3F].1aZ)io1OPj4(!][WS3Z)kbLC.VfNc9]7Zse?OrxC2wBIXP4ZRP*lvM8(oan9pVk]j!7xrthr.");
	   System.out.println(45%26);
	   System.out.println(0>0);
	}
}
