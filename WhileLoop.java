import java.util.Scanner;

public class WhileLoop {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
  /*    int counter = 0 ;
        int num = 0;
        while(counter<=100){
            System.out.println( num + " Hello");
            counter ++;
            num ++;
        }

  > print num 1 to 10
        int num =1;
        while (num <= 10 ){
            System.out.println(num);
            num ++ ;
        }

 -> Print num 1 to n
        System.out.println("Enter your number");
        int n = sc.nextInt();
        int num = 1;
        while(num <= n){
            System.out.println(num);
            num++;
        }

 -> Sum of first n natural number
        System.out.println("Enter the natural number n: ");
        int n = sc.nextInt();
        int sum=0;
        int i = 1;
        while(i<=n){
            sum+=i;
            i++;
        }
            System.out.println(sum);
*/

//   -> Reversing number
        int n = 10899;
        while(n>0){
          int lastDigit = n%10;
            System.out.print(lastDigit);
            n/=10;
        }


    }
}
