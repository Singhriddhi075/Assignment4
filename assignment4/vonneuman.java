package assignment4;

import java.util.Scanner;

public class vonneuman {
	 public static void main(String args[]) {
		 Scanner scn=new Scanner(System.in);
		 int n=scn.nextInt();
		 int n1=scn.nextInt();
		 
		 System.out.println(binaryToDecimal(n1));
		 
	 }
	 public static int binaryToDecimal(int n){
		    int num = n; 
		    int dec_value = 0; 

		    // Initializing base  
		    // value to 1, i.e 2^0 
		    int base = 1; 

		    int temp = num; 
		    while (temp > 0) 
		    { 
		        int last_digit = temp % 10;  // Extract rightmost digit 
		        temp = temp / 10;               // Update the number

		        dec_value += last_digit * base;  // Add the digit to the answer

		        base = base * 2;               //Update the power of 2 
		    } 

		    return dec_value;                 // Return ans
		}

}
