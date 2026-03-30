package day15;

import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        String text = "add UsEr now";
//        boolean result = hasUserWord(text);
//        System.out.println(result);
//        System.out.println(LowerhasUserWord(text));
        analyzeText(text);

        String raw = " [TRASH_DATA]: joking_thity_zombie ";
        System.out.println(raw.trim().toLowerCase());
        System.out.println(raw.trim().toLowerCase().substring(27));

        String[] targetList = new String[3];
        targetList[0] = "FriendA";
        targetList[1] = "Parent";
        targetList[2] = "NPC_C";
        System.out.println(targetList[2]);
        targetList[1]="Jorge";
        System.out.println(targetList[1]);

        //block13
        int[] nums = {10, 20, 30, 40};
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }


    }

    public static void analyzeText(String text) {
        String lowerText=text.toLowerCase();
        if(lowerText.contains("user")){
            System.out.println("has user");
        }
        String head=lowerText.substring(0,3);
        if(head.equals("add")){
            System.out.println("add command");
        }
    }

    public static boolean hasUserWord(String text) {
        return text.contains("user");
    }

    public static boolean LowerhasUserWord(String text) {
        return text.toLowerCase().contains("user");
    }









    public static void showAll(ArrayList<User> users) {
        if (users == null) {
            return;
        }
        for (User gst : users) {
            if (gst!=null) {
                gst.show();
            }
        }
    }

    public static User findByName(ArrayList<User> users, String name) {
        if (users == null||name==null) {
            return null;
        }
        for (User gst : users) {
            if (gst!=null && Objects.equals(gst.name, name)) {
                return gst;
            }
        }
        return null;
    }

    public static int countHighScore(ArrayList<User> users) {
        if(users==null){
            return 0;
        }

        int count = 0;

        for (User gst:users) {
            if (gst!=null && gst.score>=60) {
                count ++;
            }
        }

        return count;
    }

    public static User findMaxScoreUser(ArrayList<User> users) {
        if(users==null || users.size()==0){
            return null;
        }
        User maxUser = null;
        for (User gst:users) {
            if (gst!=null && (maxUser==null || gst.score>maxUser.score)) {
                maxUser=gst;
            }
        }
        return maxUser;
    }

    public static void addScoreByName(ArrayList<User> users, String name, int value) {
        User foundUser = findByName(users,name);
        if (foundUser != null) {
            foundUser.score+=value;
        }
    }

    public static void removeByName(ArrayList<User> users, String name) {
        for (int i=0;i<users.size();i++) {
            if (users.get(i)!=null && users.get(i).name.equals(name)){
                users.remove(i);
                return;
            }
        }
    }

    public static void updateScoreByName(ArrayList<User> users, String name, int newScore) {
        for (User gst : users) {
            if (gst != null && gst.name.equals(name)) {
                gst.score = newScore;
            }
        }
    }


}
