package assignment4;

import java.util.Scanner;

public class arraywaveprint {
	 public static void main(String args[]) {
	        Scanner scn = new Scanner(System.in);
	        int M = scn.nextInt();
	        int N = scn.nextInt();
	        int[][] arr = new int[M][N];
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr[i].length; j++) {
	                arr[i][j] = scn.nextInt();
	            }
	        }
	        wavedisplay(arr);
	    }
	    public static void wavedisplay(int[][] arr) {
	        for (int j = 0; j < arr[0].length; j++) {
	            if (j % 2 == 0) {
	                for (int i = 0; i < arr.length; i++) {
	                    System.out.print(arr[i][j] + ", ");
	                }
	            } else {
	                for (int i = arr.length - 1; i >= 0; i--) {
	                    System.out.print(arr[i][j] + ", ");
	                }
	            }
	        }
	        System.out.print("END");
	    }

}
