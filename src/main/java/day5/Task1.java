package day5;

public class Task1 {
    public static void main(String[] args) {
        Car Mini = new Car();
        Mini.setModel("Country Man");
        Mini.setColor("Red");
        Mini.setYear(2013);
        System.out.println("Модель Mini " + Mini.getModel() + " Цвета " + Mini.getColor()+ " " + Mini.getYear() + " года");
    }
}
