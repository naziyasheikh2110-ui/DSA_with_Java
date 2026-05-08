package Recursion;

public class mergeSort {

    //Divide and conquer

    public static void merge_Sort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si + (ei-si)/2;
        merge_Sort(arr, si, mid);
        merge_Sort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }
    // method to merge the Array
    public static void merge(int arr[], int si, int mid , int ei){
        int temp[] = new int[ei-si+1];
        int i = si; //index for 1st sorted part
        int j = mid +1;  // index for 2nd sorted part
        int k = 0; //index of temp array

        while(i<=mid && j <= ei){
            if(arr[i]<arr[j]) {
                temp[k] = arr[i];
                i++;
            }
            else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //for leftover of 1st sorted part
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        //copy temp to original array
        for(k=0,i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }
     // for printing the array
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    //Time complexity = O(nlog n)
    //Space complexity = O(n)

    public static void main (String[] args){
        int arr[]  = {4,3,5,6,7,4};
        merge_Sort(arr, 0 , arr.length-1 );
        printArray(arr);

    }
}
