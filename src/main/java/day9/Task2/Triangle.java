package day9.Task2;
import static java.lang.Math.*;

public class Triangle extends Figure {
    public Triangle (String color, int long1, int long2, int long3){
        super (color);
        this.long1 = long1;
        this.long2 = long2;
        this.long3 = long3;
    }
    double long1;
    double long2;
    double long3;
    @Override
    public double perimeter() {
        return long1+long2+long3;
    }
    @Override
    public double area() {
        double p = (long1 + long2 + long3) / 2;
        return Math.sqrt(p*(p-long1)*(p-long2)*(p-long3));
    }
}
