package day6;

public class Task1 {
    public static void main(String[] args) {
        Car BMW = new Car();
        Motorbike Yamaha = new Motorbike("MT-10", "Yellow", 2015);
        BMW.setModel("X6");
        BMW.setColor("Black");
        BMW.setYear(2015);
        BMW.info();
        Yamaha.info();
        System.out.println(BMW.yearDifference(1980));
        System.out.println(Yamaha.yearDifference(2005));

    }
}
