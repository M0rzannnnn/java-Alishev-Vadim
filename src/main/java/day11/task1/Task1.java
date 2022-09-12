package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();

        Worker worker1 = new Picker(0, 0);
        Worker worker2 = new Courier(0, 0);


        businessProcess(worker1);
        businessProcess(worker2);
        System.out.println(warehouse1);
        System.out.println(worker1);
        System.out.println(worker2);
        Warehouse warehouse2 = new Warehouse();
        Picker picker = new Picker(0, 0);
        Courier courier = new Courier(0,0);
        picker.doWork();
        courier.doWork();
        System.out.println(warehouse2);
        System.out.println(worker1);
        System.out.println(worker2);
    }
    public static void businessProcess(Worker worker){
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
