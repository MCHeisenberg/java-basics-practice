package day12;

public class User {
    String name;
    int score;

    public User(String name, int score){
        this.name = name;
        this.score = score;
    }

    public void show(){
        System.out.println(name+" "+score);
    }
}
