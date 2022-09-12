package day7;

public class Player {
    private int stamina;
    private static int freePlaces;
    private static int countPlayers;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
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
    public void run(){
        if (stamina>0)
            stamina--;
        if(stamina == 0){
            countPlayers--;
        }
    }
    public static void info() {
        freePlaces = 6 - countPlayers;
        if (freePlaces < 6 && freePlaces>MIN_STAMINA) {
            System.out.println("Команды не полные. На поле еще есть " + freePlaces + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
