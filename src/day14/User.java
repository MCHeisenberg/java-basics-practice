package day14;

public class User {
    String name;
    int score;

    public User(String name,int score) {
        this.score = score;
        this.name = name;
    }
    public void show(){
        System.out.println(name+" "+score);
    }
}
