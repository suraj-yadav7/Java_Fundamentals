/** CALL BY VALUE */
/** Java is strictly call-by-value. This means that when you pass an argument to a method, Java always creates a copy of the variable's value and
 * passes that copy into the method. The original variable outside the method never changes its own stored value as a direct result of the call */
class ObjectInDepth{
  public static void main(String[] args){
    int x = 9;
    int y = 6;
    System.out.println("x: "+x+" y: "+ y);
    addExtaVal(x, y);
    System.out.println("after function call, x: "+ x+" y: "+y);
  }

  static void addExtaVal(int x, int y){
    x=x+10;
    y=y+10;
  }
}

/** CALL BY REFERENCE */
/** Java strictly uses call-by-value and does not support true call-by-reference. When you pass an argument to a method,
 * Java always passes a copy of the bits inside that variable. However, the confusion arises because Java handles
 * primitive types and object types differently. */
class ObjectInDepthDemo{
  public static void main(String[] args){
    Random r1 = new Random(4, 5);
    System.out.println("r.x: "+r1.x+" r.y: "+r1.y);
    addNum(r1);
    System.out.println("After function call --> r.x: "+r1.x+" r.y: "+r1.y);
  }

  static void addNum(Random r){
    r.x = r.x+5;
    r.y = r.y+5;
  }
}

class Random{
  int x;
  int y;

  Random(int x, int y){
    this.x = x;
    this.y = y;
  }

  Random(Random r){
    this.x = r.x;
    this.y = r.y;
  }
}