package assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c[] = str.toCharArray();
        Arrays.sort(c);
        String s = new String(c);
        permutation(s, "", str);
    }
    public static void permutation(String q, String ans, String os) {
        if (q.length() == 0) {
            if (ans.compareTo(os) > 0)
                System.out.println(ans);
            return;
        }
        for (int i = 0; i < q.length(); i++) {
            char ch = q.charAt(i);
            String roq = q.substring(0, i) + q.substring(i + 1);
            permutation(roq, ans + ch, os);
        }
    }
}