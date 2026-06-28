/** VARIABLE */
/** In Java, a variable is a data container that stores data values during the execution of a program.
  Every variable is assigned a data type which determines its memory size and the kind of value it can hold. */

class variable{
  public static void main(String[] args){
    //Integer Values
    byte  a   = 127;
    short num = 28;
    int   val = 11;
    long  amount = 32094;

    //Real Number
    float b = 3.6f;
    double result = 432.51;

    //Character
    char var = 's';

    //Boolean
    boolean isTrue = true;

    System.out.println("byte: "+ a);
    System.out.println("short: "+ num);
    System.out.println("int: "+ val);
    System.out.println("long: "+ amount);

    System.out.println("float: "+b);
    System.out.println("double: "+result);

    System.out.println("char: "+ var);
    System.out.println("boolean: "+isTrue);
  }
}