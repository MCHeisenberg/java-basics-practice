package day08;

import java.util.Scanner;

public class BattleGameV4Demo {
    public static void main(String[] args) {
        MechaVersion4 myMecha = new MechaVersion4("额滴个龟龟", 300, 300);
        TyrantVersion4 tyrant = new TyrantVersion4("MonsterTyrant", 500, 30);

        Scanner sc = new Scanner(System.in);

        while(myMecha.isAlive() && tyrant.isAlive()){
            System.out.println("====================BattleGame==================");
            System.out.println("【当前战况】");
            System.out.println(myMecha.getName() + "：HP " + myMecha.getHp() +
                    "/" + myMecha.getMaxHp() + " | Energy " + myMecha.getEnergy());
            System.out.println(tyrant.getName() + "：HP " + tyrant.getHp());
            System.out.println("------------------------------------------------");
            System.out.println("【技能选项：】");
            System.out.println("1. 动能机枪（30伤害）");
            System.out.println("2. 轨道天基武器（消耗40能量，80伤害）");
            System.out.println("3. 纳米修复（消耗30能量，恢复50血）");
            System.out.print("请输入你的选择：");

            int choice = sc.nextInt();

            if(choice == 1){
                myMecha.machineGun(tyrant);
            } else if (choice == 2) {
                myMecha.orbitalStrike(tyrant);
            } else if (choice == 3) {
                myMecha.repair();
            }else {
                System.out.println("输入无效，本回合跳过！");
            }

            if(tyrant.isAlive()){
                tyrant.attack(myMecha);
            }
        }

        System.out.println("--------------------------------------------");
        if(myMecha.isAlive()){
            System.out.println(myMecha.getName() + "Win");
        }else {
            System.out.println(tyrant.getName() + "Win,Game Over!");
        }

        sc.close();
    }
}
