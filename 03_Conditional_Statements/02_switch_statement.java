/** SWITCH STATEMENTS */
/** The Java switch statement is a multi-way branch statement that executes different blocks of code based on the exact value of an expression.
 * It provides a cleaner, more readable, and often faster alternative to a long if-else-if ladder when testing a single variable against
 * multiple discrete values. It is more optimized than if-statements as it uses the jump tables for fast lookup of defined cases in switch.*/

class switchStatement{
  public static void main(String[] args){
    int marks = 80;
    String message ="";
    switch(marks){
      case 60:
        message = "Scored 'B' Grade.";
        break;
      case 70:
        message = "Scored 'B+' Grade.";
        break;
      case 80:
        message = "Scored 'A' Grade.";
        break;
      case 90:
        message = "Scored 'A+' Grade.";
        break;
      default:
        message = "Need To Work Hard";
        break;
    }
    System.out.println(message);
  }
}