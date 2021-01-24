package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random ran = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = ran.nextInt(1000);
        }
        int zero = 0;
        int sumZero = 0;
        for(int x:array) {
            if(x % 10 == 0){
                zero++;
                sumZero = sumZero + x;
            }
        }
        int min = array[0];
        for(int y:array) {
            if(y < min){
                min = y;
            }
         }
        int max = array[0];
        for(int y:array) {
            if(y > max){
                max = y;
            }
        }
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива оканчивающихся на 0: " + zero);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sumZero);
        }
    }

