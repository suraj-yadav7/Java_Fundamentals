/** LOCAL CLASS */
/**
 * A local class in Java (often called a method-local inner class) is a class declared inside a block of code.
 * This block is typically a method body, but it can also be a constructor, a for loop, or an if clause.
 * Because its scope is limited entirely to that specific block, you can only instantiate and
 *  use the class within the block where it is defined.
 */
public class _03_local_class {

  public static void main(String[] args) {
    Outer outer = new Outer();
    outer.greet();
  }
}

/** Outer Class */
class Outer{

  /** Outer class method */
  void greet(){
    String str="Java-jvm";
    final int version = 3;

    /** Local class */
    class LocalClass{
      void welcome(){
        System.out.println("Welcome to Java World: " + str);
      }

      void oops(){
        System.out.println("Java is Oops oriented language: "+version);
      }
    }
    LocalClass local = new LocalClass();
    local.welcome();
    local.oops();
  }
};