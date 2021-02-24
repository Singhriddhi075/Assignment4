package assignment4;

import java.util.Scanner;

public class Basiccalculator {
	public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        int N1 = 0;
        int N2 = 0;
        while(i > 0){
        char ch = scan.next().charAt(0);
        if(ch == '+'|| ch == '-'|| ch == '*'|| ch == '/'|| ch =='%'){
            N1 = scan.nextInt();
            N2 = scan.nextInt();
        }
        System.out.println();
        if (ch == '+'){
        	
            System.out.print(N1 + N2);
        }else if (ch == '-'){
            System.out.print(N1 - N2);
        }else if (ch == '*'){
            System.out.print(N1 * N2);
        }else if (ch == '/'){
            System.out.print(N1 / N2);
        }else if (ch == '%'){
            System.out.print(N1 % N2);
        }else if (ch == 'x' || ch == 'X'){
            i = 0;
        }else {
            System.out.print("Invalid operation. Try again.");
        }
    }
	}
}
