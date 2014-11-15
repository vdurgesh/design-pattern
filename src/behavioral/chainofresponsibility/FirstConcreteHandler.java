package behavioral.chainofresponsibility;


public class FirstConcreteHandler extends Handler {

    public void handleRequest(Request request) {
        if (request.getValue() < 0) {
            //if request is eligible handle it
            System.out.println("Negative values are handled by FirstConcreteHandler:");
            System.out.println("\tFirstConcreteHandler.HandleRequest : " + request.getDescription()
                    + request.getValue());
        } else {
            successor.handleRequest(request);
        }
    }
}
