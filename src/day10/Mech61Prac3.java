package day10;

public class Mech61Prac3 {
    private String name;
    private int hp;
    private int maxHp;
    private int energy;

    //gs cstr

    public Mech61Prac3(String name, int hp, int energy) {
        this.name = name;
        this.hp = hp;
        this.energy = energy;
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
//liv td tk
    public boolean isAlive(){
        return hp > 0;
    }
    public void takeDamage(int damage){
        if(damage <= 0){
            return;
        }
        hp -= damage;
        if(hp < 0){
            System.out.println(name + " take dama: " +(hp+damage)+"-dead");
            hp = 0;
        }else {
            System.out.println(name + " take dama: "+ damage);
        }
    }
    public void machineGun(Tyran61Prac3 target){
        System.out.println(name+" use m gun");
        target.takeDamage(30);//g-dama-30
    }
    public void orbitalStrike(Tyran61Prac3 target){
        if(energy < 30){
            System.out.println(name+ "energy lack,no os hapen");
            return;
        }
        energy -= 30;
        System.out.println(name+" use os");
        target.takeDamage(80);//os-dama-80
    }
    public void repair(){
        if(energy < 30){
            System.out.println(name+" energy lack, no heal");
        } else if (hp == maxHp) {
            System.out.println(name+" full hp,no heal");
        }else {
            energy -= 30;
            hp += 50;
            if(hp > maxHp){
                System.out.println(name+" heal "+(maxHp-hp+50)+" hp,full now");
                hp = maxHp;
            }else {
                System.out.println(name+" heal 50 hp");
            }
        }
    }
}
