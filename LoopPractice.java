import java.util.Scanner;

public class LoopPractice {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

//  -> Factorial of any number
//        int fact = 1;
//        int n = sc.nextInt();
//        for( int i = 1; i<=n; i++){
//            fact*=i;
//        }
//        System.out.println(fact);

//  -> Table of any number
//        System.out.println("Enter the number");
//        int n = sc.nextInt();
//        int i = 1;
//        int ans ;
//        do{
//           ans = n * i;
//            System.out.println( n + " X " + i +  " = " + ans);
//            i++;
//        }while(i<=10);

//  -> If a number is prime or not
//        System.out.println("Enter a number: ");
//        int n = sc.nextInt();
//
//        if (n==2){
//            System.out.println("Number is prime" );
//        }else{
//        boolean isPrime = true;
//            for(int i=2; i<=n-1; i++) {
//                if (n % i == 0) {
//                    isPrime = false;
//                }
//             }
//               if(isPrime == true){
//                   System.out.println("Number is prime");
//               }
//               else{
//                   System.out.println("Number is not prime");
//               }
//            }

//  ->  check if number is even or not and then add evenSum and oddSum

        int num;
        int choice;
        int evenSum = 0 ;
        int oddSum = 0;

        do{
            System.out.println("Enter the number: ");
            num = sc.nextInt();

            if(num%2==0){
                evenSum+=num;
            }else{
                oddSum+=num;
            }

            System.out.println("Do you want to continue? Press 1 for yes or 0 for no");
            choice = sc.nextInt();
        }
        while (choice==1);

        System.out.println("sum of even numbers: " + evenSum);
        System.out.println("sum of odd numbers: " + oddSum);

    }
}
