package Presentation;

// AbstractVehicle.java
public abstract class AbstractVehicle implements Vehicle {
    private String make;
    private String model;
    private int year;

    public AbstractVehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public void start() {
        System.out.println("Starting the " + year + " " + make + " " + model);
    }

    @Override
    public void stop() {
        System.out.println("Stopping the " + year + " " + make + " " + model);
    }

    public void drive(){
        this.start();
        System.out.println("Driving....");
        this.stop();
    }
    public abstract void wheels();
    // Additional common methods or properties can be added here
}

