package behavioral.strategy;

public class Add implements Strategy {

    public int execute(int a, int b) {
        System.out.println("Add.execute()...");
        return a + b;
    }
}
