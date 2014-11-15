package creational.abstractfactory;

public class Client {

    public static void main(String args[]) {
        AbstractFactory usFactory = AbstractFactory.getInstance("US");
        System.out.println(usFactory.createAddress().getFormattedAddress());
        System.out.println(usFactory.createPhoneNumber().getFormattedPhoneNumber());
        AbstractFactory ukFactory = AbstractFactory.getInstance("UK");
        System.out.println(ukFactory.createAddress().getFormattedAddress());
        System.out.println(ukFactory.createPhoneNumber().getFormattedPhoneNumber().toString());
    }
}
