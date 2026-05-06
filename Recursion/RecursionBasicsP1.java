package Recursion;

public class RecursionBasicsP1 {
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }

    public static void printInc(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n * fnm1;
        return fn;
    }

    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int snm1 = sum(n-1);
        int sn = n + snm1;
        return sn;
    }

    public static int fibonacci(int n){
        if(n==0 || n ==1 ){
            return n;
        }
        int fnm1 = fibonacci(n-1);
        int fnm2 = fibonacci(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static boolean isSorted(int arr[] , int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    public static int firstOccurance(int arr[] , int i, int key){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurance(arr, i+1, key);
    }

    public static int lastOccurance(int arr[],int key, int i){
        if(i==arr.length){
            return -1;
        }
        int isFound = lastOccurance(arr,key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    public static int power(int x, int n){  // O(n)
        if(n==0){
            return 1;
        }
        return x * power(x , n-1 );
    }

    public static int optimizedPower(int x, int n){ //O(log n)
        if(n==0){
            return 1;
        }
        int halfPowerSq = optimizedPower(x, n/2) *  optimizedPower(x, n/2);

        //n is odd
        if(n%2!=0 ){
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main (String[] args){
        int n = 7;
        int[] arr = {1,2,6,5,3,5};

//        printDec(n);
//        printInc(n);
//        System.out.println(fact(n));
//        System.out.println(sum(n));
//        System.out.println(fibonacci(n));
//        System.out.println(isSorted(arr, 0));
//        System.out.println(firstOccurance(arr, 0,5));
//        System.out.println(lastOccurance(arr, 5,0));
        System.out.println(power(2,10));
        System.out.println(optimizedPower(2,10));

    }
}
