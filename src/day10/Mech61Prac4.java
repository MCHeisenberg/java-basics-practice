package day10;

public class Mech61Prac4 {
    private String name;
    private int hp;
    private int maxHp;
    private int energy;

    //gs c

    public Mech61Prac4(String name, int hp, int energy) {
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
    // l td tre
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
            System.out.println(name+" take dama: "+damage);
        }
    }
    public void machineGun(Tyran61Prac4 target){
        System.out.println(name+" use gun");
        target.takeDamage(30);//-gun-dama-30
    }
    public void orbitalStrike(Tyran61Prac4 target){
        if(energy < 30){
            System.out.println(name+" energy lack,orbi strik no hapen");
        }else {
            energy -= 30;
            System.out.println(name+" use obi stri");
            target.takeDamage(80);//-dama-80
        }
    }
    public void repair(){
        if(energy < 30){
            System.out.println(name+" energy lack, cant heal");
        } else if (hp >= maxHp) {
            System.out.println(name+" full hp,cant heal");
        } else {
            energy -= 30;
            hp += 50;
            if(hp > maxHp){
                System.out.println(name+" heal hp: "+(maxHp-hp+50));
                hp = maxHp;
            }else {
                System.out.println(name+" heal hp: 50");
            }
        }
    }
}
