package assignment4;

import java.util.Scanner;

public class quadraticequation {

	public static void main(String args[]) {
	      Scanner scn=new Scanner(System.in);
	      int a=scn.nextInt();
	      int b=scn.nextInt();
	      int c=scn.nextInt();
	      double d=(b*b)-(4*a*c);
	      int r=0;
	      int s=0;
	      if(d>0){
	          System.out.println("Real and Distinct");
	          r=(-b+(int)Math.sqrt(d))/2*a;
	          s=(-b-(int)Math.sqrt(d))/2*a;
	          System.out.print(s+" "+r);
	      }
	       if(d==0){
	           System.out.println("Real and Equal");
	           r=-b/(2*a);
	           System.out.print(r+" "+r);
	       }
	      if(d<0){
	          System.out.println("Imaginary");
	      }
	    }

}
