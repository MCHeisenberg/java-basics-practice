package day06;

public class BountyHunter {
    String name;
    Weapon equippedWeapon;
    public void fire(){
        System.out.println("赏金猎人"+name+"拔出了他的"+equippedWeapon.name
        +",向前方的敌军输出了"+equippedWeapon.damage+"点爆裂伤害！" +
                "物理超度完成！");
    }
}
