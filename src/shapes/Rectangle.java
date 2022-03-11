package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    void setWidth(double width) {
        this.width = width;
    }


    //    //properties
//    protected double length;
//    protected double width;
//
//    //constructor
//    public Rectangle(double width, double length) {
//        this.width = width;
//        this.length = length;
//    }
//
//
//    // methods
//    public double getArea() {
//        return length * width;
//    }
//
//    public double getPerimeter() {
//        return (2 * length) + (2 * width);
//    }
//
//    public double getLength() {
//        return length;
//    }
//
//    public void setLength(double length) {
//        this.length = length;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public void setWidth(double width) {
//        this.width = width;
//    }
}
