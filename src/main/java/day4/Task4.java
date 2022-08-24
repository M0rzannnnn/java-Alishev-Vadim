package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rdm = new Random();
        int[] arr= new int [100];
        for(int i = 0; i < arr.length; i++)
            arr[i] = rdm.nextInt(10000);
        int maxSum = 0;
        int index = 0;
        for(int i=0;i <= arr.length - 3; i++){
            int sum = 0;
            for(int j = i; j< i+3; j++){
                sum = sum + arr[j];
                if (sum>maxSum){
                    maxSum=sum;
                    index = i;
                }
            }
        }
        System.out.println(maxSum);
        System.out.println(index);
    }
}
