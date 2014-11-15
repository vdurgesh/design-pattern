package creational.singleton;

/*
#Lazy instantiation using double locking mechanism.
    The standard implementation for singleton is a thread safe implementation,
    but it's not the best thread-safe implementation beacuse synchronization
    is very expensive when we are talking about the performance. We can see that
    the synchronized method getInstance does not need to be checked for syncronization
    after the object is initialized. If we see that the singleton object is already
    created we just have to return it without using any syncronized block.
    This optimization consist in checking in an unsynchronized block if the object is null
    and if not to check again and create it in an syncronized block.
    This is called double locking mechanism.
*/
public class LazyDoubleLockingSingleton {
    private static LazyDoubleLockingSingleton instance;

    private LazyDoubleLockingSingleton() {
        System.out.println("LazyDoubleLockingSingleton(): Initializing Instance");
    }

    public static LazyDoubleLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (LazyDoubleLockingSingleton.class) {
                if (instance == null) {
                    System.out.println("getInstance(): First time getInstance was invoked!");
                    instance = new LazyDoubleLockingSingleton();
                }
            }
        }

        return instance;
    }

    public void config() {
        System.out.println("config(): LazyDoubleLockingSingleton does configuration!");
    }
}
