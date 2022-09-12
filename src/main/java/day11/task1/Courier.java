package day11.task1;

public class Courier extends Warehouse implements Worker {
    private int salary;
    private int isPayed;

    public Courier(int salary,int isPayed){
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
        return "Заработная плата курьера:" + getSalary() + ", премия:" + getIsPayed();
    }

    @Override
    public void doWork() {
        salary+= 100;
        if (countDeliveredOrders<10000){
            countDeliveredOrders++;
        }
    }

    @Override
    public void bonus() {
        if (countDeliveredOrders >= 10000){
            isPayed += 50000;
        }
        else if (isPayed == 50000){
            System.out.println("Бонус уже выплачен");
        }
        else {
            System.out.println("Бонус пока не доступен");
        }
    }
}

