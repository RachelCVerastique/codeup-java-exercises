package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{

    //properties
    protected double length;
    protected double width;


    //constructor
    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

     //getters and setters

    public double getLength() {
        return length;
    }

    public abstract void setLength(double length);

    public double getWidth() {
        return width;
    }

    abstract void setWidth(double width);
}
