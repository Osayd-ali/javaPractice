package Presentation;
// Main.java
public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Toyota", "Corolla", 2021);
        Vehicle myBike = new Bike("Yamaha", "MT-07", 2020);

        myCar.drive();
        myBike.drive();

    }
}

