package day6;

import java.util.Scanner;

public class Car {
    private int year;
    private String color;
    private String model;

    public void setYear(int carYear){
        year = carYear;
    }
    public int getYearOfRelease(){
        return year;
    }
    public void setColor(String carColor){
        color = carColor;
    }
    public String getColor(){
        return color;
    }
    public void setModel(String carModel){
        model = carModel;
    }
    public String getModel(){
        return model;
    }

    public void info(){
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear){

        if( inputYear > year) {
            return inputYear - year;
            }else {
            return (inputYear - year) * (-1);
        }

    }
}





