/** INNER CLASS */
/**
 * A Member Inner Class (also known as a regular inner class) is a non-static class defined directly inside the body of an outer class,
 * outside of any method or block. It operates as a non-static member of the outer class, meaning it is intrinsically tied to a
 * specific instance of that outer class. It directly access all fields and methods of its enclosing outer class,
 * including those marked as private. It inherits this access because it holds an implicit hidden reference to the outer class.
 */
public class _02_inner_class {

  public static void main(String args[]){
    Outer outer = new Outer();
    Outer.Inner inner = outer.new Inner();
    inner.getValue();
  }
}

class Outer{
  private int x = 10;

  class Inner{
    int x = 20;
    public void getValue(){
      System.out.println("Inner X: "+ x);
      System.out.println("Outer X: "+ Outer.this.x);
    }
  }
};