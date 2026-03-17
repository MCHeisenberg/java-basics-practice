package day06;

import java.util.Scanner;

public class TyrantGameDemo {
    public static void main(String[] args) {
        Mecha mecha = new Mecha();
        mecha.name = "MechaGo";

        Tyrant tyrant = new Tyrant();
        tyrant.name = "CreepyGoddamnJoe";

        Scanner sc = new Scanner(System.in);

        while (mecha.isAlive() && tyrant.isAlive()){
            System.out.println("【战况】我的血量：" + mecha.hp + " | 能量：" + mecha.energy
                    + " VS 暴君血量：" + tyrant.hp);
            System.out.println("1. 动能机枪(30伤害) | 2. 轨道天基武器(40能量，80伤害) | 3. 纳米修复(30能量，恢复50血)");

            int choose = sc.nextInt();

            if(choose == 1){
                mecha.machineGun(tyrant);
            } else if (choose == 2) {
                mecha.orbitalStrike(tyrant);
            } else if (choose == 3) {
                mecha.repair();
            }else {
                System.out.println("Wrong choose");
            }

            if(tyrant.isAlive()){
                tyrant.attack(mecha);
            }
        }
        if(!tyrant.isAlive()){
            System.out.println("物理超度完成！世界终于清静了！hhh");
        }else {
            System.out.println("GG...系统崩溃，你被恶心鼠了..");
        }
    }
}
