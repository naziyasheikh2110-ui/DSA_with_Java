package Array;

public class PracticeQue2DArray {

    public static void spiralMatrix(int matrix[][]) {
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {

            //Top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            //Right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            //bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            //left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
    }

    public static int diagonalSum1(int matrix[][]) { // O(n^2)
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                } else if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    public static int diagonalSum2(int matrix[][]) {  // O(n)
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            //Primary diagonal
            sum += matrix[i][i];

            //secondary diagonal
            sum += matrix[i][matrix.length - 1 - i];
        }
        return sum;
    }

    public static boolean searchMatrix(int matrix[][], int key) {  //-> staircaseSearch //O(m+n)
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (key == matrix[row][col]) {
                System.out.println("Key found at (" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static int countOf7(int matrix2[][]) {
        int count = 0;
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                if (matrix2[i][j] == 7) {
                    count++;
                }
            }
        }
        System.out.println("Number of seven's are: " + count);
        return count;
    }

    public static int sumOfSecondRow(int matrix2[][]) {
        int sum = 0;
        for (int j = 0; j < matrix2[0].length; j++) {
            sum += matrix2[1][j];
        }
        System.out.println("Sum of second row of matrix is: " + sum);
        return sum;
    }

    public static void transposeMatrix(int matrix2[][]) {

        //initializing new Array
        int[][] transpose = new int[matrix2.length][matrix2[0].length];

        // transpose matrix -> row become col , col become row
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                transpose[j][i] = matrix2[i][j];
            }
        }

        //printing transpose
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};
        int key = 33;

//        spiralMatrix(matrix);
//        System.out.println(diagonalSum1(matrix));
//        System.out.println(diagonalSum2(matrix));
//         searchMatrix(matrix, key);

        int matrix2[][] = {{1, 3, 4, 5},
                {4, 6, 7, 2},
                {5, 7, 7, 8},
                {7, 5, 8, 9}};

//        countOf7(matrix2);
//        sumOfSecondRow(matrix2);
        transposeMatrix(matrix2);
    }
}
