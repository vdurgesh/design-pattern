package creational.factory;

public class Client {
    public static void main(String args[]) {
        ProductFactory productFactory = ProductFactory.getInstance();
        Product home = productFactory.createProduct("home");
        System.out.println(home.getName());
        Product company = productFactory.createProduct("company");
        System.out.println(company.getName());
    }
}
