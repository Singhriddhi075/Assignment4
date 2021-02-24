package assignment4;

import java.util.Scanner;

public class waveprint {
    public static void main(String args[]) {
    Scanner scn = new Scanner(System.in);
    int M=scn.nextInt();
    int N=scn.nextInt();
    int [][]arr=new int [M][N];
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            arr[i][j]=scn.nextInt();
        }
    }
    waveDisplay(arr);
}
public static void waveDisplay(int[][] arr) {
    for(int i=0;i<arr.length;i++) {
        if(i%2==0) {
            for(int j=0;j<arr[i].length;j++) {
                System.out.print(arr[i][j]+", ");   
            }
        }
            else {
                for(int j=arr[i].length-1;j>=0;j--) {
                    System.out.print(arr[i][j]+", ");   
                }
            }
        }
    System.out.print("END");
}
}