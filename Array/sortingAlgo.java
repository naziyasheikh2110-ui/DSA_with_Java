package Array;
import java.util.*;
public class sortingAlgo {

    public static void bubbleSort(Integer arr[]) {  // TC - O(n^2)
        for (int turn = 0; turn < arr.length - 1; turn++) {
            boolean swap = false;
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break; //stop if already sorted
            }
        }
    }

    public static void selectionSort(Integer arr[]) {  // TC - O(n^2)
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;

        }
    }

    public static void insertionSort(Integer arr[]) {  // TC - O(n^2)
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static void countSort(Integer arr[]) { // TC - O(n+range)
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        //sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printSort(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main (String[]args){
        Integer[] arr = {3,5,8,2,1,1,4,3,2};

//        bubbleSort(arr);
//        selectionSort(arr);
        insertionSort(arr);
//        countSort(arr);

//        IN-BUILT FUNCTIONS
//        Arrays.sort(arr);
//        Arrays.sort(arr , 0 ,3);
//        Arrays.sort(arr , Collections.reverseOrder());
//        Arrays.sort(arr ,0,3, Collections.reverseOrder());
        printSort(arr);

    }
}
