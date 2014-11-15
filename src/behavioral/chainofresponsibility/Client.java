package behavioral.chainofresponsibility;

public class Client {

    public static void main(String[] args) {
        // Setup Chain of Responsibility
        Handler h1 = new FirstConcreteHandler();
        Handler h2 = new SecondConcreteHandler();
        Handler h3 = new ThirdConcreteHandler();
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        // Send requests to the chain
        h1.handleRequest(new Request("Negative Value ", -1));
        h1.handleRequest(new Request("Negative Value ",  0));
        h1.handleRequest(new Request("Negative Value ",  1));
        h1.handleRequest(new Request("Negative Value ",  2));
        h1.handleRequest(new Request("Negative Value ", -5));
    }
}
