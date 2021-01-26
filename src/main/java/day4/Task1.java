package day4;

import java.util.Scanner;
import java.util.Random;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arry = new int[n];
        System.out.println(arry.length);
        Random ran = new Random();
        for(int i = 0; i < arry.length; i++){
            arry[i] = ran.nextInt(10);
        }
        int moreThanEight = 0;
        for(int i = 0; i < arry.length; i++) {
            if (arry[i] > 8) {
                moreThanEight++;
            }
        }
        int evenNumbers = 0;
        for(int i = 0; i < arry.length; i++) {
            if (arry[i] % 2 == 0) {
                evenNumbers++;
            }
        }
        int one = 0;
        for(int i = 0; i < arry.length; i++) {
            if (arry[i] == 1) {
                one++;
            }
        }
        int notEvenNumbers = 0;
        for(int i = 0; i < arry.length; i++)
            if (arry[i] % 2 != 0) {
                notEvenNumbers++;
            }
        int sum = 0;
        for(int i = 0; i < arry.length; i++) {
            sum = sum + i;
        }
        System.out.println("Длинна массива: " + arry.length);
        System.out.println("Количество чисел больше 8: " + moreThanEight);
        System.out.println("Количество чисел равных 1: " + one);
        System.out.println("Количество четных чисел: " + evenNumbers);
        System.out.println("Количесткво нечетных чисел: " + notEvenNumbers);
        System.out.println("Сумма всех элементов массива: "+ sum);
    }
}
