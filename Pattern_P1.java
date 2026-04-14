public class Pattern_P1 {
    public static void main(String[]args){

//        int n = 4;
//        for(int i = 1; i<=n; i++){
//            for(int j = 1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//     -> INVERTED STAR

//        int n = 4;
//        for(int i = 1; i <= n; i++ ){
//            for(int j = 4; j >= i; j-- ){
//
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//     -> HALF PYRAMID

//        int n = 4;
//            for(int i = 1; i<=n; i++){
//            for(int j = 1; j<=i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//     -> CHARACTER PATTERN

       int n = 6;
       char ch = 'A';
       for(int i = 1; i<=n; i++){
           for(int j = 1; j<=i ; j++){
               System.out.print(ch);
               ch++;
           }
           System.out.println();
       }


        }
    }

