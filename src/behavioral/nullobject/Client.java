package behavioral.nullobject;


public class Client {

    public static void main(String[] args) {
        LogOperation logOperation = new LogOperation();
        Operation operation = new Operation("Some", "thing");
        logOperation.log(operation);

        NullLogOperation nullLogOperation = new NullLogOperation();
        nullLogOperation.log(operation);
    }
}
