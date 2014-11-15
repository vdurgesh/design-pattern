package creational.factory;

public class ProductFactory {
    private static ProductFactory singleton;
    private ProductFactory() {}

    public static ProductFactory getInstance() {
        if(singleton == null) {
            singleton = new ProductFactory();
        }
        return singleton;
    }
    public Product createProduct(String type) {
        if(type.equals("home")) {
            return new HomeProduct(type);
        } else if(type.equals("company")) {
            return new CompanyProduct(type);
        } else {
            return null;
        }
    }
}
