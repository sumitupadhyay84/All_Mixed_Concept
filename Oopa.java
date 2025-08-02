import java.util.*;
class Pen{
  String color; // member value
  String type;
  
  public void write(){
    System.out.println("Writing Something!"); // member function
  }
  
  public void printColor(){
    System.out.println(this.color);
  }
}
class Student{
    String name;
    int age;
    
    public void printInfo(){
      System.out.println(this.name);
      System.out.println(this.age);
    }
    Student(){
      System.out.println("constructor called!"); //Custom constructor;
    }
  }
public class Main{
    public static void main(String[] args) {
      Student s1=new Student(); // By default constructor
      s1.name="Aman";
      s1.age=23;
      s1.printInfo();
  }
}
