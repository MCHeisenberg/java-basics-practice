package day06;

public class Mecha {
    String name;
    int hp = 200;
    int energy = 200;

    public void machineGun(Tyrant target){
        target.takeDamage(30);
    }

    public void orbitalStrike(Tyrant target){
        if(energy >= 40){
            energy -= 40;
            target.takeDamage(80);
        }else {
            System.out.println("能力不足。");
        }
    }

    public void repair(){
        if(energy >= 30){
            energy -= 30;
            hp += 50;
        }else {
            System.out.println("能力不足。");
        }
    }

    public void takeDamage(int damage){
        hp -= damage;
    }

    public boolean isAlive(){
        return hp > 0;
    }

}
