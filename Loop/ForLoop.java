import java.util.Scanner;

public class ForLoop {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

//       for(int i = 1; i<=10; i++){
//          System.out.println("Hello World");
//       }

//  -> Printing Stars
//       for(int i =1; i<=4; i++){
//           System.out.println("* * * *");
//       }

//  -> Display all numbers entered by user expect multiples of 10
        System.out.println("Enter number: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++ ){
            if(i%10==0){
                continue;
            }
            System.out.println(i);
        
        }

    }
}
