package day06;

public class Tyrant {
    String name;
    int hp =  300;
    int attackPower = 25;

    public void takeDamage(int damage){
        hp -= damage;
    }

    public boolean isAlive(){
        return hp > 0;
    }

    public void attack(Mecha target){
        target.takeDamage(attackPower);
        System.out.println("暴君发起了精神污染攻击！你失去了 "+ attackPower +"点血量！");
    }
}
