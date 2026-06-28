/** TYPE CONVERSION */
/**
 * Type conversion in Java is the process of changing a value from one data type into another.
 * Java handles this through two primary mechanisms: Implicit Type Conversion (Widening) which occurs automatically,
 * and Explicit Type Casting (Narrowing) which requires manual programmer intervention
 */
class conversion{
  public static void main(String[] args){
    /** Implicit Conversion */
    //byte to int
    byte b = 19;
    int i;
    i = b;
    System.out.println(i);

    // char to int
    char c = 'a';
    int asci;
    asci = c;
    System.out.println(asci);

    /** Explicit Conversion */
    // int to byte
    int num = 350;
    byte bVal;
    // bVal = num; //Type mismatch: cannot convert from int to byte
    bVal = (byte) num;
    System.out.println(bVal);

   /** Tuncating Conversion */
   // float to i
  float f = 18.324f;
  int val;
  val = (int) f;
  System.out.println(val);
  }
}