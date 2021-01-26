package day6;



public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Priora");
        car1.setColor("white");
        car1.setYear(2008);
        car1.info();
        car1.yearDifference(2012);
        System.out.println(car1.yearDifference(2020));

        Motorbike motorbike1 = new Motorbike("kavasaki", "black", 2014);
        motorbike1.getColor();
        motorbike1.getModel();
        motorbike1.getYearOfRelease();
        motorbike1.info();
        motorbike1.yearDifference(2021);





    }
}
