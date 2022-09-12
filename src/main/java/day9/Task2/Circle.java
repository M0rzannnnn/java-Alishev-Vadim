package day9.Task2;

import static java.lang.Math.pow;

public class Circle extends Figure {
    public Circle (String color, int radius){
        super (color);
        this.radius = radius;
    }
    int radius;

    @Override
    public double area() {
        return Math.PI*pow(radius,2);
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*radius;
    }
}
