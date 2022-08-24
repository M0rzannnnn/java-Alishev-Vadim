package day4;


import java.util.Random;
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        int x = 0;
        int y = 0;
        int z = 0;
        int m = 0;
        for (int i:arr) {
            Random random = new Random();
            arr[i] = random.nextInt(11);
            if(arr[i]==9) {
                x++;
                m++;
            }else if(arr[i]==10){
                x++;
                z++;
            } else if(arr[i]==1){
                y++;
                m++;
            } else if(arr[i] % 2 == 0) {
                z++;
            } else if(arr[i] % 2 != 0){
                m++;
            }
            System.out.print(arr[i] + " ");
            sum = sum + arr[i];
        }
        System.out.println();
        System.out.println("Информация о массиве:");
        System.out.println();
        System.out.println("Сумма всех чисел в массиве - "+sum);
        System.out.println("Длина массива - "+arr.length);
        System.out.println("Количество элементов массива больше 8 - "+x);
        System.out.println("Количество элементов массива равных 1 - "+y);
        System.out.println("Количество четных элементов массива - "+z);
        System.out.println("Количество нечетных элементов массива - "+m);
        }
    }
