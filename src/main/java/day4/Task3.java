package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args){
        Random rdn = new Random();
        int[][] arr = new int [12][8];
        int max = 0;
        int indexMax = 0;
        for(int i=0;i<12;i++) {
            int sum=0;
            for (int y = 0; y <8; y++){
                arr[i][y] = rdn.nextInt(50);
                sum=sum+arr[i][y];
            }
            if (sum>=max){
                max=sum;
                indexMax=i;
            }
        }
        System.out.println(indexMax);
    }
}
