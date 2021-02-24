package assignment4;

import java.util.Scanner;

public class chewbaccaandnumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
        long x=scn.nextLong();
        long q=0l;
        long m=10l;
        int i=0;
        long sum=0l;
        long temp=x;
        while(temp>0) {
            temp=temp/10;
            i++;
        }
        int node=0;
        while(node<i)
        {
            long rem=x%10;
            if(9-rem==0 && x/10==0)
            {
            }
            else if(rem>=5)
            {
                rem=9-rem;
            }
            q=rem*(long)Math.pow(m, node);
            x=x/10;
            sum=sum+q;
            node++;
        }
        System.out.println(sum);

	}

}
