package Array;

import java.util.Scanner;

public class Array_Basics {

    public static void updateMarks(int marks[]){
        for(int i=0 ;i<marks.length; i++){
            marks[i]+=1;
        }
    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        String[] fruits = {"apple", "mango", "banana"};  //Declaration + initialize
        System.out.println("Length of fruits = " + fruits.length);   // array length

        int[] marks = new int[3];  // Declaration + memory allocation
        System.out.println("Length of marks = " + marks.length);

        marks[0] = sc.nextInt();     //taking input
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Marks of Physics = " + marks[0]);
        System.out.println("Marks of Chemistry = " + marks[1]);
        System.out.println("Marks of Maths = " + marks[2]);

        int average = (marks[0] + marks[1] + marks[2]) / 3;  //calculating arrays

        System.out.println("Average of these marks is " + average);

//        marks[0] = marks[0] + 1;  // updating array
//        System.out.println("updated marks " + marks[0]);

        updateMarks(marks);
        System.out.println("Updated Marks");
       for(int i = 0; i<marks.length; i++){
           System.out.println(marks[i] + " ");
       }

    }
}
