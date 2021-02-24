package assignment4;

import java.util.Scanner;

public class Knight {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in) ;
        int n = scn.nextInt() ; 
        boolean[][] board = new boolean[n][n] ;
        int count = NKnight(board, 0, 0, 0, board.length, "");
        System.out.println();
        System.out.println(count); ;

	}
	public static int NKnight(boolean[][] board, int row, int col, int kpsf, int tk, String ans) {
        if(kpsf == tk) {
            System.out.print(ans + " ");
            return 1;
        }
        if(col == board[0].length) {
            row++ ;
            col = 0 ;
        }
        if(row == board.length) {
            return 0;
        }
        int count = 0;
        if(isItSafeToPlaceTheKnight(board, row, col)) {
            board[row][col] = true ;
            count += NKnight(board, row, col + 1, kpsf + 1, tk, ans + "{" + row + "-" + col + "} ");
            board[row][col] = false ;
        }
        count += NKnight(board, row, col + 1 , kpsf, tk, ans);
        return count;
    }
    public static boolean isItSafeToPlaceTheKnight(boolean[][] board, int row, int col){
        int[] rowArr = {-1, -2, -2, -1} ;
        int[] colArr = {2, 1, -1, -2} ;
        for(int i = 0 ; i < rowArr.length ; i++) {
            int r = row + rowArr[i] ;
            int c = col + colArr[i] ;
            if(r >= 0 && r < board.length && c >= 0 && c < board.length) {
                if(board[r][c]) {
                    return false ;
                }
            }
        }
        return true ;
    }

}
