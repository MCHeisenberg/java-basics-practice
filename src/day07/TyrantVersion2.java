package day07;

public class TyrantVersion2 {
    String name;
    int hp;
    int attackPower;

    public TyrantVersion2(String name, int hp, int attackPower){
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
    }

    public void takeDamage(int damage){
        hp -= damage;
    }

    public void attack(MechaVersion2 target){
        target.takeDamage(attackPower);
    }

    public boolean isAlive(){
        return hp > 0;
    }
}
