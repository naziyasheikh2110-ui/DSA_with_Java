public class Pattern_Practice {
    public static void pattern1(int n){
        for(int i=n; i>=1; i--){
            for(int k=1; k<i; k++){
                System.out.print(" ");
            }
            for(int j=5; j<=n; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        for(int i = 1; i<=n; i++){
            for(int k = 1; k<=n-i; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[]args){
//        pattern1(5);
       pattern2(5);

    }
}
