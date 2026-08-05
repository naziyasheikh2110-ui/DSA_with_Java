package GreedyAlgorithm;

public class KthLargestOddNum {

    public static int printOddNum(int[]range, int k){
        int L = range[0];
        int R = range[1];

        if(k<=0) {
            return 0;
        }
        if((R&1)>0){ //R is odd
            int count =(int)Math.ceil(R-L+1)/2;  //counting odd numbers 10+10+1/2 = 10
            if(k>count){
                return 0;
            }else{
                return R-2*k+2;
            }
        }else{ // R is even
            int count = (R-L+1)/2;
            if(k>count){
                return 0;
            }else{
                return R-2*k+1;
            }
        }

    }
    public static void main(String[]args){
        int[] range = {-10,10};
        int k = 8;
        System.out.println(printOddNum(range, k));

    }
}
