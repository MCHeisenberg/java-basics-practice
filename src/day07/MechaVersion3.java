package day07;

public class MechaVersion3 {
    // 加上 private 关键字，这三个属性立刻变成“机甲内部最高机密”
    // 离开这个类，任何地方（包括 main 方法）都绝对不准直接写 myMecha.hp
    private String name;
    private int hp;
    private int energy;

    // 构造器保持不变...
    public MechaVersion3(String name, int hp, int energy) {
        this.name = name;
        this.hp = hp;
        this.energy = energy;
    }

    // 1. 提供 Getter 方法（只读接口，相当于汽车的仪表盘）
    // 外部想要知道血量，只能调用 myMecha.getHp()
    public int getHp(){
        return this.hp;
    }

    public int getEnergy(){
        return this.energy;
    }

    // 2. 提供 Setter 方法（写入接口，相当于带安检的加油口）
    // 外部想要修改血量，只能调用 myMecha.setHp(...)
    public void setHp(int hp){
        if(hp < 0){
            System.out.println("警告：遭到非法篡改！血量不能为负！系统自动拦截！");
        }else {
            this.hp = hp;
        }
    }

    public void getDamage(int damage){
        hp -= damage;
    }

    public void mechineGun(TyrantVersion3 target){
        target.getDamage(30);
    }

    public void orbitalStrike(TyrantVersion3 target){
        if(energy >= 40){
            energy -= 40;
            target.getDamage(80);
        }else {
            System.out.println("能力不足，进攻无效");
        }
    }

    public void repair(){
        if(energy >= 30){
            energy -= 30;
            hp += 50;
        }else {
            System.out.println("能量不足，repair无效！");
        }
    }

    public boolean isAlive(){
        return hp > 0;
    }



    //发现getEnergy()显示灰色，，getHp()和setHp(int hp)都显示蓝色，但是实际目前都没有
    // 被调用过，，很奇怪，，试了半天还是没找到原因，，不浪费时间了。（下面代码是加了一点控制变量试了试）
//    public void setEnergy(int energy) {
//        this.energy = energy;
//    }


//    public void setEnergy(int energy){
//        if(energy < 0){
//            System.out.println("警告：遭到非法篡改！能量不能为负！系统自动拦截！");
//        }else {
//            this.energy = energy;
//        }
//    }

}
