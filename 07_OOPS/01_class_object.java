/* OOPS */
/** Object-Oriented Programming System (OOPs) is a core programming paradigm in Java that structures software design
 * around objects and classes rather than functions or logic. It aims to mirror real-world entities to make code
 * more modular, flexible, and reusable. */

/** Class: A user-defined template or blueprint that defines the variables (data) and methods (behavior) common to a specific type.
 * Object: A real-world entity and an instance of a class. It occupies memory on the heap when created using the new keyword. */
class MainClass {
  public static void main(String[] args){
    //Object instance
    Student sOne = new Student();
    sOne.name = "Suraj";
    sOne.rollNo = 46;
    sOne.dept = "CSE";
    sOne.college = "Wesley College of Engineering";
    sOne.studentInfo();

    //Object instance
    Student sTwo = new Student();
    sTwo.name = "Shiva";
    sTwo.rollNo = 42;
    sTwo.dept = "Mechanical";
    sTwo.college = "MallaReddy College of Engineering";
    sTwo.studentInfo();
  }
}

/** CLASS */
class Student{
  String name ;
  int rollNo ;
  String dept;
  String college;

  void studentInfo(){
    System.out.println("Name: "+name+" RollNo: "+rollNo+" college: "+college);
  }
}