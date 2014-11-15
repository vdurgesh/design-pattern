package creational.abstractfactory;

public abstract class AbstractFactory {

    public static AbstractFactory getInstance(String countryCode) {
        if("US".equals(countryCode)) {
            return new USContactFactory();
        } else if("UK".equals(countryCode)) {
            return new UKContactFactory();
        }
        throw new UnsupportedOperationException();
    }
    public abstract AbstractAddress createAddress();
    public abstract AbstractPhoneNumber createPhoneNumber();
}