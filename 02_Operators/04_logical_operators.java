/** LOGICAL OPERATORS */
/**
 * Logical operators in Java are used to evaluate or combine multiple boolean expressions or values.
 * They are a fundamental tool for controlling the flow of a program, typically used inside if statements, while and for loops.
 */
class logical{
  public static void main(String[] args) {
    int numOne = 11;
    int numTwo = 15;

    System.out.println("Logical AND: "+(numOne>5 && numTwo<20));
    System.out.println("Logical OR: "+(numOne>20 || numTwo<20));
    System.out.println("Logical NOT: "+(!(numOne>20)));
  }
}