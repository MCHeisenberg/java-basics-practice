package day13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("nama",2345));
        users.add(new User("namb",465));
        addScoreByName(users,"nama",354);
        showAll(users);
    }
    public static User findByName(ArrayList<User> users, String name){
        for(User ghost : users){
            if(ghost.name.equals(name)){
                return ghost;
            }
        }
        return null;

    }

    public static void addScoreByName(ArrayList<User> users, String name , int value){
        User foundUser = findByName(users,name);
        if(foundUser != null){
            foundUser.score += value;
        }
    }

    public static void showAll(ArrayList<User> users){
        for(User ghost: users){
            ghost.show();
        }
    }

    public static User findMaxScoreUser(ArrayList<User> users) {
        if (users.size() == 0) {
            return null;
        }

        User maxUser = users.get(0);

        for (int i = 1; i < users.size(); i++) {
            if (users.get(i).score > maxUser.score) {
                maxUser = users.get(i);
            }
        }

        return maxUser;
    }
}




