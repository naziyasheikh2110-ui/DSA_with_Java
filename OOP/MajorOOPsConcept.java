package OOP;

import org.w3c.dom.UserDataHandler;

public class MajorOOPsConcept {
    public static void main (String[] args){

        Fish Shark = new Fish();
        Shark.eat();;
        Shark.fins = 7;
        Shark.swim();

        Cat Minnie = new Cat();
        Minnie.eat();
        Minnie.breathe();
        Minnie.color = "brown-white";
        Minnie.breed = "pursian";
        Minnie.legs = 4;

        Calculator add = new Calculator();
        System.out.println(add.sum(1,2));
        System.out.println(add.sum(3.6f,2.6f));
        System.out.println(add.sum(1,2,6));

        Deer D = new Deer();
        D.eat();

        Horse hu = new Horse();
        hu.walk();
        hu.eat();

        Queen q = new Queen();
        q.moves();

        Bear b = new Bear();
        b.eatMeat();
        b.eatPlants();
    }
}

//INHERITANCE

//base class
class Animal{
    Animal(){
        System.out.println("Animal constructor is calling");
    }
   String color;
   void eat(){
       System.out.println("Eat everything");
   }
   void breathe(){
       System.out.println("Breathing");
   }
}

class Mammal extends Animal{
    Mammal(){
        super();
        System.out.println("Mammal constructor is calling");
    }
    int legs;
}
class Cat extends Mammal{
    String breed;
}
//child class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swimming");
    }
}

//POLYMORPHISM
class Calculator{
    //Functions.Method overloading -> compile time
    int sum(int a, int b){
        return a + b;
    }
    int sum(int a, int b, int c){
        return a + b + c;
    }
    float sum(float a, float b){
        return a + b;
    }
}
//Functions.Method overriding
class Deer extends Animal{
    void eat(){
        System.out.println("Eat only Grass"); //same funct with diff defination
    }
}

//ABSTRACTION

abstract class Animal1{
    //non-abstract method
  void eat(){
      System.out.println("Eating");
  }

  //abstract method - > compulsory for DC of use it
   abstract void walk();
}

class Horse extends Animal1{
    void walk(){
        System.out.println("Horse walk on 4 legs");
    }
}

class Chicken extends Animal1{
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}

// interface
interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves() {
        System.out.println("Up, Down, Left , Right, diagonal");
    }
}

class Rook implements ChessPlayer{
    public void moves() {
        System.out.println("up , down , left , right");
    }
}

//Multiple inheritance
interface herbivorous{
   default void eatPlants(){
       System.out.println("Eat Plants");
    }
}
interface carnivorous{
   default void eatMeat(){
       System.out.println("Eat chicken");
   }
}

class Bear implements herbivorous, carnivorous{

}