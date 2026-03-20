package day09;

public class MechaVersion6_1 {
    private String name;
    private int hp;
    private int maxHp;
    private int energy;

    public MechaVersion6_1(String name, int hp, int energy){
        this.name = name;
        this.hp = hp;
        maxHp = hp;
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public int getHp(){
        return hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getEnergy() {
        return energy;
    }

    public void takeDamage(int damage){
        if(damage <= 0){
            return;
        }

        hp -= damage;
        if(hp < 0){
            hp = 0;
        }

        System.out.println(name + " 受到 " + damage + " 点伤害！");
    }

    public void machineGun(TyrantVersion6_1 target){
        System.out.println(name + "使用【动能机枪】！");
        target.takeDamage(30);
    }

    public void orbitalStrike(TyrantVersion6_1 target){
        if(energy < 40){
            System.out.println(name + " 能量不足，无法发动【轨道天基武器】！");
            return;
        }
        energy -= 40;
        System.out.println(name + "发动【轨道天基武器】！");
        target.takeDamage(80);
    }

    public void repair(){
        if(energy < 30){
            System.out.println(name + "能量不足，无法进行【纳米修复】！");
        }

        energy -= 30;

        int healAmount = 50;
        if(hp + healAmount > maxHp){
            System.out.println(name + "启动【纳米修复】！本次恢复血量 " + (maxHp - hp) + "点,满血状态！");
            hp = maxHp;
        }else {
            System.out.println(name + "启动【纳米修复】！本次恢复血量 " + healAmount + "点！");
            hp += healAmount;
        }
    }

    public boolean isAlive(){
        return hp > 0;
    }
}
