package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add ("Иж");
        list1.add ("Mini");
        list1.add ("Aston Martin");
        list1.add ("Нива");
        list1.add ("Nissan");
        System.out.println(list1);
        list1.add (3, "Lada");
        System.out.println(list1);
        list1.remove (0);
        System.out.println(list1);
    }
}