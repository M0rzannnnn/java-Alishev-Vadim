package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (0 < a && a < 5) {
            System.out.println("Small house");
        } else if (4 < a && a < 9) {
            System.out.println("Middle house");
        } else if (a >= 9) {
            System.out.println("Big house");
        } else {
            System.out.println("Uncorrect info");
        }
    }
}
