package day8;

public class Task1 {
    public static void main(String[] args) {
        long startTime1 = System.currentTimeMillis();
        StringBuilder SgBr = new StringBuilder("0");
        for (int i = 1; i <= 20000; i++) {
            SgBr.append(" ").append(i);
        }
        System.out.println(SgBr);
        long stopTime1 = System.currentTimeMillis();
        System.out.println();
        System.out.println("Длительность работы в мс:" + (stopTime1 - startTime1));
        System.out.println();
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i <=20000; i++) {
            String string1 = i + " ";
            System.out.print(string1);
        }
        long stopTime2 = System.currentTimeMillis();
        System.out.println("\n Длительность работы в мс:" + (stopTime2 - startTime2));
    }
}
