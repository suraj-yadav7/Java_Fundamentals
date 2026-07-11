/** FUNCTIONS */
/** In Java, functions are known as methods. Because Java is a strictly object-oriented programming language,
 * every block of code must exist inside a class; there are no independent, standalone functions like in C++ or Python */
class functionInJava{
  static void infoToUser(){
    System.out.println("Functions in java programming");
  };

  static int sum(int i, int j){
    int add = i+j;
    return add;
  };

  public static void main(String[] args){
    // Call above functions //
    infoToUser();
    int sumResult = sum(10, 20);
    System.out.println("Sum: "+sumResult);
  }
};

class variableInFun{
  //Global Scope Variable
  static int a = 3;
  static int b = 9;
  public static void main(String[] args){
    //Blocked Scope Variable
    int num1 = 5;
    int num2 = 10;
    System.out.println("substract: "+(num2-num1));

    double add = a*b;
    System.out.println("Global Variable Access: "+add);
  };

  static double airthmeticOps(){
    if(b>a){
      double div = b/a;
      return div;
    }else{
      double mod = b%2;
      return mod;
    }
  };
}