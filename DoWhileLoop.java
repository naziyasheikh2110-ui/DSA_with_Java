import java.util.Scanner;

public class DoWhileLoop {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

//        int i = 1;
//        do {
//            System.out.println("Hii , my name is Naziya");
//            if (i == 3){
//                break;
//            }
//            i++;
//        } while(i<=7);

//    -> Keep entering numbers till user enters a multiple of 10

  do{
    int i = sc.nextInt();
      if(i%10==0){
          System.out.println("Exit");
          break;
      }
          System.out.println(i );
      }while(true);
    }
}
