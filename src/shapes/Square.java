package shapes;

public class Square extends Quadrilateral  {

    public Square(int side) {
        super(side, side);
    }



    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    void setWidth(double width) {
        this.width = width;
        this.length = width;
    }


//    //constructor
//    public Square(double side) {
//        super(side,side);
//    }
//    //setters
//    public void setLength(double side) {
//        this.length = side;
//    }
//
//    public void setWidth(double side) {
//        this.width = side;
//    }
//
//    //methods
//
//    @Override
//    public double getArea() {
//        double side = this.width;
//        System.out.println("override");
//        return side * side;
//    }
//
//    @Override
//    public double getPerimeter() {
//        double side = this.length;
//        System.out.println("override");
//        return side *4;
//    }
//
//
//

}
