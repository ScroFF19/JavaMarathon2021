package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boing", 1987, 37, 15000);

        airplane1.setYear(2013);
        airplane1.setLength(35);

        airplane1.fillUp(100);
        airplane1.fillUp(400);

        airplane1.info();

    }
}
