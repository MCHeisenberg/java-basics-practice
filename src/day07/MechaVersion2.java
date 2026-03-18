package day07;

public class MechaVersion2 {
    String name;
    int hp;
    int energy;

    // 2. 👇 这件神装就是构造器 (Constructor)！
    // 铁律一：名字必须和类名 Mecha 一模一样！
    // 铁律二：没有返回值类型，连 void 都不准写！
    public MechaVersion2(String name, int hp, int energy){
        this.name = name;//this.name是指这个类的、这个类实例化对象的name。后面的name是这个构造方法的参数里面传进来的name
        this.hp = hp;
        this.energy = energy;
    }

    public void machineGun(TyrantVersion2 target){
        target.takeDamage(30);
    }

    public void orbitalStrike(TyrantVersion2 target){
        if(energy >= 40){
            energy -= 40;
            target.takeDamage(80);
        }else {
            System.out.println("能力不足,进攻失效。。。");
        }
    }

    public void repair(){
        if(energy >= 30){
            energy -= 30;
            hp += 50;
        }else {
            System.out.println("能量不足，恢复无效！。。。");
        }
    }

    public void takeDamage(int damage){
        hp -= damage;
    }

    public boolean isAlive(){
        return hp > 0;
    }

}
