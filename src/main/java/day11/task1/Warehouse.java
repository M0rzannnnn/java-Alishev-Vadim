package day11.task1;

public class Warehouse {
    public static int countPickOrders;
    public static int countDeliveredOrders;
    public int getCountPickOrders() {
        return countPickOrders;
    }
    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public String toString(){
        return "���������� ��������� ������� �����: " + getCountPickOrders() + ", ���������� ������������ ������� �����: " + getCountDeliveredOrders();
    }
}
