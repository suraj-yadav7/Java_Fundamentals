/** CONSTRUCTOR MAPPING */
/** Constructor chaining in Java is the practice of calling one constructor from another constructor.
 * This technique helps centralize initialization logic and eliminatesduplicate code across overloaded constructors. */
class ConstructorChaning{
  public static void main(String[] args){
    Student s1 = new Student();
    Student s2 = new Student("Dhananjay");
    Student s3 = new Student("Shiva", 32);
    Student s4 = new Student("Shubham", 43, 28);
    Student s5 = new Student("Jagdish", 44, 27, "Narayana");
  }
};

class Student{
  String name;
  int rollNo;
  int age;
  String college;

  // Default Constructor
  Student(){
  }

  Student(String name){
    this(name, 0);
  }

  Student(String name, int rollNo){
    this(name, rollNo, 0);
  }

  Student(String name, int rollNo, int age){
    this(name, rollNo, age, "Unknown");
  }

  Student(String name, int rollNo, int age, String college){
    System.out.println("Student name: "+name+" Rollno: "+rollNo+" Age: "+age+" College: "+college);
  }
};