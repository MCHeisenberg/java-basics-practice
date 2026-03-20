package day09;

public class TyrantV6_1Practice2 {
    //1.属性
    private String name;
    private int hp;
    private int attackPower;

    //2.gouzao

    public TyrantV6_1Practice2(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
    }

    //3.get

    public String getName() {
        return name;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getHp() {
        return hp;
    }

    //4.take;attack;islive
    public void takeDamage(int damage){
        //1.positive
        if(damage <= 0){
            return;
        }

        hp -= damage;

        if(hp < 0){//2.hp can't unpositive
            hp = 0;
        }

        System.out.println(name + " take damage：" + damage);
    }
}
