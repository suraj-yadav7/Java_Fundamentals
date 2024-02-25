// Pen class
class Pen{
    String color;
    int requiredPen;
    
    // you can remove public from method, both way method runs without error 
    void write(){
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


// Encapsulation : It means binding data in a single unit.
// Empolyee class
class Empolyee{
    int empId;
    
    void empDetails(int id){
        empId = id;
    }
    
    int sendDetails(){
        return empId;
    }
}

// Abstraction: It also wrapper the data but it hides all important functions and show only need data user.

// Inheritance
/*
class Pencil extends Pen{
    void cost(int price){
        System.out.println("The cost of this pencil is "+price);
    }
    // accessing parent method
    public void brand(){
        super.write();
    }
}
*/

// polymorphism: The word polymorphism means having many forms. So the same person possesses different behaviors in different situations. This is called polymorphism. There are two types of polymorphism 1.Complie Time : Method oerLoading  2.Runtime : Method Overriding
class Poly{
    // Method overloading : compile time
    // method overloading done in witin class but method overriding need different class which extend a class and run at run time
    void add(int a, int b){
        int sum = a+b;
        System.out.println("add sum interger type: "+sum);
    }
    void add(float a, float b){
        float sum = a+b;
        System.out.println("add sum float type: "+sum);
    }
}

// Runtime polymorphism : method overriding
class A{
    void show(){
        System.out.println("runned A class");
    }
}
class B extends A{
    @Override
    void show(){
        System.out.println("runned B class");
    }
}

// This is main class, So it runs everytime when we run the code. The name of class will be same as file name
// because in java it create .class named different file to run the program.
public class _06_oops {
    public static void main(String[] args){
        /*
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.requiredPen = 3;
        pen1.write();
        pen1.penColor();
        pen1.pentype("Gel pen");
        */

        // employee class
        Empolyee emp1 = new Empolyee();
        emp1.empDetails(45);
        System.out.println("val returned: "+ emp1.sendDetails());

        // Poly class
        Poly p1 = new Poly();
        p1.add(2.5f,3.5f);

        // class B 
        B clsB = new B();
        clsB.show();
    }

  

        //  public static void main(String args[]){
        //     Pencil natraj = new Pencil();
        //     natraj.cost(3);

        //  }

}

