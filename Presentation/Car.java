package Presentation;

// Car.java
public class Car extends AbstractVehicle {
    public Car(String make, String model, int year) {
        super(make, model, year);
    }
    public void wheels(){
        System.out.println("Car has 4 wheels.");
    }
    // Car-specific functionality can be added here
}


