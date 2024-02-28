// A interface in java
interface driving{
    // abstact method means method without body.
    void automatic(String color);
    void manual();

    // properties 
    String modelName="scorpio";
    int modelYear = 2023;
}

//A class that implements a interface
class Car implements driving{
    // All method must have public befor method name in interface
    public void automatic(String color){
        System.out.println("This car is automatic with power stering: "+color);
    }
    public void manual(){
        System.out.println("Manual car are good it helps user to beome good at driving");
    }

    // this Class can also contain independent method and can use interface properties like "modelYear"
    void electric(){
        System.out.println("Electic vehicles are good for environment "+modelYear);
    }
}

public class _09_interface {
    public static void main(String args[]){
        Car c1 = new Car();
        c1.manual();
        c1.automatic("Black");
        c1.electric();
    }        
}
