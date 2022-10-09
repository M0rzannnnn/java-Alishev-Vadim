package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Anton");
        User user2 = new User("Vania");
        User user3 = new User("Ramazan");
        user1.sendMessage(user2, "Привет");
        user1.sendMessage(user2, "Как дела?");
        user2.sendMessage(user1, "Привет бро");
        user2.sendMessage(user1, "Все огонь!");
        user2.sendMessage(user1, "Погода правда гавнище");
        user3.sendMessage(user1, "Саламчик Тоха!");
        user3.sendMessage(user1, "Как родители, близкие, брат?");
        user3.sendMessage(user1, "Что нового в Москве?");
        user1.sendMessage(user3, "Привет Рамз");
        user1.sendMessage(user3, "все путём, Москва стоит!");
        user1.sendMessage(user3, "Как у вас в Грозном?");
        user3.sendMessage(user1, "Все с кайфом, брат!");

        MessageDatabase.showDialog(user1, user3);
    }
}
