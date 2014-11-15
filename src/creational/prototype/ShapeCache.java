package creational.prototype;

import java.util.Hashtable;

public class ShapeCache {

    private static Hashtable<String, ShapeProtoType> shapeMap
            = new Hashtable<String, ShapeProtoType>();

    public static ShapeProtoType getShape(String shapeId) {
        ShapeProtoType cachedShape = shapeMap.get(shapeId);
        return (ShapeProtoType) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        shapeMap.put(circle.getCode(),circle);

        Square square = new Square();
        shapeMap.put(square.getCode(),square);

        Rectangle rectangle = new Rectangle();
        shapeMap.put(rectangle.getCode(),rectangle);
    }
}