package day11;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        //User[] u = new User[0]; static\limited
        //User[] uu = users.toArray(new User[0]); change to static
        users.add(new User("Jack",4));
        users.add(new User("Duke",2));

        for(User userWhatever : users){
            userWhatever.show();
            userWhatever.addScore(7);
            System.out.println("add 7 :");
            userWhatever.show();
        }
        for(User user8848 : users){
            user8848.show();
        }

        for(User user9527 : users){
            user9527.addScore(5);
        }

        for(User user4396:users){
            user4396.show();
        }
    }
}
