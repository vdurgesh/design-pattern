package behavioral.visitor;


public class CarElementPrintVisitor implements CarElementVisitor {
    public void visit(Wheel wheel) {
        System.out.println("visiting...wheel " + wheel.getName());
    }

    public void visit(Engine engine) {
        System.out.println("visiting...engine ");
    }

    public void visit(Body body) {
        System.out.println("visiting...body ");
    }

    public void visit(Car car) {
        System.out.println("visiting...car");
    }
}
