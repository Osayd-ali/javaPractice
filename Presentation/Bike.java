package Presentation;

// Bike.java
public class Bike extends AbstractVehicle {
    public Bike(String make, String model, int year) {
        super(make, model, year);
    }

    public void wheels() {
        System.out.println("Bike has 2 wheels");
    }
    // Bike-specific functionality can be added here
}

