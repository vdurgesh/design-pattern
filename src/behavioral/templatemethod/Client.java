package behavioral.templatemethod;


public class Client {
    public static void main(String args[]) {
        Trip trip = new DisneyTrip();
        trip.performTrip();
        trip = new UniversalStudioTrip();
        trip.performTrip();
        trip = new SeaworldTrip();
        trip.performTrip();
    }
}
