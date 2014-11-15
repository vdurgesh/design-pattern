package creational.abstractfactory;


public class UKContactFactory extends AbstractFactory {

    public AbstractAddress createAddress() {
        return new UKAddress();
    }

    public AbstractPhoneNumber createPhoneNumber() {
        return new UKPhoneNumber();
    }
}
