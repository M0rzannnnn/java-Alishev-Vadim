package day6;

public class Motorbike {
    private String model;
    private String color;
    private int year;
    public void info(){
        System.out.println("Это Мотик");
    }
    public int yearDifference (int inputYear) {
        int x = inputYear - year;
        if( x < 0 ){
            x = -x;
        }
        else if (x>0){
            return x;
        }
        return x;
    }
    public Motorbike(String model, String color, int year){
        this.model = model;
        this.color = color;
        this.year = year;
    }
    public String getModel(){
        return this.model;
    }
    public String getColor(){
        return this.color;
    }
    public int getYear(){
        return this.year;
    }
}
