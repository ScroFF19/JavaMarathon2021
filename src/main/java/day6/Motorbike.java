package day6;


public class Motorbike {
    private int yearOfRelease;
    private String color;
    private String model;

    public Motorbike(String model, String color, int yearOfRelease) {
        this.color = color;
        this.yearOfRelease = yearOfRelease;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear) {
        if (inputYear > yearOfRelease) {
            return inputYear - yearOfRelease;
        } else {
            return (inputYear - yearOfRelease) * (-1);
        }

    }
}