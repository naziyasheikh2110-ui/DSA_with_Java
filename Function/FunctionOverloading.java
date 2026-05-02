public class FunctionOverloading {
//    => sum of 2 numbers
    public static int sum(int a, int b){
        return a+b;
    }

//    => sum of three numbers
public static int sum(int a, int b, int c){
    return a + b + c;
}

//   => func to calculate float num
    public static float sum(float a, float b){
        return a+b;
    }


    public static void main(String[] args){

        System.out.println(sum(2,4));
        System.out.println(sum(2,4, 5));
        System.out.println(sum(2.8f,4.6f));
    }
}
