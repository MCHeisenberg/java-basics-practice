package day09;

public class TyrantVersion6_1 {
    private String name;
    private  int hp;
    private  int attackPower;

    public TyrantVersion6_1(String name, int hp, int attackPower){
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    public void takeDamage(int damage){
        hp -= damage;
        if(hp < 0){
            hp = 0;
        }
        System.out.println(name + " 受到 " + damage + " 点伤害!");
    }

    public void attack(MechaVersion6_1 target){
        System.out.println(name + " 发动反击！造成 " + attackPower + " 点伤害！");
        target.takeDamage(attackPower);
    }

    public boolean isAlive(){
        return hp > 0;
    }


}
