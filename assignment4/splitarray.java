package assignment4;

import java.util.Scanner;

public class splitarray {
	public static void main(String args[]) {
	     Scanner scn=new Scanner(System.in);
	       int size=scn.nextInt();
	       int[]a=new int[size];
	       int idx=0;
	       int ssf1=0;
	       int ssf2=0;
	       for(int i=0;i<size;i++)
	       {
	           a[i]=scn.nextInt();
	       }
	     int count=Split_array(a,idx,ssf1,ssf2,"","");
	     System.out.println(count);
	    }
	     public static int Split_array(int[]a,int idx,int ssf1,int ssf2,String ans1,String ans2)
	   {
	       if(idx==a.length)
	       {
	           if(ssf1==ssf2)
	       {
	           System.out.println(ans1+" and "+ans2);
	           return 1;
	       }
	           return 0;
	       }
	       
	       int cnt=0;
	       cnt=cnt+Split_array(a,idx+1,ssf1+a[idx],ssf2,ans1+" "+a[idx],ans2);
	       cnt=cnt+Split_array(a,idx+1,ssf1,ssf2+a[idx],ans1,ans2+" "+a[idx]);
	       return cnt;
	   }


}
