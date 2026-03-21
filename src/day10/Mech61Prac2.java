package day10;

public class Mech61Prac2 {
    private String name;
    private int hp;
    private int maxHp;
    private int energy;

    //gs constr uns

    public Mech61Prac2(String name, int hp, int energy) {
        this.name = name;
        this.hp = hp;
        this.energy = energy;
        this.maxHp = hp;
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getHp() {
        return hp;
    }

    //liv tcd threk

    public boolean isAlive(){
        return hp > 0;
    }
    public void takeDamage(int damage){
        if(damage <= 0){
            return;
        }
        hp -= damage;
        if(hp < 0){
            System.out.println(name + " take dama:"+(hp+damage)+" and dead");
            hp = 0;
            return;
        }
        System.out.println(name + " take dama:"+damage);
    }
    public void machineGun(Tyran61Prac2 target){
        System.out.println(name + " use machine gun");
        target.takeDamage(30);//-dama-30
    }
    public void orbitalStrike(Tyran61Prac2 target){
        if(energy < 30){
            System.out.println(name + " energy lack,no os hapen");
            return;
        }
        energy -= 30;//cost 30
        System.out.println(name + " use os");
        target.takeDamage(80);//-dama-80
    }
    public void repair(){
        if(energy < 30){
            System.out.println(name + " energy lack,no heal hapen");
            return;
        }
        if(hp == maxHp){//hp wont fil
            System.out.println(name+" full hp,no heal hapen");
            return;
        }
        hp += 50;//-heal-50
        energy -= 30;
        if(hp > maxHp){
            System.out.println(name+" heal "+(maxHp-hp+50));
            hp = maxHp;
        }else {
            System.out.println(name+" heal 50");
        }

    }
}
