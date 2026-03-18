package day07;

import java.util.Scanner;

public class TyrantGameV3Demo {
    public static void main(String[] args) {
        MechaVersion3 myMecha = new MechaVersion3("额滴个龟龟",300, 300);
        TyrantVersion3 tyrant = new TyrantVersion3("FlyingTyrant",500, 30);

        Scanner sc = new Scanner(System.in);

        while (myMecha.isAlive() && tyrant.isAlive()){
            System.out.println("【战况】我的血量：" + myMecha.getHp() + " | 能量：" + myMecha.getEnergy()
                    + " VS 暴君血量：" + tyrant.getHp());
            System.out.println("1. 动能机枪(30伤害) | 2. 轨道天基武器(40能量，80伤害) | 3. 纳米修复(30能量，恢复50血)");

            int choose = sc.nextInt();

            if(choose == 1){
                myMecha.mechineGun(tyrant);
            } else if (choose == 2) {
                myMecha.orbitalStrike(tyrant);
            } else if (choose == 3) {
                myMecha.repair();
            }

            if(tyrant.isAlive()){
                tyrant.attack(myMecha);
            }
        }
        if(myMecha.isAlive()){
            System.out.println("Win");
        }else {
            System.out.println("Game over");
        }
    }
}
