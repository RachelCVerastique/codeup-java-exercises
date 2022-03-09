package shapes;

public class Rectangle {
    //properties
    protected double length;
    protected double width;

    //constructor
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }


    // methods
    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
