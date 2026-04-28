package Array;

import java.util.*;

public class Matrices {
    public static boolean search(int matrix[][], int key) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        boolean found = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                largest = Math.max(largest, matrix[i][j]);
                smallest = Math.min(smallest, matrix[i][j]);

                if (matrix[i][j] == key) {
                    System.out.println("Key found at the matrices [" + i + "," + j + "]");
                    found = true;
                }

            }
        }
         System.out.println("Largest element is " + largest );
        System.out.println("Smallest element is " + smallest );

        if(!found){
            System.out.println("Key not found");
        }
        return found;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];  // cell = n * m = 3 * 3 = 9
        int n = matrix.length, m = matrix[0].length;  // n = 3 , m = 3

        Scanner sc = new Scanner(System.in);

        // Input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //Output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix, 4);





    }
}
