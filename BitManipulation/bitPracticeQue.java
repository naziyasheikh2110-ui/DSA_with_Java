package BitManipulation;

import java.util.Scanner;

public class bitPracticeQue {
    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println(n + " is Even");
        }
        else{
            System.out.println(n + " is Odd");
        }
    }

    public static int clearIthBit(int n, int i){
        int bitMask = (~0<<i);
        return n & bitMask;
    }

    public static boolean isPowerOfTwo(int n) {
        return (n & (n-1)) == 0;
    }

    public static int countSetBits(int n){
       int count = 0;
       while(n>0){
       if((n&1) != 0){
           count++;
       }
           n=n>>1;
       }
      return count;
    }

    public static int fastExpo(int a , int n){
        int ans =1;
        while(n>0){

            if((n&1)!=0){  //checking LSB
                ans =  ans * a;
            }
            a = a*a;
           n= n>>1;
        }
        return ans;
    }

    public static void swapNum(int a, int b){
        //Note -> x^x = x .. 10^10 = 10
        System.out.println("The original value of a is " + a + " and b is " + b);
       a=a^b;  //(10^20)
        b= a^b; //(10^20^20) = 10
        a =a^b;  //(10^20^10) = 20

        System.out.println("The swapped value of a is " + a + " and b is " + b);
    }

    public static int addOneToInteger(int x){
        //~x = -(x+1) so -(~x) = x+1
        return -(~x);
    }

    public static void upperToLowerCase(){
        for(char ch = 'A'; ch<='Z'; ch++){
            System.out.print((char)(ch | ' '));
        }
    }
    public static void main(String[] args){

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        oddOrEven(sc.nextInt());
//
//        System.out.println(clearIthBit(15,2));
//        System.out.println(isPowerOfTwo(14));
//        System.out.println(countSetBits(15));
//        System.out.println(fastExpo(5,3));
//        swapNum(10,20);
        System.out.println(addOneToInteger(5));
        upperToLowerCase();
    }
}
