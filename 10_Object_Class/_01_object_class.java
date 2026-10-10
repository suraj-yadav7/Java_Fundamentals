/** OBJECT CLASS */
/** The java.lang.Object class is the root of the class hierarchy in Java. Every class in Java directly or
 * indirectly inherits from the Object class. If a class does not explicitly extend another class,
 * the Java compiler automatically makes it extend Object */

public class _01_object_class {
  public static void main(String[] args){

    Student s1 = new Student();
    s1.name = "Krishana";
    s1.age = 25;
    System.out.println("toString: "+s1.toString());

    Student s2 = new Student();
    s2.name = "naveen";
    s2.age = 26;
    System.out.println("equals: "+s1.equals(s2));
  }
};


class Student extends Object{
  String name;
  int age;

  // implmentation of toString method. //
  @Override
  public String toString(){
    return (name+ ", " +age);
  }

  // implementation of equals method. //
  @Override
  public boolean equals(Object obj){
    if(this == obj) return  true;

    if(obj == null) return  false;

    if(this.getClass() != obj.getClass()){
      return  false;
    }

    Student stud = (Student) obj;
    return this.name == stud.name && this.age == stud.age;
  }
}