package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if (a>=b)
            System.out.println("incorrect input");
        for (int i = a+1; i < b; i++) {
            if (i % 5 == 0) {
                if (i % 10 != 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
