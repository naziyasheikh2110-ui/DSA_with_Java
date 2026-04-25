package Array;

public class SubArray_MaxSum {
    public static void bruteForce(int numbers[]){   // TIME COMPLEXITY = O(n^3)

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i<numbers.length; i++){
            int start = i;
            for(int j = i; j<numbers.length; j++){
                int end = j;
                currSum = 0;
                for(int k = start; k<=end; k++){
                    currSum+=numbers[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum = currSum;
                }
            }
        }
            System.out.println();
            System.out.println("Maximum sum = " + maxSum);
    }

    public static void prefixSum(int numbers[]){   //TIME COMPLEXITY = O(n^2)

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

//        calculate prefix array
        prefix[0] = numbers[0];
        for(int i = 1; i<prefix.length; i++){
        prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i = 0; i<numbers.length; i++){
            int start = i;
            for(int j = i; j<numbers.length; j++){
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(maxSum<currSum){
                    maxSum = currSum;
                }
            }
        }
            System.out.println();
            System.out.println("Maximum sum = " + maxSum);
    }

    public static void kadanesAlgo(int numbers[]){  //TIME COMPLEXITY = O(n)
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i<numbers.length; i++){
            currSum+=numbers[i];
            maxSum = Math.max(currSum,maxSum);
            if(currSum<0){
                currSum = 0;
            }
        }
        System.out.println("Maximum sum = " + maxSum);
    }
    public static void main(String[] args){
        int[] numbers = {-2, -3, 4, -1, -2, 1, 5, -3 };

        bruteForce(numbers);
        prefixSum(numbers);
          kadanesAlgo(numbers);

    }
}
