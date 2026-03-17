package day06;

public class Monster {
    String name;
    int hp;
    public void takeDamage(int damage){
        hp -= damage;
    }
    public boolean isAlive(){
        return hp > 0;
    }
}
