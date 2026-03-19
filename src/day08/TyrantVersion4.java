package day08;

public class TyrantVersion4 {
    private String name;
    private int hp;
    private int attackPower;

    public TyrantVersion4(String name, int hp, int attackPower) {
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

    public boolean isAlive(){
        return hp > 0;
    }

    public void takeDamage(int damage){
        if(damage <= 0){
            return;
        }

        hp -= damage;

        if(hp < 0){
            hp = 0;
        }

        System.out.println(name + " 受到 " + damage + " 点伤害！ ");
    }

    public void attack(MechaVersion4 target){
        target.takeDamage(attackPower);
        System.out.println(name + " 发动反击！造成 " + attackPower + "点伤害！");
    }
}
