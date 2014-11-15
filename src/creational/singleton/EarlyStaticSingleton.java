package creational.singleton;

public class EarlyStaticSingleton {
    private static EarlyStaticSingleton instance = new EarlyStaticSingleton();

    private EarlyStaticSingleton() {
        System.out.println("EarlyStaticSingleton(): Initializing Instance");
    }

    public static EarlyStaticSingleton getInstance() {
        return instance;
    }

    public void doSomething() {
        System.out.println("doSomething(): EarlyStaticSingleton does something!");
    }
}
