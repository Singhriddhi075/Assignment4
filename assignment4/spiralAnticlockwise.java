package assignment4;

import java.util.Scanner;

public class spiralAnticlockwise {
	static Scanner scn = new Scanner(System.in);
    public static void main(String args[]) {
        // TODO Auto-generated method stub
        int[][] arr = takeinput();
        int mincol = 0;
        int minrow = 0;
        int maxcol = arr[0].length - 1;
        int maxrow = arr.length - 1;
        int count = 0;
        int nel = arr.length * arr[0].length;
        while (count < nel) {
            for (int c = mincol; c <= maxcol && count < nel; c++) {
                System.out.print(arr[minrow][c] + ", ");
                count++;
            }
            minrow++;
            for (int r = minrow; r <= maxrow && count < nel; r++) {
                System.out.print(arr[r][maxcol] + ", ");
                count++;
            }
            maxcol--;
            for (int c = maxcol; c >= mincol && count < nel; c--) {
                System.out.print(arr[maxrow][c] + ", ");
                count++;
            }
            maxrow--;
            for (int r = maxrow; r >= minrow && count < nel; r--) {
                System.out.print(arr[r][mincol] + ", ");
                count++;
            }
            mincol++;
        }
        System.out.print("END");
    }
    public static int[][] takeinput() {
        int row = scn.nextInt();
        int col = scn.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        return arr;
    }
}
