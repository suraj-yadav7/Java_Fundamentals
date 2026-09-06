/** INHERITANCE */
/** Inheritance in Java is a fundamental concept of Object-Oriented Programming (OOP) that allows one class to acquire the properties (fields)
 * and behaviors (methods) of another class. It establishes an "IS-A" relationship between classes, aiming to maximize code reusability. */
/** Types of inheritance */
//Simple Inheritance
//Multi-level Inheritance
//Hierarchy Inheritance
// Multiple Inheritance (Not supported by java)

public class Inheritance {
  public static void main(String[] args){
    Student s1 = new Student(43, "Shubham");
    s1.getStudentDetails();

    EngineeringStudent e1 = new EngineeringStudent(44, "shiva", "Loyala College");
    e1.getStudentDetails();
    e1.attendLab();
  }
}

class Student{
  int rollNo ;
  String name;

  Student(int  rollNo, String name){
    this.rollNo = rollNo;
    this.name = name;
  }

  public void getStudentDetails(){
    System.out.println("Student RollNo, Name: "+ rollNo+ " " + name);
  }
};

class EngineeringStudent extends Student{
  String college;

  EngineeringStudent(int rollNo, String  name, String college){
    super(rollNo, name);
    this.college = college;
  }

  public void getStudentDetails(){
    super.getStudentDetails();
    System.out.println("College: "+college);
  }
  public void attendLab(){
    System.out.println("Daily Lab for Engineering Student.");
  }
};

/* Multilevel Inheritance */
// A --> B extend A --> C extend B

/** Hierarchy Inheritance */
/*    A
    /   \
  B      C
*/

// Note
// this : this keyword ref to current instance object
// super: super keyword refer to supercalss object, all access to methods and properties. importantly call parent class constructor.