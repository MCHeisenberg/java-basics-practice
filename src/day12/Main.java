package day12;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Tom",10));
        users.add(new User("Jack",20));
        users.add(new User("Lucy",30));

        User foundUser = findByName(users,"ack");

        if(foundUser != null){
            foundUser.show();
        }else {
            System.out.println("no found bchin");
        }
    }
    public static User findByName(ArrayList<User> users,String name){
        for(User bitc : users){
            if(bitc.name.equals(name)){
                return bitc;
            }
        }
        return null;
    }
}
