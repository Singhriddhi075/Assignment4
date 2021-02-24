package assignment4;

import java.util.Scanner;

public class replacethemall {

	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
	        long temp = scn.nextLong();
	        long ans = 0l;
	        long n1 = 0l;
	        int pos = 0;
	        if (temp == 0l)
	            System.out.println("5");
	        else {
	            while (temp != 0l) {
	                n1 = temp % 10l;
	                if (n1 == 0l) {
	                    n1 = 5l;
	                }
	                ans += n1 * (long) Math.pow(10, pos);
	                pos++;
	                temp = temp / 10l;
	            }
	            System.out.println(ans);
	        }

	}

}
