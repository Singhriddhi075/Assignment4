package assignment4;

import java.util.Scanner;

public class mazepathD {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int er = scn.nextInt();// for rows
        int ec = scn.nextInt();// for columns
        int count = mazepath(1, 1, ec, er, "");
        System.out.println();
        System.out.print(count);
    }
    public static int mazepath(int cc, int cr, int ec, int er, String ans) {
        if (cc == ec && cr == er) {
            System.out.print(ans + " ");
            return 1;
        }
        if (cc > ec || cr > er) {
            return 0;
        }
        int cnt = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        cnt1 = cnt1 + mazepath(cc, cr + 1, ec, er, ans + 'V');
        cnt = cnt + mazepath(cc + 1, cr, ec, er, ans + 'H');
        cnt2 = cnt2 + mazepath(cc + 1, cr + 1, ec, er, ans + 'D');
        return (cnt + cnt1 + cnt2);
    }
}
