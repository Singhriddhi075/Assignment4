package assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class minimummoneyneeded {
static int inf=1000000009;
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int w=sc.nextInt();
n=w;//there is actually no use of n the the size need to be w as specied in the question
int val[]=new int[n];
for(int i=0;i<n;i++)
val[i]=sc.nextInt();

   int dp[][]=new int[n+1][w+1];
   for(int i[] : dp)
   Arrays.fill(i,-1);
  int ans=Solve(val,n,w,dp);
  System.out.println(ans==inf?-1: ans);
}
public static int Solve(int val[],int n,int w,int dp[][])
{
	if(w==0)
	return 0;

    if(n==0)
	return inf;

	if(dp[n][w]!=-1)
		return dp[n][w];

	   if(w>=n && val[n-1]!=-1)
	   { 
		   int ans=Solve(val,n,w-n,dp);
		   if(ans!=inf)
		   ans+=val[n-1];
		  return  dp[n][w]=Math.min(ans,Solve(val,n-1,w,dp));
	   }  
	   else
	   return dp[n][w]=Solve(val,n-1,w,dp);

	}
	}