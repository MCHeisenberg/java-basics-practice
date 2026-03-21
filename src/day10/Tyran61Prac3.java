package day10;

public class Tyran61Prac3 {
    private String name;
    private int hp;
    private int attackPower;

    //gs c

    public Tyran61Prac3(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAttackPower() {
        return attackPower;
    }
    //td l tb
    public void takeDamage(int damage){
        if(damage <= 0){
            return;
        }
        hp -= damage;
        if(hp < 0){
            System.out.println(name + "take dama: " + (hp+damage)+"-dead");
            hp = 0;
        }else {
            System.out.println(name + " take dama: " + damage);
        }
    }
    public boolean isAlive(){
        return hp > 0;
    }
    public void attack(Mech61Prac3 target){
        System.out.println(name+" attack back");
        target.takeDamage(attackPower);
    }
}
