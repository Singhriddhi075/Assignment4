package assignment4;

import java.util.Scanner;

public class Spiralprintclockwise {
	 public static void main(String args[]) {
	        Scanner scn = new Scanner(System.in);
	        int m = scn.nextInt();
	        int n = scn.nextInt();
	        int[][] arr = new int[m][n];
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr[i].length; j++) {
	                arr[i][j] = scn.nextInt();
	            }
	        }
	        spiraldisplay(arr);
	    }
	    public static void spiraldisplay(int[][] arr) {
	        int minRow = 0;
	        int maxRow = arr.length - 1;
	        int minCol = 0;
	        int maxCol = arr[0].length - 1;
	        int nel = arr.length * arr[0].length;
	        int count = 0;
	        while (count < nel) {
	            for (int c = minCol; c <= maxCol && count < nel; c++) {
	                System.out.print(arr[minRow][c] + ", ");
	                count++;
	            }
	            minRow++;
	            for (int r = minRow; r <= maxRow && count < nel; r++) {
	                System.out.print(arr[r][maxCol] + ", ");
	                count++;
	            }
	            maxCol--;
	            for (int c = maxCol; c >= minCol && count < nel; c--) {
	                System.out.print(arr[maxRow][c] + ", ");
	                count++;
	            }
	            maxRow--;
	            for (int r = maxRow; r >= minRow && count < nel; r--) {
	                System.out.print(arr[r][minCol] + ", ");
	                count++;
	            }
	            minCol++;
	        }
	        System.out.print("END");
	    }

}
