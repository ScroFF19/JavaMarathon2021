package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("il", 1989, 234, 235);
        Airplane airplane2 = new Airplane("uak", 1978, 234, 7);

        Airplane.compareAirplanes(airplane1, airplane2);



    }
}