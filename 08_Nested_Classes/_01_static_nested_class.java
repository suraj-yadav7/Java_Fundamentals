/** STATIC NESTED CLASS */
/**
 * A static nested class in Java is a class defined inside another class and declared with the static keyword.
  Unlike a regular inner class, a static nested class is not tied to an instance of the outer class.
  It behaves exactly like a normal, top-level class, except it's visually, logically scoped inside a class for better organization.
 */

public class _01_static_nested_class {
  public static void main(String[] args) {
    Outer outer = new Outer();

    Outer.Inner inner = new Outer.Inner(outer);
    inner.fun();
  }
};

// Outer Class
class Outer {
  private static int x = 4;
  int y;

  // Static Nested Inner Class
  static class Inner {
    Outer outer;
    private String name;
    private static int number;

    Inner(Outer outer) {
      this.outer = outer;
    }

    void fun() {
      System.out.println(x);
      System.out.println(outer.y);
    }

    static void fun2() {
      System.out.println("inner class");
    }
  }
};

class BankAccount {
  private static class InterestCalculator {
    static double calculateYearly(double principal, double rate) {
      return principal * rate;
    }
  }

  public double computeIntersest(double principal) {
    return InterestCalculator.calculateYearly(principal, 0.09);
  }
};