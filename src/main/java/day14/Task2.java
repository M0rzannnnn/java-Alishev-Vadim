package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people");
        parseFileToStringList(file);
        System.out.println(parseFileToStringList(file));
    }
    public static List<String> parseFileToStringList(File file) {
        List<String> guys = new ArrayList<>();
        int error = 0;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] findYear = line.split(" ");
                error = Integer.parseInt(findYear[1]);
                if (error < 0) {
                    throw new IOException();
                }
                guys.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некторректный ввод");
            return null;
        }
        return guys;
    }
}
