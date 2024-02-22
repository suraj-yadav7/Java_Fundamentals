class Pen{
    String color;
    int requiredPen;

    public  void write(){
        System.out.println("I like this pen, it write smoothly");
    }

    public void penColor(){
        System.out.println("The color of pen is "+this.color);
    }

    public void pentype(String valType){
    //    String val = valType;
        System.out.println("I need "+this.requiredPen+" of "+valType);
    }
}

// Inheritance
class Pencil extends Pen{
    // you can write remove public from method, both way method runns without error 
    void cost(int price){
        System.out.println("The cost of this pencil is "+price);
    }
// accessing parent method
    public void brand(){
        super.write();
    }
}



// This is main class, So it runs everytime when we run the code. The name of class will be same as file name
// because in java it create .class named different file to run the program.
public class _06_oops {
    public static void main(String args[]){
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.requiredPen = 3;
        pen1.write();
        pen1.penColor();
        pen1.pentype("Gel pen");
    }

        //  public static void main(String args[]){
        //     Pencil natraj = new Pencil();
        //     natraj.cost(3);

        //  }
}

