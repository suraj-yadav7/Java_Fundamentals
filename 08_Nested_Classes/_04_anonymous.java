/** ANONYMOUS CLASS */
/**
 * An anonymous class in Java is an inner class that does not have a name and is declared and instantiated at the same time.
 *  It is primarily used to override methods of an existing class or to implement an interface for a single-use purpose
 * without having to create a separate class and extend parent class to access all method, properties.
 */
public class _04_anonymous {
  public static void main(String[] args){
    Outer outerObj = new Outer(){
      String personName = "Varun";

      @Override
      void introduce(){
        System.out.println("Hi my name is: "+ personName);

        greet();
      }

      void  greet(){
        System.out.println("Have good day ahead.");
      }
    };

    outerObj.introduce();
  }
};

class Outer{
  void introduce(){
    System.out.println("Hello this is outer class");
  }
};