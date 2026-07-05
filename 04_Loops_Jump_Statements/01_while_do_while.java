/** WHILE And DO-WHILE LOOP */
/** In Java, while and do-while loops are control flow structures used to execute a block of code repeatedly based on a boolean condition.
 * The core difference lies in when the condition is evaluated: a while loop checks the condition before executing the body,
 * whereas a do-while loop checks it after the body runs. */

class whileLoops{
  public static void main(String[] args){
    // While loop
    int i=1;
    while(i<=10){
      System.out.println("i: "+ i);
      i++;
    }

    // Do-While loop
    int j = 1;
    do{
      System.out.println("j: "+j);
      j++;
    }while(j<=5);
  }
}