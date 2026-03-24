package day10;

public class TyrantV6_2 {
    private String name;
    private int hp;
    private int attackPower;

    //gs c

    public TyrantV6_2(String name, int hp, int attackPower) {
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
    //il  td  at
    public boolean isAlive(){
        return hp > 0;
    }
    public void takeDamage(int damage){
        if(damage <= 0){
            return;
        }
        hp -= damage;
        if(hp < 0){
            System.out.println(name+" take dama: "+(hp+damage)+"-dead");
            hp = 0;
        }else {
            System.out.println(name+" take dama "+damage);
        }
    }

}
