package day9.Task2;

public class Rectangle extends Figure{
    public Rectangle (String color, int height, int width){
        super (color);
        this.height = height;
        this.width = width;
    }
    int height;
    int width;



    @Override
    public double perimeter() {
        return  (height+width)*2;
    }

    @Override
    public double area() {
        return height*width;
    }
}
