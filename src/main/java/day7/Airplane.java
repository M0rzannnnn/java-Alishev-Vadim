package day7;

public class Airplane {
    private String manufacture;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public void setFuel(int fuel){
        this.fuel = fuel;
    }
    public int getFuel(){
        return fuel;
    }
    public Airplane(String manufacture, int year, int length, int weight){
        this.manufacture = manufacture;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }
    public void info(){
        System.out.println("������������:" + manufacture + " ��� �������:" + year + " �����:" + length + " ���:" + weight + " ���������� ������� � ����:" + fuel);
    }
    public void fillUp (int n){
        fuel = fuel +n;
    }
    public static void compareAirplanes (Airplane SU25, Airplane SU35){
        int x = Integer.compare(SU25.length,SU35.length);
        if (x>0) {
            System.out.println("��25 �������, ��� ��35");
        }
        else if(x == 0) {
                System.out.println("��25 ����� �� �����, ��� � ��35");
            }
        else if (x<0){
                System.out.println("��35 ������, ��� ��25");
            }
    }

}
