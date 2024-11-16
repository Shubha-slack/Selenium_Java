package Shubhadip.AxisBank;

public class MethodOverriding {
    public static void main(String[] args) {
        Carr car1 = new Carr();
        car1.speed();

        Vehiclee vehicle1 = new Vehiclee();
        vehicle1.speed();

        Vehiclee vehicle2 = new Vehiclee();
        vehicle2.speed(); 
    }
}

class Vehiclee {
    void speed() {
        System.out.println("The vehicle is moving at 60 km/h");
    }
}

class Carr extends Vehicle {
    void speed() {
        System.out.println("The car is moving at 100 km/h");
    }
}

