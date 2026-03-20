package day09;

public class MechaV6_1Practice2 {
    //1.属性
    private String name;
    private int hp;
    private int maxHp;
    private int energy;

    //2.构造方法
    public MechaV6_1Practice2(String name, int hp, int energy) {
        this.name = name;
        this.hp = hp;
        this.energy = energy;
        this.maxHp = hp;
    }

    //3.get\set


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

    //4.存活；三个技能；吃伤害
    public void takeDamage(int damage){
        if(damage <= 0){
            return;
        }
        System.out.println(name + "take damag "+damage);//maybe < damag
        hp -= damage;
        if(hp < 0){
            hp = 0;
        }
    }


    public boolean isAlive(){
        return hp > 0;
    }

    public void machineGun(TyrantV6_1Practice2 target){
        System.out.println(name + " use [Machine Gun]");
        target.takeDamage(30);
    }

    public void orbitalStrike(TyrantV6_1Practice2 target){
        //1.engy ough
        if(energy < 30){
            System.out.println(name + "energy need,can't use OS");
            return;
        }
        energy -= 30;
        System.out.println(name + " has used obiStri");
        target.takeDamage(80);
    }

    public void repair(){
        //1.energy ough  ;   hp  can‘t  far
        if(energy < 30){
            System.out.println(name + "engy not ough   can't  repai");
            return;
        }

        if(hp >= maxHp){
            System.out.println(name + "ful h ,no hapen");
            return;
        }

        energy -= 30;

        //h can'
        if(maxHp - hp < 50){
            System.out.println(name + "hp↑"+(maxHp-hp));
            hp = maxHp;
        }else {
            System.out.println(name + "hp↑50");
            hp += 50;
        }
    }
}
