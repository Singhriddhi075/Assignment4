package assignment4;

import java.util.Scanner;

public class Boardpathcountandprint {
	public static int count = 0;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();// size of board
        int m = scn.nextInt();// dice faces
        int cur = 0;
        int q = boardpath(cur, n, m, "");
        System.out.println();
        System.out.println(q);
    }
    public static int boardpath(int cur, int n, int m, String ans) {
        if (cur == n) {
            System.out.print(ans + " ");
            return 1;
        }
        if (cur > n) {
            return 0;
        }
        int count = 0;
        for (int dice = 1; dice <= m; dice++) {
            count = count + boardpath(cur + dice, n, m, ans + dice);
        }
        return count;
    }
}
