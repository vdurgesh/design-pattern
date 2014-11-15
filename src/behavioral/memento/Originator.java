package behavioral.memento;


public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        System.out.println("Originator.set(state) to " + state);
        this.state = state;
    }

    public Memento save() {
        System.out.println("Originator.save() to Memento.");
        return new Memento(state);
    }

    public void restore(Memento memento) {
        System.out.println("Originator.restore() from Memento.");
        state = memento.getState();
    }
}
