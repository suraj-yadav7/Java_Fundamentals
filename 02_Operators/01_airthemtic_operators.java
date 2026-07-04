/** AIRTHMETIC OPERATORS */
/**
 * Arithmetic operators in Java are standard mathematical symbols used to perform calculations like
 * addition, subtraction, multiplication, division, and remainder handling on numeric primitive data types.
 */
class arithmetic{
  public static void main(String[] args){
    int i=20;
    int j=10;

    int sum = i+j;
    int sub = i-j;
    int mul = i*j;
    int div = i/j;

    System.out.println("Sum: "+sum+" Sub: "+sub+" Mul: "+mul+" Div: "+div);

    //Short hand method of arithmetic
    int a=5;
    int b = 7;
    a+=1;
    b-=1;
    a*=a;
    b/=b;
    System.out.println("a: "+a+" b: "+b);

    //Increment and Decrement
    int x=1;
    int y=2;
    x++;
    y++;
    ++x;
    ++y;
    System.out.println("x: "+x+" y: "+y);

    // Pre-Post: increment and decrement
    int k = x++; // assign x value to k and then increment x by 1
    System.out.println("k: "+k+" x: "+x);
    int p = ++x; // increment x by 1 and then assign to p
    System.out.println("p: "+p+" x: "+x);
  }
}