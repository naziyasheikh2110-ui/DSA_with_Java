package Recursion;

public class N_Queen {
    public static boolean isSafe(char[][] chessBoard, int row, int col) {
        //vertically upward
        for (int i = row - 1; i >= 0; i--) {
            if (chessBoard[i][col] == 'Q') {
                return false;
            }
        }
        //right diagonal up
        for (int i = row - 1, j = col + 1; i >= 0 && j < chessBoard.length; i--, j++) {
            if (chessBoard[i][j] == 'Q') {
                return false;
            }
        }
        //left diagonal up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chessBoard[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void nQueens(char[][] chessBoard, int row) {
        if (row == chessBoard.length) {
//            printBoard(chessBoard);
            count++;
            return;
        }
        for (int j = 0; j < chessBoard.length; j++) {
            if (isSafe(chessBoard, row, j)) {
                chessBoard[row][j] = 'Q';
                nQueens(chessBoard, row + 1);  //recursion
                chessBoard[row][j] = 'X'; //backtracking
            }
        }
    }

    public static void printBoard(char chessBoard[][]) {
        System.out.println("----------");
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length; j++) {
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int count = 0;

    public static void main(String[] args) {
        int n = 5;
        char[][] chessBoard = new char[n][n];

        //initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chessBoard[i][j] = 'X';
            }
        }

        nQueens(chessBoard, 0);
        System.out.println("Total ways to solve the n Queen are " + count);

        //Time complexity - O(n!)

    }
}
