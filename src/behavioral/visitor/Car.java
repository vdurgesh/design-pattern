package behavioral.visitor;


import java.util.ArrayList;
import java.util.List;

public class Car implements CarElement {
    private List<CarElement> elements;
    public Car() {
        this.elements = new ArrayList<CarElement>();
        this.elements.add(new Wheel("front left"));
        this.elements.add(new Wheel("front right"));
        this.elements.add(new Wheel("back left"));
        this.elements.add(new Wheel("back right"));
        this.elements.add(new Body());
        this.elements.add(new Engine());
    }

    public void accept(CarElementVisitor visitor) {
        for(CarElement elem : elements) {
            elem.accept(visitor);
        }
        visitor.visit(this);
    }
}
