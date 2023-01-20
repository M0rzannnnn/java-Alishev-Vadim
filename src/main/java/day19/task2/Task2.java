package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("taxi_cars.txt");
        Map<Integer, Point> map = new HashMap<>();
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String[] stringNumbers = sc.nextLine().split(" ");
            int[] numbers = new int[3];
            int i = 0;
            for (String str : stringNumbers) {
                numbers[i] = Integer.parseInt(str);
                i++;
            }
            map.put(numbers[0], new Point(numbers[1], numbers[2]));
        }
        sc.close();

        for (Map.Entry<Integer, Point> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите координаты квадрата");

        int x1 = sc2.nextInt();
        int y1 = sc2.nextInt();
        int x2 = sc2.nextInt();
        int y2 = sc2.nextInt();

        Iterator<Map.Entry<Integer, Point>> itr = map.entrySet().iterator();
        int counter = 0;
        while (itr.hasNext()) {
            Map.Entry<Integer, Point> test = itr.next();
            int x = test.getValue().getX();
            int y = test.getValue().getY();

            if (x1 > x2 && y1 > y2) {
                if (x2 < x && x < x1 && y2 < y && y < y1) {
                    System.out.print(test.getKey() + " ");
                    counter++;
                }
            }
            else if (x1 > x2){
                if (x2 < x && x < x1 && y1 < y && y < y2) {
                    System.out.print(test.getKey()+ " ");
                    counter++;
                }
            }
            else if (y1 > y2) {
                if (x1 < x && x < x2 && y2 < y && y < y1) {
                    System.out.print(test.getKey()+ " ");
                    counter++;
                }
            }
            else {
                if (x1 < x && x < x2 && y1 < y && y < y2) {
                    System.out.print(test.getKey()+ " ");
                    counter++;
                }
            }
        }
        System.out.println();
        System.out.println("Количество машин в квадрате:" + counter);
    }
}
