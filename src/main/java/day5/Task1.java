package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Приора");
        car1.setColor("black");
        car1.setYearOfRelease(2014);
        System.out.println(car1.getColor());
        System.out.println(car1.getModel());
        System.out.println(car1.getYearOfRelease());


    }
}
class Car{
    private int yearOfRelease;
    private String color;
    private String model;
    public void setYearOfRelease(int carYearOfRelease){
        yearOfRelease = carYearOfRelease;
    }
    public int getYearOfRelease(){
        return yearOfRelease;
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


}




