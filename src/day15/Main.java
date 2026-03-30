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
        System.out.println(targetList.length);
        System.out.println(targetList[1].length());

        //block13 - array traversal
        int[] nums = {10, 20, 30, 40};
        for (int i=0;i<nums.length;i++) {
            System.out.println(nums[i]);
        }

        //block 12 - array define/init/access
        int[] nums1 = {1,2,34,54};
        System.out.println(nums1[0]);
        System.out.println(nums1[3]);

        //block 14 array sum
        int sum=0;
        for (int i=0;i<nums1.length;i++) {
            sum += nums1[1];
        }
        System.out.println("nums1 sum: "+sum);

        //block 15 - array max
        int max=nums1[0];
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]>max){
                max=nums1[i];
            }
        }
        System.out.println(max);

        //block 16 - arrayHasNumber
        boolean result = arrayHasNumber(nums1,34);
        System.out.println(result);

        //block 17
        int count = countTarget(nums1,34);
        System.out.println(count);

        //block 18
        replaceTarget(nums1,34,43);
        for (int i=0;i<nums1.length;i++){
            System.out.println(nums1[i]);
        }
    }
    //block 18
    public static void replaceTarget(int[] nums,int oldValue,int newValue) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==oldValue){
                nums[i]=newValue;
            }
        }
    }

    //block 17
    public static int countTarget(int[] nums,int target) {
        int count =0;
        for (int i=0;i<nums.length;i++) {
            if (nums[i]==target) {
                count ++;
            }
        }
        return count;
    }

    //block 16
    public static boolean arrayHasNumber(int[] nums, int target) {
        for (int i=0;i<nums.length;i++) {
            if (nums[i]==target) {
                return true;
            }
        }
        return false;
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
