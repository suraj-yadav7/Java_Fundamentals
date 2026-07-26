class StaticKeyword{
  public static void main(String[] args) {
    //Static//
    // access static method and variable using classname
    Student.studCollge();
    System.out.println("grade: "+ Student.grade);

    Student s1 = new Student("Shiva",   11);
    Student s2 = new Student("Shubham", 12);
    s1.details();
    s2.details();

    //Final //
    System.out.println("PI: "+MathConstant.EULER);
    MathConstant math = new MathConstant();
    System.out.println("GoldenRation: "+math.GOLDENT_RATION);
  }
}

/** STATIC */
/** The static keyword means that a variable, method, or block belongs to the class itself rather than to a
 * specific instance (object) of that class. */
class Student{
  String name;
  int rollNo;
  static String college = "Wesley PG College";
  static double grade;

  Student(String name, int rollNo){
    this.name = name;
    this.rollNo = rollNo;
  }

  static {
    grade = 9.2;
  }

  void details(){
    System.out.println("Name: "+name+" rollNo: "+rollNo);
    System.out.println("College: "+college+" grade: "+Student.grade);
  }

  //static method
  static void studCollge(){
    System.out.println("College Name: "+college);
  }
}



/** FINAL */
/** The final keyword is a non-access modifier used to restrict further modification of classes, methods, or variables.
 * Its core purpose is to enforce immutability, ensure security, and preserve crucial business logic from being altered */
class MathConstant{
  final double PI = 3.14;
  static final double EULER =2.71;
  final double GOLDENT_RATION;
  MathConstant(){
    GOLDENT_RATION = 1.6;
  }
}