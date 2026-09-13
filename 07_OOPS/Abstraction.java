/** ABSTRACTION */
/**
 * Abstraction in Java is the process of hiding internal implementation details and showing only the
 * essential functionality to the user. It focuses on what an object does rather than how it does it.
 */

public class Abstraction {
  public static void main(String[] args) {
    // abstract class object
    Car car = new FuelCar();
    car.start();
    car.accelerate();
    car.brake();

    // interface class object
    Animal human = new Human();
    human.eat();
    human.run();

    Animal cat = new Cat();
    cat.eat();
    cat.run();
  }
};

/** Abstract Class */
abstract class Car {
  void start()  {
    System.out.println("Car started.");
  }

  abstract void accelerate();

  abstract void brake();
};

class FuelCar extends Car {
  @Override
  void accelerate() {
    System.out.println("Fuel car is accelerating");
  }

  @Override
  void brake() {
      System.out.println("Fuel car is stopped.");
  }
};

class ElectricCar extends Car {
  @Override
  void accelerate() {
    System.out.println("Electric car is accelerating");
  }

  @Override
  void brake() {
    System.out.println("Electric car is stopped.");
  }
};

/** Interface */
interface Animal {
  void eat();
  void run();
}

class Human implements  Animal {
  @Override
  public void eat(){
    System.err.println("Human is eating food.");
  };

  @Override
  public  void run(){
    System.out.println("Humans is running.");
  }
};

class Cat implements Animal {
  @Override
  public void eat(){
    System.out.println("Cat is eating meat.");
  }

  @Override
  public void run(){
    System.out.println("Cat is running very fast.");
  }
};