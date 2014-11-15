package behavioral.observer;

import java.util.ArrayList;

public class Auctioneer implements Subject {
    private ArrayList<Observer> observers;
    private Bid latestBid;

    public Auctioneer() {
        observers = new ArrayList<Observer>();
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(0);
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer obs = observers.get(i);
            obs.update(latestBid);
        }
    }

    public void submitBid(Bid latestBid) {
        System.out.println("Submitting New Bid "+latestBid.toString());
        this.latestBid = latestBid;
        notifyObservers();
    }
}
