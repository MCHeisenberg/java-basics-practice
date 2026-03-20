package day09;

public class MechaV6_1Practice {
    private String name;
    private int hp;
    private int maxHp;
    private int energy;

    public MechaV6_1Practice(String name, int energy, int hp) {
        this.name = name;
        this.energy = energy;
        this.hp = hp;
        this.maxHp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getEnergy() {
        return energy;
    }

    public boolean isAlive(){
        return hp > 0;
    }

    public void takeDamage(int damage){
        if(damage < 0){
            return;
        }

        hp -= damage;

        System.out.println(name + " 受到 " + damage + " 点伤害！");
    }

    public void machineGun(TyrantV6_1Practice target){
        System.out.println(name + "启用【动能机枪】！");
        target.takeDamage(30);
    }

    public void orbitalStrike(TyrantV6_1Practice target){
        if(energy < 40){
            System.out.println(name + " 能量不足，无法发动【轨道天基武器】。");
            return;
        }
        energy -= 40;
        System.out.println(name + " 发动【轨道天基武器】！");
        target.takeDamage(80);
    }

    public void repair(){
        if(energy < 30){
            System.out.println(name + " 能量不足，无法进行【纳米修复】。");
            return;
        }

        if(hp >= maxHp){
            System.out.println(name + " 已是满血，无法再恢复血量。");
            return;
        }

        int healAmount = 50;

        if(hp + healAmount > maxHp){
            energy -= 30;
            System.out.println(name + " 启动【纳米修复】恢复血量 " + (maxHp - hp) + " 点！满血状态。");
            hp = maxHp;
        }else {
            energy -= 30;
            System.out.println(name + " 启动【纳米修复】恢复血量 " + healAmount + " 点！");
            hp += healAmount;
        }
    }
}
