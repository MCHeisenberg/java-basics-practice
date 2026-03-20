package day09;

public class TyrantV6_1Practice {
    private String name;
    private int hp;
    private int attackPower;

    public TyrantV6_1Practice(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
    }

    public boolean isAlive(){
        return hp > 0;
    }

    public void takeDamage(int damage){
        if(damage <= 0){
            return;
        }

        hp -= damage;

        System.out.println(name + " 受到 " + damage + " 点伤害！");
    }

    public void attack(MechaV6_1Practice target){
        System.out.println(name + " 发动反击！");
        target.takeDamage(attackPower);
    }
}
