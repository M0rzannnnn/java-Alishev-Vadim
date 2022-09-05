package day7;

public class Player {
    int stamina;
    public static int countPlayers;
    public Player(int stamina){
        this.stamina = stamina;
        if (countPlayers<6)
            countPlayers++;
    }
    public int getStamina(){
        return stamina;
    }
    public static int getCountPlayers(){
        return countPlayers;
    }
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;

    public void run(){
        if (stamina>0)
            stamina--;
        if(stamina == 0){
            countPlayers--;
        }
    }
    private static int freePlaces;
    public static void info() {
        freePlaces = 6 - countPlayers;
        if (freePlaces < 6 && freePlaces>MIN_STAMINA) {
            System.out.println("Команды не полные. На поле еще есть " + freePlaces + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
