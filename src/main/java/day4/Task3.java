package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int [][] array = new int[12][8];
        Random ran = new Random();
        for(int i = 0; i < array.length; i++){
            for(int x = 0; x < array[i].length; x++){
                array[i][x] = ran.nextInt(50);
            }
        }
        int maxSum = 0;
        int index = 0;
        for(int i = 0; i < array.length; i++){
            int sum = 0;
            for(int x = 0; x < array[i].length; x++){
                sum += array[i][x];
            }
            if(sum >= maxSum){
                maxSum = sum;
                index = i;
            }
        }
        System.out.println(index);

    }
}
