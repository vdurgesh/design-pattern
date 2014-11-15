package behavioral.chainofresponsibility;


public class SecondConcreteHandler extends Handler {

    public void handleRequest(Request request) {
        if (request.getValue() > 0) {
            //if request is eligible handle it
            System.out.println("Negative values are handled by SecondConcreteHandler:");
            System.out.println("\tSecondConcreteHandler.HandleRequest : " + request.getDescription()
                    + request.getValue());
        } else {
            successor.handleRequest(request);
        }
    }
}
