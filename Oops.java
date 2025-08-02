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
      System.out.println("constructor called!"); //Custom constructor; // non-parameterized constructor
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

// constructor called!
// Aman
// 23

class Student{
    String name;
    int age;
    
    public void printInfo(){
      System.out.println(this.name);
      System.out.println(this.age);
    }
    Student(String name,int age){ // parameterized constructor;
      this.name=name;
      this.age=age;
    }
  }
public class Main{
    public static void main(String[] args) {
      Student s1=new Student("Aman",23); // Object assigned
      s1.printInfo();
  }
}


class Student{
    String name;
    int age;
    
    public void printInfo(){
      System.out.println(this.name);
      System.out.println(this.age);
    }
    Student(Student s2){ // Copy constructor;
      this.name=s2.name;
      this.age=s2.age;
    }
  Student(){ }
  }
public class Main{
    public static void main(String[] args) {
      Student s1=new Student(); // Object assigned
      s1.name="Aman";
      s1.age=23;

      Student s2 = new Student(s1);
      s2.printInfo();
  }
}
