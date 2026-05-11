package Recursion;

public class searchInRotatedSortedArr {
    public static int Search(int arr[], int si, int ei, int target){
if(si>ei){
    return -1;
}

        int mid = si + (ei - si) / 2;
        //Case FOUND
        if (arr[mid] == target) {
            return mid;
        }

        //Case - mid on L1
        if (arr[si] <= arr[mid]) {
            //case a: left
            if (arr[si] <= target  && target <= arr[mid]) {
                return Search(arr, si, mid - 1, target);
            }
            //case b: Right
            else {
               return Search(arr, mid, ei, target);
            }
        }
        //Case - mid on L2
        else {
            //case c: right
            if (target <= arr[ei] &&  arr[mid] <= target) {
               return Search(arr, mid, ei, target);
            }
            //case d : left
            else{
           return Search(arr, si, mid, target);
            }
        }

    }
    public static void main (String[] args){
        int arr[] = {4,5,6,7,0,1,2};
        int tIdx = Search(arr, 0, arr.length-1, 0);
        System.out.println(tIdx);

        //Time complexity - O(n logn)

    }
}
