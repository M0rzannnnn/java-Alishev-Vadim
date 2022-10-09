package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }
    public String getUsername(){
        return username;
    }
    public List<User> getSubscriptions() {
        return subscriptions;
    }
    public void subscribe (User user){
        subscriptions.add (user);
    }
    public boolean isSubscribed (User user){
        return subscriptions.contains(user);
    }

    public void sendMessage(User user, String text){
        MessageDatabase.addNewMessage(this,user,text);

    }
    public boolean isFriend (User user){
        return this.isSubscribed(user) && user.isSubscribed(this);

    }
    @Override
    public String toString() {
        return username;
    }
}
