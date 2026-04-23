package Array;

public class Binary_Search {
    public static int binarySearch(int numbers[] , int key){
     int start = 0 , end = numbers.length - 1;
     int mid = (start + end ) / 2;

     while(start<= end){
         if(numbers[mid] == key){
             return mid;
         }else if(numbers[start]<mid){
             start = mid + 1;
         }else{
             end = mid-1;
         }
     }
     return -1;
    }

    public static void reverseArray(int number[]){
        int first = 0 , last = number.length-1;

        while(first < last){
            int temp = number[last];
            number[last] = number[first];
           number[first] = temp;

           first++;
           last--;
        }
    }

    public static void printPairs(int numbers[]){
        int tp =0;
        for(int i=0; i< numbers.length; i++ ){
            int curr = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("(" + curr + "," + numbers[j] + ")");
                tp++;
            }
        System.out.println();
        }
        System.out.println("Total pairs = " + tp);
    }

    public static void subarrays(int numbers[]){
        int ts = 0;
        int sum = 0;
        int maxSum = 0;
        for(int i = 0; i<numbers.length; i++){
            int start = i;
            for(int j = i; j<numbers.length; j++){
                int end = j;
                for(int k = start; k<=end; k++){
                    System.out.print(numbers[k]+ " ");
                    sum = sum + numbers[k];
                }
                    System.out.println(" - Sum of this Subarray is = " + sum);
                sum = 0;
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main (String[] args){
        int[] numbers = {2, 4, 6, 8, 10};
        int key = 5;

//        System.out.println("The key is at index : " + binarySearch(numbers, key));

//        reverseArray(numbers);
//        for (int i=0; i<numbers.length; i++){
//            System.out.print(numbers[i] + " ");
//        }

//        printPairs(numbers);

        subarrays(numbers);


    }
}
