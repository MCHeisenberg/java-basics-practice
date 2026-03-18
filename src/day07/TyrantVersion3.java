package day07;

public class TyrantVersion3 {
    private String name;
    private int hp;
    private int attackPower;

    public TyrantVersion3(String name, int hp, int attackPower){
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
    }

    public int getHp(){
        return hp;
    }

    public int getAttackPower(){
        return attackPower;
    }

    public boolean isAlive(){
        return hp > 0;
    }

    public void getDamage(int damage){
        hp -= damage;
    }

    public void attack(MechaVersion3 target){
        target.getDamage(attackPower);
    }



}
