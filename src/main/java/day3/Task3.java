package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 1; i <= 5; i++){
            double divisible = scanner.nextDouble();
            double divisor = scanner.nextDouble();
            if(divisor == 0){
                System.out.println("Деление на 0");
            }else {
                System.out.println(divisible / divisor);
            }
        }
    }
}
