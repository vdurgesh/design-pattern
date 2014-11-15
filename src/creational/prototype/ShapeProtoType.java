package creational.prototype;

public abstract class ShapeProtoType implements Cloneable {

    protected String code;
    protected String type;

    public String getType(){
        return type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public void draw() {
        System.out.println("on "+type+".draw()");
    }
}