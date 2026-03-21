package day10;

public class Tyran61Prac2 {
    private String name;
    private int hp;
    private int attackPower;

    //gs cstr -noneed set
    public Tyran61Prac2(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getHp() {
        return hp;
    }

    // tc liv td
    public void takeDamage(int damage){
        if(damage <= 0){
            return;
        }
        hp -= damage;
        if(hp < 0){
            System.out.println(name + " take dama: "+ (hp + damage)+" -dead");
            hp = 0;
            return;
        }
        System.out.println(name + " take dama: "+ damage);
    }
    public boolean isAlive(){
        return hp > 0;
    }
    public void attack(Mech61Prac2 mecha){
        System.out.println(name+" attack back");
        mecha.takeDamage(attackPower);
    }
}
