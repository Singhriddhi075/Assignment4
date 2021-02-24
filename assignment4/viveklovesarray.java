package assignment4;

import java.util.Scanner;

public class viveklovesarray {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t > 0) {
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }
            System.out.println();
            System.out.print(ArrayGame(arr, 0, n - 1));
            t--;
        }
    }
    public static int ArrayGame(int[] arr, int lo, int hi) {
        for (int split = lo; split <= hi - 1; split++) {
            int sum1 = 0;
            for (int i = lo; i <= split; i++) {
                sum1 += arr[i];
            }
            int sum2 = 0;
            for (int j = split + 1; j <= hi; j++) {
                sum2 += arr[j];
            }
            if((sum1 + sum2) % 2 != 0){
                return 0;
            }
            if (sum1 == sum2) {
                int lr = ArrayGame(arr, lo, split);
                int rr = ArrayGame(arr, split + 1, hi);
                return Math.max(lr, rr) + 1;
            }
        }
        return 0;
    }
}