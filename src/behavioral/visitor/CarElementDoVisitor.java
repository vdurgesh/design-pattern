package behavioral.visitor;


public class CarElementDoVisitor implements CarElementVisitor {
    public void visit(Wheel wheel) {
        System.out.println("Kicking..my wheel." + wheel.getName());
    }

    public void visit(Engine engine) {
        System.out.println("Starting..engine ");
    }

    public void visit(Body body) {
        System.out.println("Moving...body ");
    }

    public void visit(Car car) {
        System.out.println("Starting my...car");
    }
}
