package day10;

public class Mec61Prati1 {
    //一 pri
    private String name;
    private int hp;
    private int energy;
    private int maxHp;

    // gs cstru //unneed set
    public Mec61Prati1(String name, int hp, int energy) {
        this.name = name;
        this.hp = hp;
        this.energy = energy;
        this.maxHp = hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getEnergy() {
        return energy;
    }

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }
    //td  A  threk

    public void takeDamage(int damage){
        if(damage <= 0){
            return;
        }
        hp -= damage;
        if(hp < 0){
            hp = 0;
        }
        System.out.println(name + "take dama :" + damage);//actully maybe less when dead
    }

    public boolean isAlive(){
        return hp > 0;
    }

    public void machineGun(Tyran61Prati1 target){
        //use ener  judge ener
        System.out.println(name + "use machin gun");
        target.takeDamage(30);//damage=30
    }
    public void orbitalStrike(Tyran61Prati1 target){
        if(energy < 30){
            System.out.println(name + "ener need  -no os hapen");
            return;
        }
        energy -= 30;//cost 30 ener - ener won't be unpositive(only >= 30 hapen)
        System.out.println(name +"use os");
        target.takeDamage(80);//dama 80
    }
    public void repair(){
        if(energy < 30){
            System.out.println(name + "ener need  -no rep hapen");
            return;
        }
        if(hp == maxHp){//hp won't > maxHp
            System.out.println(name + "ful hp -no rep hapen");
            return;
        }
        energy -= 30;
        hp += 50;//healnum = 50
        if(hp > maxHp){
            hp = maxHp;
        }
        System.out.println(name + "use repa hp↑50(if now full hp maybe ↑less)");
    }

}
