package assignment4;

import java.util.Scanner;

public class calculatethesum {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        
        int[] arr = takeinput(); 
        
        
        int x = scn.nextInt(); //no of queries
        int m = 1_000_000_000 + 7; //to be used as given
        
        while (x > 0) 
        {
            int k = scn.nextInt(); //x no of times different queries leni hai user se. 
            int[] sum = new int[arr.length]; //new array will started off fresh
            
            for (int i = 0; i < sum.length; i++)
            {
                if (i-k < 0) //It is not just at i==0 that you will face a problem but also for indices where i-k will become < 0
                {
                    int y=k-i-1; //itne left side se elements will be used up
                    sum[i] = (arr[i] + arr[arr.length-y-1])%m; //now peeche se bache hue (new k) elements add karoge
                } 
                else 
                {
                    sum[i] = (arr[i] + arr[i - k])%m;
                }
                
            }
            
            arr=sum; //now the array you will consider for the next query is sum and not arr. So i changed the reference here
            
            x--;
        }
        
        int temp=0;
        for(int val:arr)
            temp+=val;
        
        System.out.println(temp%m);
        
    }
    public static int[] takeinput() {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        return arr;
    }
}

