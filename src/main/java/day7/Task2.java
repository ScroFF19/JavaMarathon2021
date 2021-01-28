package day7;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player(90);
        Player player2 = new Player(95);
        Player player3 = new Player(56);
        Player player4 = new Player(34);
        Player player5 = new Player(98);
        Player player6 = new Player(89);

        Player.info();

        Player player7 = new Player(90);

        for(int i = 0; i < 91; i++)
            player4.run();
        Player.info();





    }
}
