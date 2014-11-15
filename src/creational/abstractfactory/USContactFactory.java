package creational.abstractfactory;


public class USContactFactory extends AbstractFactory {

    public USAddress createAddress() {
        return new USAddress();
    }

    public USPhoneNumber createPhoneNumber() {
        return new USPhoneNumber();
    }
}
