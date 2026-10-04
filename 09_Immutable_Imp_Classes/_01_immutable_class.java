/** IMMUTABLE CLASS */
/**
 * An immutable class in Java is a class whose instances cannot be modified after they are created.
 * Once an object is constructed, its internal state remains completely constant throughout its lifetime
 */
public class _01_immutable_class {
  public static void main(String[]  args){
    //Shallow Copy Object
    College clg = new College("cmr", "medcal");
    Student s1 = new Student("shubham", 40, clg);
    System.out.println("student name: "+ s1.getName());
    System.out.println("College name before: "+ s1.getCollege().name);
    s1.getCollege().name = "MallaReddy";
    System.out.println("College name after : "+ s1.getCollege().name);

    System.out.println("<---------------------------->");
    // Deep Copy Object
    CollegeTwo clg2 = new CollegeTwo("Narayana", "chintal");
    StudentTwo s2 = new StudentTwo("shiva", 41, clg2);
    System.out.println("studenttwo name: "+ s2.getName());
    System.out.println("Collegetwo name before: "+ s2.getCollege().name);
    s2.getCollege().name = "Chaitaniya";
    System.out.println("Collegetwo name after : "+ s2.getCollege().name);
  }
}

/** Shallow Copy */
final class Student{
  private final String name;
  private final int rollNo;
  private final College college;

  Student(String name, int rollNo, College college){
    this.name = name;
    this.rollNo = rollNo;
    this.college = college;
  }

  public String getName(){
    return this.name;
  }

  public int getRollNo(){
    return  this.rollNo;
  }

  // this method gives a object reference, that can be modified later.
  //which break the rule of immutable class.
  public College getCollege(){
    return  this.college;
  }
};

class College{
  String name;
  String address;

  College(String name, String address){
    this.name = name;
    this.address = address;
  }
};

/** Deep Copy */
final class StudentTwo{
  private final String name;
  private final int rollNo;
  private final CollegeTwo college;

  StudentTwo(String name, int rollNo, CollegeTwo college){
    this.name = name;
    this.rollNo = rollNo;
    this.college = new CollegeTwo(college.name, college.address);
  }

  public String getName(){
    return this.name;
  }

  public int getRollNo(){
    return  this.rollNo;
  }

  // this method gives a object reference, that can be modified later.
  //which break the rule of immutable class.
  public CollegeTwo getCollege(){
    return   new CollegeTwo(this.college.name, this.college.address);
  }
}

class CollegeTwo{
  String name;
  String address;

  CollegeTwo(String name, String address){
    this.name = name;
    this.address = address;
  }
}

