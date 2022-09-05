package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rdn = new Random();
        Player player1 = new Player(rdn.nextInt(11) + 90);
        Player player2 = new Player(rdn.nextInt(11) + 90);
        Player player3 = new Player(rdn.nextInt(11) + 90);
        Player.info();
        Player player4 = new Player(rdn.nextInt(11) + 90);
        Player player5 = new Player(rdn.nextInt(11) + 90);
        Player player6 = new Player(rdn.nextInt(11) + 90);
        Player.info();

        Player player7 = new Player(65);
        System.out.println(player7.getCountPlayers());

        while (player3.getStamina() > Player.MIN_STAMINA)
            player3.run();

        Player.info();

    }
}
