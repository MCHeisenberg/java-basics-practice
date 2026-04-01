package day16;

import java.util.HashMap;

public class Block27Demo {
    public static void main(String[] args) {
        HashMap<String, Block27User> userMap=new HashMap<>();

        userMap.put("Jack",new Block27User(78,"Jack"));
        userMap.put("Drunk",new Block27User(48,"Drunk"));

        Block27User user = userMap.get("Jack");
        user.show();
    }
}
