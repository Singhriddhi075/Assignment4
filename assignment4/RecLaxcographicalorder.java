package assignment4;

import java.util.Scanner;

public class RecLaxcographicalorder {
	 public static void main(String args[]) {
	        // Your Code Here
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        System.out.print("0 ");                   //Print 0
	        int i = 1;
	        //while(i < n)
	        while (i <= n && i <= 9) {
	            lexiographicalordercount(n, i);
	            i++;
	        }
	    }
	 public static void lexiographicalordercount(int n, int curr) {
	        // base case
	        if (curr > n) {
	            return;
	        }
	        System.out.print(curr + " ");
	        // recursion call
	        int i = 0;
	        while (i <= 9) {
	            lexiographicalordercount(n, curr * 10 + i);
	            i++;
	        }
	    }

}
