package creational.builder;

public class Car {
    int seats = 0;
    boolean cityCar = false;
    boolean cabriolet = false;
    boolean sportCar = false;
    boolean tripComputer = false;
    boolean gps = false;

    public String toString() {
        return "This is a Car with " + seats + " seats," +
                "\nCity car = " + cityCar +
                "\nCabriolet = " + cabriolet +
                "\nSportCar = " + sportCar +
                "\nTripComputer = " + tripComputer +
                "\nGPS = " + gps;
    }
}