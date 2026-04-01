package day16;

public class Block27User {
    String name;
    int score;

    public Block27User(int score, String name) {
        this.score = score;
        this.name = name;
    }

    public void show() {
        System.out.println(name+" "+score);
    }
}
