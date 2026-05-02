package BitManipulation;

public class bitOperator {

    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n&bitMask) == 0){
            return 0;
        }
        return 1;
    }
    public static int setIthBit(int n , int i ){
        int bitMask = 1<< i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i,int newBit){
        if(newBit == 0){
           return clearIthBit( n, i);
        }
        return setIthBit(n, i);
    }
    public static void main (String[] args){
//        System.out.println(5 & 6);  // --> AND
//        System.out.println(5 | 6);  // --> OR
//        System.out.println(5 ^ 6);  // --> XOR
//        System.out.println(~5);  // --> 1s complement
//        System.out.println(5<<2);  // --> bitWise left shift
//        System.out.println(6>>1);  // --> bitWise Right shift
//
//        System.out.println( getIthBit(10 ,4));
//        System.out.println(setIthBit(10,2));
        System.out.println(clearIthBit(10,1));
        System.out.println(updateIthBit(10,2,1));

     }
}
