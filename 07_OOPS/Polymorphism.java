/** POLYMORPHISM */

/**
 * It allows a single entity to take multiple forms. It enables the same method or interface to behave differently depending
 * on the object involved. Polymorphism improves code flexibility, reusability, and maintainability. Polymorphism means "many forms".
 * It allows the same method to exhibit different behaviors. It is achieved through method overloading and method overriding.
 */
public class Polymorphism {
  public static void main(String[] args){
    /** complie time object */
    Calculation sumNums = new Calculation();
    double res1 = sumNums.addNum(10, 20);
    System.out.println("Two Parameter Sum: "+ res1);

    double res2 = sumNums.addNum(10, 10, 15);
    System.out.println("Three Parameter Sum: "+res2);

  /** run-time object */
    Iphone usa = new UsaRegion();
    usa.price();

    Iphone nonUsa = new NonUsaRegion();
    nonUsa.price();
  }
};

/** Method Overloading (Compile Time Polymorphism) */
class Calculation{
  double addNum(double a, double b){
    double sum = a+b;
    return  sum;
  }

  double addNum(double a, double b, double c){
    double sumAllParams = a+b+c;
    return sumAllParams;
  }
};

/** Method Overriding (Run-Time Polymorphism) */
abstract class Iphone{
  abstract void price();
}

class UsaRegion extends Iphone{
  @Override
  void price(){
    System.out.println("The Iphone price in USA-Region is: "+199 +" Dollar.");
  }
};

class NonUsaRegion extends Iphone{
  @Override
  void price(){
    System.out.println("The Iphone price in Non-USA Region is: "+299+" Dollar.");
  }
};

/** Important Concepts */
// Static  --> They belong to class and not to objects
// private --> Methods cannot be overriden
// final   --> Methods cannot be overriden
// Final   --> If created a class with final keyword --> then you cannot create child of that class.
// Fields  --> The variables cannot be polymorphic as it belongs to class.