package Array;

public class Linear_Search {

    public static int linearSearch(int number[] , int key){
        for(int i = 0; i<number.length; i++){
        if(number[i] == key){
            return 1;
        }
        }
        return -1;
    }

    public static int largertNum(int number[]){
        int largest = Integer.MIN_VALUE;  // -infinity
        for(int i =0 ; i<number.length; i++){

        if(largest<number[i]){
            largest = number[i];
        }
        }
        return largest;
    }

    public static int smallestNum(int number[]){
        int smallest = Integer.MAX_VALUE;  // +infinity
        for(int i =0 ; i<number.length; i++){

        if(smallest>number[i]){
            smallest = number[i];
        }
        }
        return smallest;
    }
    public static void main (String[] args){
        int[] number = {2,6,43,56,88,21};
        int key = 82;

//        int index = linearSearch(number, key);
//
//        if(index == -1) {
//            System.out.println("NOT FOUND");
//        }else{
//            System.out.println("Key is at index");
//        }

        System.out.println("The largest number is " + largertNum(number));
        System.out.println("The Smallest number is " + smallestNum(number));






    }
}
