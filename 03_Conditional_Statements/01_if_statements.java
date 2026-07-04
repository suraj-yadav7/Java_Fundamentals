/** IF STATEMENTS */
// if, if-else, if-else-if ladder
/** Conditional statements in Java control the execution flow of code based on specific boolean criteria.
 * Java uses if, else, and else if blocks to evaluate test conditions that must strictly return a boolean value (true or false). */

class ifStatements{
  public static void main(String[] args){
    int age = 20;
    if(age>18){
      System.out.println("Eligible to Vote and Drive");
    }else{
      System.out.println("Not Eligible to Vote and Drive");
    }

    boolean a = true;
    if(a==true){
      if(age>20 && age < 30){
        System.out.println("Required to update biometic of Aadhar and Link VoterId with Aadhar.");
      }else if(age > 30 && age <40){
        System.out.println("Required to update BioMetric of Aadhar.");
      }else if(age > 40 && age < 50){
        System.out.println("Required to Link VoterId with Aadhar.");
      }else{
        System.out.print("Not Required.");
      }
    }
  }
}