package day6;

public class Car {
    private String model;
    private String color;
    private int year;
    public void info(){
        System.out.println("Это автомобиль");
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
    public void setModel(String carModel){
        model = carModel;
    }
    public String getModel(){
        return model;
    }
    public void setColor(String carColor){
        color = carColor;
    }
    public String getColor(){
        return color;
    }
    public void setYear(int carYear){
        year = carYear;
    }
    public int getYear(){
        return year;
    }
}
