package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double alpha;
        double beta;
        while (true) {
            alpha = s.nextDouble();
            beta = s.nextDouble();
            if (beta == 0)
                break;
            System.out.println(alpha / beta);

        }
    }
}
