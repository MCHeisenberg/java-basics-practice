package day10;

public class Tyran61Prati1 {
    private String name;
    private int hp;
    private int attackPower;

    //constru gs
    public Tyran61Prati1(String name, int hp, int attackPower) {
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
    //noneed set

    public void takeDamage(int damage){
        if(damage <= 0){
            return;
        }
        hp -= damage;
        if(hp < 0){
            hp = 0;
        }
        System.out.println(name + "take dama:"+damage);//actully maybe less when dead
    }
    public boolean isAlive(){
        return hp > 0;
    }

    public void attack(Mec61Prati1 mecha){
        System.out.println(name + "use attack back");
        mecha.takeDamage(attackPower);
    }

}
