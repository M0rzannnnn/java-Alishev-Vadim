package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test1");
        printSumDigits(file);
    }
    public static void printSumDigits (File file){
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            int sum = 0;
            String[] numbersString = line.split(" ");
            int[] numbers = new int [10];
            int x = 0;
            if (numbers.length != 10){
                throw new IOException();
            }

            for (String numb: numbersString) {
                numbers[x++] = Integer.parseInt(numb);
            }
            for (int numb2 :numbers) {
                sum= sum + numb2;
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}
