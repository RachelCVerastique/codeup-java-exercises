package shapes;

public class ShapesTest {

    public static void main(String[] args) {

    Quadrilateral myShape = new Rectangle(10, 10);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        myShape = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getLength());



        //        Rectangle box1 = new Rectangle(4,5);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());
   }

}
