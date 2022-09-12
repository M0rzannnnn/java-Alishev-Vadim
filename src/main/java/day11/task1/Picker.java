package day11.task1;

public class Picker extends Warehouse implements Worker {
    private int salary;
    private int isPayed;

    public Picker(int salary,int isPayed){
        this.isPayed = isPayed;
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }

    public int getIsPayed() {
        return isPayed;
    }
    public String toString(){
        return "Заработная плата сборщика:" + getSalary() + ", премия:" + getIsPayed();
    }
    public void doWork(){
        salary += 80;
        if (countPickOrders<10000){
            countPickOrders++;
        }
    }

    @Override
    public void bonus() {
        if (countPickOrders >= 10000){
            isPayed += 70000;
        }
        else if(isPayed==70000){
            System.out.println("Бонус уже выплачен");
            return;
        }
        else {
            System.out.println("Бонус пока недоступен");
            return;
        }
        return;
    }
}
