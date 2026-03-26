package day14;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();

        users.add(new User("Tom", 55));
        users.add(new User("Jack", 80));
        users.add(new User("Lucy", 67));
        users.add(new User("Rose", 40));

    }
    public static void showAll(ArrayList<User> users){
        for(User ghost : users){
            ghost.show();
        }
    }
    public static User findByName(ArrayList<User> users,String name){
        for(User ghost: users){
            if(ghost.name.equals(name)){
                return ghost;
            }
        }
        return null;
    }
    public static int countHighScore(ArrayList<User> users){
        int count = 0;
        for(User ghost:users){
            if(ghost.score>=60){
                count ++;
            }
        }
        return count;
    }
    public static User findMaxScoreUser(ArrayList<User> users){
        if(users.size()==0){
            return null;
        }
        User maxUser = users.get(0);
        for(int i=1;i<=users.size()-1;i++){
            if(users.get(i).score>maxUser.score){
                maxUser = users.get(i);
            }
        }
        return maxUser;
    }
    public static void addScoreByName(ArrayList<User> users,String name,int value){//$$$$$$$$$$value
        User foundUser = findByName(users,name);
        if(foundUser != null){
            foundUser.score += value;
        }
    }

    public static void removeByName(ArrayList<User> users,String name){
        for(int i = 0;i<users.size();i++){
            if(users.get(i).name == name){
                users.remove(i);
                return;//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
            }
        }
    }

    public static void updateScoreByName(ArrayList<User> users,String name,int newScore){
        for(int i = 0;i<users.size();i++){
            if(users.get(i).name == name){
                users.get(i).score = newScore;
                return;
            }
        }
    }

}
