package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people");
        parseFileToObjList(file);
        System.out.println(parseFileToObjList(file));
    }
    public static List<Human> parseFileToObjList(File file) {
        List<Human> guys = new ArrayList<>();
        int year;
        try {
            Scanner s = new Scanner(file);
            while (s.hasNextLine()) {
                String line = s.nextLine();
                String[] worldsLine = line.split(" ");
                year = Integer.parseInt(worldsLine[1]);
                if (year < 0) {
                    throw new IOException();
                }
                guys.add(new Human(worldsLine[0], year));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некторректный ввод");
        }
        return guys;
    }
}
