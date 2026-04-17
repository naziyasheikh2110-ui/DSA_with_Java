public class MethodPractice {

    public static int averageSum(int n1, int n2, int n3){
        return (n1+n2+n3)/3;
    }

    public static boolean isPalindrome(int n){
        int orignal_no =  n;
        int rev_no = 0;

        while(n != 0){
            int dig = n % 10;
            rev_no = rev_no * 10 + dig;
            n = n/10;
        }
        if(orignal_no == rev_no){
            return true;
        }
        return false;
    }

    public static int digitSum(int n){
        int orig_no = n;
        int sum = 0;
        while(n!=0){
            int digit = n % 10;
            n = n/10;

            sum+=digit;
        }
        return sum;
    }
    public static void main (String[] args){

//      -> avg of three numbers
        System.out.println(averageSum(2,2,2));

//     -> if a no. is palindrome or not
        System.out.println(isPalindrome(121));

//     -> calculation sum of digits of a number
        System.out.println(digitSum(123));
    }
}
