package OOP;

public class ObjectAndClasses {
    public static void main(String[]args){

        Pen p1 = new Pen(); //pen p1 is object
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setPenTip(3);
        System.out.println(p1.getColor());


        BankAccount myAcc = new BankAccount();
        myAcc.userName = "Naziya";
       // myAcc.password  -> cannot access it here


        Student s1 = new Student();
         s1.name = "Naziya";
         s1.age = 20;
         s1.marks[0] = 100;
         s1.marks[1] = 80;
         s1.marks[2] = 70;

       Student s2 = new Student(s1); //copy of s1
        for(int i = 0; i<3; i++){
            System.out.println(s2.marks[i]);
        }

    }
}

//class
class Pen{
   private String  color;
   private int penTip;

   //Getters and setters
    String getColor(){
        return this.color;
    }
    int setTip(){
        return this.penTip;
    }
    void setColor(String newColor){
        this.color = newColor;
    }
    void setPenTip(int tip){
        this.penTip = tip;
    }
}

class BankAccount{
    String userName;
    private int password;
        void setPassword(int password){
            this.password = 12344;
        }
}
class Student{
    String name;
    int age;
    int marks[];

    //shallow copy constructor
//    Student(Student s1){
//        marks = new int[3];
//      this.name = s1.name;
//      this.age = s1.age;
//      this.marks = s1.marks;
//    }

    //Deep copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.age = s1.age;
        for(int i =0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }
//    non parameterized constructor
    Student(){
        marks = new int[3];
        System.out.println("Constructor is called..");
    }
//
    //parameterized constructor
    Student(String name, int age){

        System.out.println("Constructor is called..");
        this.name = name;
    }

}