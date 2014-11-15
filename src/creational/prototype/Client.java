package creational.prototype;


public class Client {

    public static void main(String [] args) {
        ShapeCache.loadCache();

        ShapeProtoType clonedShape = ShapeCache.getShape("c");
        clonedShape.draw();

        ShapeProtoType clonedShape2 = ShapeCache.getShape("r");
        clonedShape2.draw();

        ShapeProtoType clonedShape3 =  ShapeCache.getShape("s");
        clonedShape3.draw();
    }
}
