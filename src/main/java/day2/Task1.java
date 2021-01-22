package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner floors = new Scanner(System.in);
        int numberOfFloors = floors.nextInt();
        if(numberOfFloors <= 0){
            System.out.println("Ошибка ввода");
        }else if(numberOfFloors <= 4){
            System.out.println("Малоэтажный дом");
        }else if(numberOfFloors <= 8){
            System.out.println("Среднеэтажный дом");
        }else {
            System.out.println("Многоэтажный дом");
        }
    }
}









