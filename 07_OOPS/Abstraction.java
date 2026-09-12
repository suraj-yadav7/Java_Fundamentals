/** ABSTRACTION */
/**
 * Abstraction in Java is the process of hiding internal implementation details and showing only the
 * essential functionality to the user. It focuses on what an object does rather than how it does it.
 */

public class Abstraction {
  public static void main(String[] args) {
        Car car = new FuelCar();
        car.start();
        car.accelerate();
        car.brake();
    }
};

abstract class Car {
  void start() {
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
      System.out.println("Fuel car is stopping");
  }
};

class ElectricCar extends Car {
  @Override
  void accelerate() {
      System.out.println("Electric car is accelerating");
  }

  @Override
  void brake() {
      System.out.println("Electric car is stopping");
  }
}
