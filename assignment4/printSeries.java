package assignment4;

import java.util.Scanner;

public class printSeries {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int m = sc.nextInt();
        int count = 1;
        int i = 0;
        
        while(i<times) {
            int num = 3*count + 2;
            
            if(num %m !=0) {
                System.out.println(num);
                i++;
                count++;
            }else {
                count++;
            }
        }
    }


}
