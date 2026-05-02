import java.util.Scanner;

public class Method {
    public static void printHelloWorld() {
        for(int i = 1; i<=10; i++){
            System.out.println("Hello world");
        }
    }

    public static int calculateSum(int num1 , int num2) {   //Formal parameters
        int sum = num1 + num2;
        return sum;
    }

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static int factorial(int n) {
        int f = 1;
        for(int i=1; i<=n; i++){
            f*=i;
        }
        return f;
    }

    public static int binCoeff(int n, int r){

        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial((n-r));

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return  binCoeff;
    }
    public static int productOfNum(int a, int b){
        int product = a*b;
        return product;
    }

    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime1(int n){
        if(n==2){
            return true;
        }
        for(int i=2; i<Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (  isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void binToDec(int n){
        int binNum = n;
        int decNum = 0;
        int pow = 0;

        while(binNum!=0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

            pow ++;
            binNum = binNum/10;
        }
        System.out.println("The binary number " + n + " is equal to decimal number " + decNum);;

    }

    public static void decToBin(int n){
        int decNum = n;
        int binNum = 0;
        int pow = 0;

        while(decNum!=0){
            int rem = decNum%2;
            binNum = binNum + (rem * (int)Math.pow(10,pow));

            pow++;
            decNum = decNum/2;
        }
        System.out.println(binNum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        printHelloWorld(); //Function call


//       -> sum of two numbers
//          int a = sc.nextInt();
//          int b = sc.nextInt();
//          int sum = calculateSum(a, b);
//          System.out.println("Sum of a and b is " + sum);  // Arguments or Actual parameters

//         -> swapping two numbers
//             int a = 5;
//             int b = 10;
//             swap(a,b);

//         -> Product of two number
//             int x= sc.nextInt();
//             int y = sc.nextInt();
//             int product = productOfNum(x,y);
//            System.out.println("Product of a and b: " + product);

//          -> Factorial of a number
//            System.out.println("Enter number n: ");
//            int n = sc.nextInt();
//            int fact = factorial(n);
//            System.out.println(fact);

//           System.out.println(binCoeff(3,2));

//           System.out.println(isPrime(sc.nextInt()));
//           System.out.println(isPrime1(sc.nextInt()));

//             primeInRange(18);

//              binToDec(111);

              decToBin(6);

    }
}
