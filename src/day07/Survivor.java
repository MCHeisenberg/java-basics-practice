package day07;

public class Survivor {
    private String name;
    private int hp;
    private int caps;

    public Survivor(String name, int hp, int caps){
        this.name = name;
        this.hp = hp;
        this.caps = caps;
    }

    public String getName(){
        return this.name;
    }

    public int getHp(){
        return this.hp;
    }

    public int getCaps(){
        return this.caps;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setHp(int hp){
        this.hp = hp;
    }

    public void setCaps(int caps){
        this.caps = caps;
    }
}
