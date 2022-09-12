package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Random rdn = new Random();
        for(int i = 0; i< arr.length; i++)
            arr[i] = rdn.nextInt(10000);
        int min = 10000;
        int max = 0;
        int z = 0;
        int sum = 0;
        for(int i:arr){
            if (i < min)
                min = i;
            if (i > max)
                    max = i;
            if (i % 10 == 0)
                    z++;
            if (i % 10 == 0)
                sum = sum + i;
        }
            System.out.println("Минимальное число - "+min);
            System.out.println("Максимальное число - "+max);
            System.out.println("Количество элеметнов оканчивающихся на 0 - "+z);
            System.out.println("Сумма всех элементов, оканчивающихся на 0 - "+sum);
    }
}
