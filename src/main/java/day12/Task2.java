package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();

        numbers(list1);
    }
    public static void numbers (List<Integer> list){
        for (int i = 0; i < 31; i++) {
            if (i%2==0){
                list.add(i);
            }
        }
        for (int i = 300; i < 351; i++) {
            if (i%2==0){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
