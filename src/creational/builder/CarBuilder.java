package creational.builder;

public class CarBuilder {
    int seats = 0;
    boolean cityCar =  false;
    boolean cabriolet = false;
    boolean sportCar = false;
    boolean tripComputer = false;
    boolean gps = false;

    public CarBuilder() {}

    Car build() {
        Car car = new Car();
        car.seats  = this.seats;
        car.cityCar  = this.cityCar;
        car.cabriolet  = this.cabriolet;
        car.sportCar  = this.sportCar;
        car.tripComputer  = this.tripComputer;
        car.gps  = this.gps;
        return car;
    }

    CarBuilder withSeats(int seats) {
        this.seats = seats;
        return this;
    }

    CarBuilder withCityCar() {
        this.cityCar = true;
        return this;
    }

    CarBuilder withCabriolet() {
        this.cabriolet = true;
        return this;
    }

    CarBuilder withSportCar() {
        this.sportCar = true;
        return this;
    }

    CarBuilder withTripComputer() {
        this.tripComputer = true;
        return this;
    }

    CarBuilder withGPS() {
        this.gps = true;
        return this;
    }

}