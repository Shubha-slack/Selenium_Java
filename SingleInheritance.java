package Shubhadip.AxisBank;

//Superclass//Parent Class
class Vehicle {
 void start() {
     System.out.println("Vehicle is starting");
 }
 
 void stop() {
     System.out.println("Vehicle is stopping");
 }
}

//Subclass//Child Class

class Car extends Vehicle {
 void honk() {
     System.out.println("Car is honking");
 }
}
class Bike extends Vehicle {
    void rev() {
        System.out.println("Bike is revving"); // Child Class no 2
    }
}

//Main class
public class SingleInheritance {
 public static void main(String[] args) {
     Car car = new Car();
     Bike bike = new Bike();
     bike.rev();              // instance of Car
     car.start();         // Calling method from Vehicle superclass
     car.honk();          // Calling method from Car subclass
     car.stop();          // Calling method from Vehicle superclass
 }
}
