package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike1 = new Motorbike("black", 2014, "kavasaki");

    }
}
class Motorbike{
    private int yearOfRelease;
    private String color;
    private String model;
   public Motorbike(String color, int yearOfRelease, String model){
       this.color = color;
       this.yearOfRelease = yearOfRelease;
       this.model = model;
   }
    public String getColor(){
       return color;
    }
    public String getModel(){
       return model;
    }
    public int getYearOfRelease(){
       return yearOfRelease;
    }

}