package day10;

public class MechaV6_2 {
    private String name;
    private int hp;
    private int maxHp;
    private int energy;
    private int maxEnergy;

    public MechaV6_2(String name, int hp, int energy) {
        this.name = name;
        this.hp = hp;
        this.energy = energy;
        this.maxHp = hp;
        this.maxEnergy = energy;
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
    // sl td mg os rp rs
    public boolean isAlive(){
        return hp > 0;
    }
    public void takeDamage(int damage){
//        if(damage <= 0){
//            return;
//        }
        hp -= damage;
        if(hp < 0){
            System.out.println(name+" take dama: "+(hp+damage));
            hp = 0;
        }
        System.out.println(name+" take dama: "+damage);
    }

    public void rest(){
        if(hp <= 20){
            System.out.println(name+" hp low cant rise rner");
            return;
        } else if (energy == maxEnergy) {
            System.out.println(name+" full ener cant rise");
            return;
        }
        hp -= 20;
        energy += 50;
        if(energy > maxEnergy){
            System.out.println(name+" rise ener: "+(maxEnergy-energy+50)+" ener full");
            energy = maxEnergy;
        }else {
            System.out.println(name+ " rise ener: 50");
        }
    }

}
