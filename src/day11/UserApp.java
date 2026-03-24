package day11;

import java.util.ArrayList;

public class UserApp {
    ArrayList<User> users = new ArrayList<>();

    public void addUser(String name,int score){
        users.add(new User(name, score));
    }
}


