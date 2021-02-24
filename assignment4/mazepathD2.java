package assignment4;

import java.util.Scanner;

public class mazepathD2 {
	public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        mazepathprintD(1, 1, n1, n1, "");
        System.out.println();
        System.out.print(mazepathcountD(1, 1, n1, n1, ""));
    }
    public static void mazepathprintD(int cr, int cc, int er, int ec, String ans) {
        if (cr == er && cc == ec) {
            System.out.print(ans + " ");
            return;
        }
        if (cr <= er && cc <= ec) {
            mazepathprintD(cr + 1, cc, er, ec, ans + "V");
            mazepathprintD(cr, cc + 1, er, ec, ans + "H");
            if (cr == cc || cr + cc == ec + 1)
                mazepathprintD(cr + 1, cc + 1, er, ec, ans + "D");
        }
    }
    public static int mazepathcountD(int cr, int cc, int er, int ec, String ans) {
        int ch = 0, cv = 0, cd = 0;
        if (cr == er && cc == ec) {
            return 1;
        }
        if (cr > er && cc > ec)
            return 0;
        if (cr <= er && cc <= ec) {
            ch = mazepathcountD(cr, cc + 1, er, ec, ans + "H");
            cv = mazepathcountD(cr + 1, cc, er, ec, ans + "V");
            if (cr == cc || cr+cc == ec+1)
                cd = mazepathcountD(cr + 1, cc + 1, er, ec, ans + "D");
        }
        return ch + cv + cd;
    }
}
