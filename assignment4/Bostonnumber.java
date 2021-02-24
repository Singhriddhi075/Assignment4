package assignment4;

import java.util.Scanner;

public class Bostonnumber {
	static int prime(int N) {
		int i, flag = 0;
		for (i = 2; i <= (int) Math.floor(Math.sqrt(N)); i++) {
			if (N % i == 0) {
				flag = 1;
				break;
			}
		}
		return flag;
	}
	public static void main(String args[]) {
		int N, M, i, rem, sumd = 0, sump = 0;
		Scanner scn = new Scanner(System.in);
		N = scn.nextInt();
		sumd=sumd(N);
		M=N;
		
		for (i = 2; M != 1; i++) {
			if (prime(i) == 0) {
				while (M % i == 0) {
					sump += sumd(i);
					M /= i;
				}
			}
		}
		if (sumd == sump)
			System.out.println(1);
		else
			System.out.println(0);
	}
	private static int sumd(int M) {
		// TODO Auto-generated method stub
		
		int sumd=0;
		while (M > 0) {
			int rem = M % 10;
			sumd += rem;
			M /= 10;
		}
		
		return sumd;
	}
}
