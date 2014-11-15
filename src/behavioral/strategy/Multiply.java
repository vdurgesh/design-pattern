package behavioral.strategy;

public class Multiply implements Strategy {

    public int execute(int a, int b) {
        System.out.println("Multiply.execute()...");
        return a * b;
    }
}
