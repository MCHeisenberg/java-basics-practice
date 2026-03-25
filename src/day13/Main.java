package day13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users=new ArrayList<User>();
        users.add(new User("nama",74));
        users.add(new User("namb",372));

        int count=0;
        count=countHighScore(users);
        System.out.println("count"+count);

        User foundUser = findByName(users,"nama");
        foundUser.show();

        User maxUser = findMaxScoreUser(users);
        maxUser.show();
    }
    public static User findMaxScoreUser(ArrayList<User> users){
        if(users.size()==0){
            return null;
        }
        User maxUser=users.get(0);
        for(int i=1;i<=users.size()-1;i++){
           if(users.get(i).score>maxUser.score){
               maxUser = users.get(i);
           }
        }
        return maxUser;

    }
    public static User findByName(ArrayList<User> users,String name){
        for(User ghost:users){
            if(ghost.name.equals(name)){
                return ghost;
            }
        }
        return null;
    }
    public static int countHighScore(ArrayList<User> users){
        int count=0;
        for(User ghost: users){
            if(ghost.score>=60){
                count ++;
            }
        }
        return count;
    }
}

