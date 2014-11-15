package creational.builder;

public class Client {
    public static void main(String args[]){
        Car car  = new CarBuilder()
                .withSeats(5)
                .withCityCar()
                .withCabriolet()
                .withSportCar()
                .withTripComputer()
                .withGPS().build();
        System.out.println(car);
    }
}
