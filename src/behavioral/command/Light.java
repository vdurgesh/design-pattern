package behavioral.command;

public class Light {
    private boolean on;

    public void switchOn() {
        System.out.println("Light On.");
        on = true;
    }

    public void switchOff() {
        System.out.println("Light Off.");
        on = false;
    }
}
