package behavioral.observer;


public class Bidder implements Observer {
    private String name;
    private Subject auction;

    public Bidder(String name, Subject auction) {
        this.name = name;
        this.auction = auction;
        auction.addObserver(this);
    }

    public void update(Object newState) {
        Bid latestBid = (Bid) newState;
        display(latestBid);
    }

    public void display(Bid latestBid) {
        System.out.println("Notified "+ name +" for the latest bid: " + latestBid);
    }
}
