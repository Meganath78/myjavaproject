package mega;
import java.util.*;
import java.lang.Math;
public class Fibo_prime {
   public static void main(String args[]) {
	   Scanner sc= new Scanner(System.in);
	   int num=sc.nextInt();
	   int n=0;
       int n1=1;
    	int sum=1;
     	for(int i=1;i<=num;i++) {
   		 int n2=n+n1;
   		 n=n1;
   		  n1=n2;
   		  System.out.print(n+" ");
   		  if(prime(n)==true) {
   			  System.out.print(n);
   		  }
     	}
   }
   public static boolean prime(int num) {
	   if (num==1) {
		   return true;
	   }
	   for(int i=2;i<=Math.sqrt(num);i++) {
		   if(num%i==0) {
			   return false;
		   }
	   }
	   return true;
   }
}
