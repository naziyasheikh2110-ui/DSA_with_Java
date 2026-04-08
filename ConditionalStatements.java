import java.util.Scanner;

public class ConditionalStatements {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
//  IF-ELSE

//        int age = 55;
//        if(age >= 18){
//            System.out.println("You are an adult");
//        }
//        else{
//            System.out.println("You are a minor");
//        }
//        System.out.println("Enter two number: ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();

//   -> Lager of two number
//        if(a>b){
//            System.out.println( "A = " + a + " is greater");
//        }
//        else{
//            System.out.println( "B = " + b + " is greater");
//        }

//   -> Odd or Even
//        int num = sc.nextInt();
//        if(num % 2 == 0){
//           System.out.println( num + " is Even");
//        }
//        else{
//            System.out.println(num + " is Odd");
//     }

//  ELSE-IF
//    -> Tax Calculator
//        int inc = sc.nextInt();
//        int tax;
//        if (inc < 500000){
//            tax = 0;
//        }
//        else if(inc >= 500000 && inc < 1000000){
//           tax = (int)(inc * 0.2);
//        }
//        else{
//            tax = (int) (inc * 0.3);
//        }
//        System.out.println("Your tax is: " + tax);

//     -> Largest of three no
/*      System.out.println("Enter first number a : ");
        int a = sc.nextInt();
        System.out.println("Enter Second number b : ");
        int b = sc.nextInt();
        System.out.println("Enter Third number c : ");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("The largest of three number is a = " + a);
        }
        else if ( b>c){
            System.out.println("The largest of three number is b = " + b);
        }
        else{
            System.out.println("The largest of three number is c = " + c);
        }
//  TERNARY OPERATOR
        System.out.println("Enter Marks: ");
        int marks = sc.nextInt();
        String type =  ((marks >= 33 ) ? "PASS" : "FAIL");
        System.out.println(type);

//  SWITCH-STATEMENT

        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second number: ");
        int b = sc.nextInt();

        System.out.println("Enter the operator -> + , - , / , * , % : ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+' : System.out.println(a+b);
                break;
            case '-' : System.out.println(a-b);
                break;
            case '*' : System.out.println(a*b);
                break;
            case '/' : System.out.println(a/b);
                break;
            case '%' : System.out.println(a%b);
                break;
            default:
                System.out.println("Please choose the write operator");
        }
*/

//        -------------PRACTICE----------------

//        int num = sc.nextInt();
//        if(num > 0){
//            System.out.println("Your number is Positive");
//        }
//        else{
//            System.out.println("Your number is negative");
//        }

//        -------------------------------------------

//        double temp = 100.0;
//
//        if(temp >=100){
//            System.out.println("You have fever");
//        }
//        else{
//            System.out.println("You don't have fever");
//        }

//        -----------------------------------------------

//        System.out.println("Enter week number(1-7): ");
//        int num = sc.nextInt();
//        switch (num){
//            case 1 : System.out.println("Monday");
//                break;
//            case 2 : System.out.println("Tuesday");
//                break;
//            case 3 : System.out.println("Wednesday");
//                break;
//            case 4 : System.out.println("Thursday");
//                break;
//            case 5 : System.out.println("Friday");
//                break;
//            case 6 : System.out.println("Saturday");
//                break;
//            case 7 : System.out.println("Sunday");
//                break;
//            default: System.out.println("Please enter number between 1-7");
//        }

//        -----------------------------------------------

        int year = sc.nextInt();

        boolean x = year % 4 == 0;
        boolean y = year % 100 != 0;
        boolean z = year % 400 == 0;

        if(x && y || z) {
            System.out.println("Leap year");
        }else{
            System.out.println("not a leap year");
        }

    }
}
