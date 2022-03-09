package shapes;

public class Square extends Rectangle {
    //constructor
    public Square(double side) {
        super(side,side);
    }
    //setters
    public void setLength(double side) {
        this.length = side;
    }

    public void setWidth(double side) {
        this.width = side;
    }

    //methods

    @Override
    public double getArea() {
        double side = this.width;
        System.out.println("override");
        return side * side;
    }

    @Override
    public double getPerimeter() {
        double side = this.length;
        System.out.println("override");
        return side *4;
    }




}
