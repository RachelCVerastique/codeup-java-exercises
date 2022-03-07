package shapes;

import util.Input;

public class CircleApp {








    public static void main(String[] args) {
        Input input = new Input();
        double radius = input.getDouble();
        Circle circle1 = new Circle(radius);
    }

}
