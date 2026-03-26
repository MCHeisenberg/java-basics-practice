package day13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("nama",2345));
        users.add(new User("namb",465));
        User userMaxScore=findMaxScoreUser(users);
        User userX=findByName(users,"z");
        addScoreByName(users,"nama",354);
        showAll(users);

        updateScoreByName(users,"nama",89);
        showAll(users);
    }
//    p s v usbn(a u, s n , i ns){
//
//    }
public static void updateScoreByName(ArrayList<User> users, String name, int newScore) {
    for (User ghost:users) {
        if (ghost.name.equals(name)) {
            ghost.score = newScore;
            return;
        }
    }
}




    public static User findByName(ArrayList<User> users, String name){
        for(User ghost : users){
            if(ghost.name.equals(name)){
                return ghost;
            }
        }
        return null;//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
    }
    public static void addScoreByName(ArrayList<User> users,String name ,int value){
        User foundUser = findByName(users,name);
        if(foundUser!=null){
            foundUser.score += value;
        }
    }
    public static User findMaxScoreUser(ArrayList<User> users) {
        if (users.size() == 0) {//users could be blank->users.getFirst()could be wrong->so judge first
            return null;
        }
        User maxUser = users.getFirst();//$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
        for (int i = 1; i < users.size(); i++) {
            if (users.get(i).score > maxUser.score) {
                maxUser = users.get(i);
            }
        }
        return maxUser;
    }
    public static void showAll(ArrayList<User> users){
        for(User ghost: users){
            ghost.show();
        }
    }
    public static int countHighScore(ArrayList<User> users) {
        int count = 0;
        for (User user : users) {
            if (user.score >= 60) {
                count++;
            }
        }
        return count;
    }
    public static void removeByName(ArrayList<User> users, String name){
        for(int i=0;i<=users.size()-1;i ++){
            if(users.get(i).name.equals(name)){
                users.remove(i);
            }
        }
    }
//    public static User findMaxScoreUser(ArrayList<User> users){
//        if(){
//
//        }
//        for(){
//            if
//        }
//        return
//    }
//    p s i chs(){
//
//        return  c
//    }
//    p s v sa(){
//
//    }





//    public static void addScoreByName(ArrayList<User> users, String name , int value){
//        User foundUser = findByName(users,name);
//        if(foundUser != null){//findByName() -> ghost could be null,so must judge first.or foundUser.score could be wrong
//            foundUser.score += value;
//        }
//    }

}




