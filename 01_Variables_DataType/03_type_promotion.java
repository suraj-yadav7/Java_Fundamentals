/** TYPE PROMOTION */
/**
 * Type promotion in Java is the automatic conversion of a smaller primitive data type into a larger data type.
 * It happens implicitly during arithmetic operations or method overloading to prevent data overflow and ensure type compatibility
 */
class promotion{
  public static void main(String[]  args){
    byte b = 32;
    char c = 'a';
    short s = 924;
    int i = 70000;
    float f = 4.57f;
    double d = 0.12345;

    double result = (f * b) + (i / c) - (d * s);

    // f * b --> float
    // i / c --> integer
    // d * s --> double

    // float + integer --> float - double --> double
    System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
    System.out.println("Result = " + result);
  }
}