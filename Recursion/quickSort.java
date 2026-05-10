package Recursion;

public class quickSort {
    public static void quick_sort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int pIdx = partition(arr, si,ei);
        quick_sort(arr, si, pIdx-1);
        quick_sort(arr, pIdx+1, ei);

    }
    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1; // -1 -> to make space for element

        for(int j = si; j<ei; j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        //for element larger than pivot
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    // for printing the array
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    //Space complexity -> O(log n)
    public static void main (String[] args){
        int arr[] = {3,5,4,9,7,6};
        quick_sort(arr, 0, arr.length-1);
        printArray(arr);

    }
}
