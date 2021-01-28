package day8;

public class Task1 {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        StringBuilder ogo = new StringBuilder();
        for(int i = 0; i <= 20000; i++){
            ogo.append(i + " ");
        }
        System.out.print(ogo);
        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;



        long start1 = System.currentTimeMillis();
        String string = new String();
        for(int i = 0; i <= 20000; i++){
            string = string + " " + i;
        }
        System.out.println(string);
        long finish1 = System.currentTimeMillis();
        long timeConsumedMillis1 = finish1 - start1;


        System.out.println("Время работы программы: " + timeConsumedMillis);
        System.out.println("Время работы программы: " + timeConsumedMillis1);

    }
}
