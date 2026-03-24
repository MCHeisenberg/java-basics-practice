package day11;

public class User {
    String name;
    int score;

    public User(String name, int score){
        this.name = name;
        this.score = score;
    }
    public void addScore(int value){
        score += value;
    }
    public void show(){
        System.out.println(name + " " + score);
    }
}
