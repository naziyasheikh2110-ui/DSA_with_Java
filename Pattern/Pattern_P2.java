public class Pattern_P2 {
    public static void hollow_rectangle(int totalRows, int totalCols) {
        for (int i = 1; i <= totalRows; i++) {
            for (int j = 1; j <= totalCols; j++) {
                if (i == 1 || i == totalRows || j == 1 || j == totalCols) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_pyramid(int n) {

        for (int i = 1; i <= n; i++) {              //outer loop
            for (int k = 1; k <= n - i; k++) {       // loop for spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {           // loop for stars
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inverted_number_pyramid(int n) {
        for (int i = 1; i <= n; i++) {              //outer loop
            for (int j = 1; j <= n - i + 1; j++) {       // loop for spaces
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floyd_pyramid(int n, int counter) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void binary_triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n) {
        //1st half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void hollow_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
                for (int j = 1; j <=n; j++) {
                    if (i == 1 || i == n || j == 1 || j == n) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            System.out.println();
        }
    }

    public static void diamond(int n){
        for(int i = 1; i<=n; i++){
            for(int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*(i-1))+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i>=1; i--){
            for(int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*(i-1))+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
//        hollow_rectangle(5,4);
//        inverted_pyramid(40);
//        inverted_number_pyramid(10);
//        floyd_pyramid(5, 1);
//        binary_triangle(4);
//        butterfly(4);
//        rhombus(5);
//        hollow_rhombus(5);
          diamond(4);


    }
}
