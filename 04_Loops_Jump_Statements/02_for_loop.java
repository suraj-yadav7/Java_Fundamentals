/** FOR LOOP */
/** A for loop is a control flow statement used to execute a block of code repeatedly when the exact number of iterations is known beforehand.
 * It consolidates initialization, condition testing, and variable updates into a single line, making your code clean and highly readable. */
class forLoop{
  public static void main(String[] args){
    //Standard loop
    int n = 5;
    for(int i=1; i<=n; i++){
      System.out.println("i: " +i);
    }

    //Comma separated loop
    for(int i=1, j=1; i<=10; i++, j+=2){
      int val = i*j;
      System.out.println(i + " * "+j +" = "+ val);
    }

    //Nested loop
    for(int x=1; x<=5; x++){
      for(int y=1; y<=x; y++){
        System.out.println("*");
      }
      System.out.println();
    }

    //Jump Statements in loop : break, continue
    //Break example
    int primeVal = 7;
    int inc=2;
    for(int i=2; i<primeVal; i++){
      inc++;
      if(primeVal%i == 0){
        System.out.println("Number is not a PrimeNumber");
        break;
      }
    }
    if(inc==primeVal){
      System.out.println("Number is Prime: "+ primeVal);
    }

    //Continue example
    for(int j = 1; j<=10; j++){
      if(j%2 == 0){
        continue;
      }
      System.out.println("Odd Num: "+j);
    }

  }
}