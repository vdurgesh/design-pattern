package behavioral.nullobject;


public class LogOperation implements Log {

    public void log(Operation operation) {
        if(null == operation) {
            System.out.println("Operation is null");
        } else {
            System.out.println("Operation Name:" + operation.getName());
            System.out.println("Operation Domain:" + operation.getDomain());
        }
    }
}
