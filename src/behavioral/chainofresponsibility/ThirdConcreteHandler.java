package behavioral.chainofresponsibility;

public class ThirdConcreteHandler extends Handler {
    public void handleRequest(Request request) {
        if (request.getValue() >=  0) {
            //if request is eligible handle it
            System.out.println("Negative values are handled by ThirdConcreteHandler:");
            System.out.println("\tThirdConcreteHandler.HandleRequest : " + request.getDescription()
                    + request.getValue());
        } else {
            successor.handleRequest(request);
        }
    }
}
