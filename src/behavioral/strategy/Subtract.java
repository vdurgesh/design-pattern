package behavioral.strategy;

public class Subtract implements Strategy {

    public int execute(int a, int b) {
        System.out.println("Subtract.execute()...");
        return a - b;
    }
}
