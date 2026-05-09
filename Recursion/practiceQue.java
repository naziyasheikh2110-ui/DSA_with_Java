package Recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class practiceQue {
    // ---------------QUE-1-----------------------(EASY)
    public static void sortString(String arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        sortString(arr, si, mid);
        sortString(arr, mid + 1, ei);
        mergeString(arr, si, mid, ei);
    }

    public static void mergeString(String arr[], int si, int mid, int ei) {
        String temp[] = new String[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i].compareTo(arr[j]) <= 0) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //left remaining
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // for right remaining
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        //copy temp to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }


    }

    //--------------QUE-2--------------------(MEDIUM)
    // Boyer-Moore - TC-O(n)
    public static int majorityElement(int nums[]){
        int count =0;
        int candidate = 0;

        for(int num : nums){
            if(count == 0){
                candidate = num;
            }
            if(candidate==num){
                count++;
            }
            else{
                count--;
            }

        }
            //verification

            count = 0;

            for (int num : nums) {
                if (num == candidate) {
                    count++;
                }
            }

            if(count>=nums.length/2) {
                return candidate;
            }

        return -1;
    }

    //-----------QUE-3---------------------

    public static int merge_Sort(int arr[], int left, int right){
        int invCount = 0;
        if(right>left){
            int mid =  (right + left) /2;

        invCount = merge_Sort(arr, left, mid);
        invCount += merge_Sort(arr, mid+1, right);
        invCount += merge(arr, left, mid, right);
        }
        return invCount;
    }
    // method to merge the Array
    public static int merge(int arr[], int left, int mid , int right){
        int temp[] = new int[right-left+1];
        int i = left; //index for 1st sorted part
        int j = mid+1;  // index for 2nd sorted part
        int k = 0; //index of temp array
        int invCount = 0;

        while(i<=mid && j <= right){
            if(arr[i]<=arr[j]) {
                temp[k] = arr[i];
                i++;
            }
            else {
                temp[k] = arr[j];
                invCount += (mid-i+1);
                j++;
            }
            k++;
        }

        //for leftover of 1st sorted part
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        while(j <= right){
            temp[k++] = arr[j++];
        }

        //copy temp to original array
        for(k=0,i=left; i<=right; k++, i++){
            arr[i] = temp[k];
        }
        return invCount;
    }

    public static void main (String[] args){
//        String arr[] = {"sun", "mars", "earth", "mercury"};
//        sortString(arr, 0 , arr.length-1);
//        System.out.println(Arrays.toString(arr));

//        int nums[] = {1,2,2,3,2};
//        System.out.println(majorityElement(nums));

        int arr[] = {1,20,6,4,5};
        System.out.println(merge_Sort(arr, 0 , arr.length-1));


    }
}
