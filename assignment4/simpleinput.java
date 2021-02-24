package assignment4;

import java.util.Scanner;

public class simpleinput {

	public static void main(String[] args) {
	
	       
		Scanner scn = new Scanner(System.in);
        int sum = 0;
        while(true)
        {
            int n = scn.nextInt();
            sum +=n;
            if(sum>=0) {
            	System.out.println();
                System.out.print(n);
            }
            else
                break;
        }
	       

	}

}
