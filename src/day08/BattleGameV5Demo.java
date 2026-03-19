package day08;

import java.util.Scanner;

public class BattleGameV5Demo {
    public static void main(String[] args) {
        MechaVersion4 myMecha = new MechaVersion4("无敌防御机甲", 800, 600);
        TyrantVersion4 tyrant = new TyrantVersion4("TyrantGuy", 300, 1);

        Scanner sc = new Scanner(System.in);

        while (myMecha.isAlive() && tyrant.isAlive()){
            showStatus(myMecha, tyrant);
            showMenu();

            int choice = sc.nextInt();

            System.out.println("-------------------------------------------");
            System.out.println("【战斗过程】");

            handlePlayerTurn(choice, myMecha, tyrant);
            handleEnemyTurn(myMecha, tyrant);
        }

        printResult(myMecha, tyrant);
        sc.close();

    }

    public static void showStatus(MechaVersion4 mecha, TyrantVersion4 tyrant){
        System.out.println("=====================================BattleGame======================================");
        System.out.println("【当前战况】");
        System.out.println(mecha.getName() + "：HP " + mecha.getHp() + "/" + mecha.getMaxHp()
        + " | Energy " + mecha.getEnergy());
        System.out.println(tyrant.getName() + "：HP " + tyrant.getHp() + " | 攻击力 " + tyrant.getAttackPower());
        System.out.println("-------------------------------------------");
    }

    public static void showMenu(){
        System.out.println("【技能选项】");
        System.out.println("1. 动能机枪（30伤害）");
        System.out.println("2. 轨道天基武器（消耗40能量，80伤害）");
        System.out.println("3. 纳米修复（消耗30能量，恢复50血）");
        System.out.print("请输入你的选择：");
    }

    public static void handlePlayerTurn(int choice, MechaVersion4 mecha, TyrantVersion4 tyrant){
        if(choice == 1) {
            mecha.machineGun(tyrant);
        }else if (choice == 2) {
            mecha.orbitalStrike(tyrant);
        } else if (choice == 3) {
            mecha.repair();
        }else {
            System.out.println("输入无效，本回合跳过！");
        }
    }

    public static void handleEnemyTurn(MechaVersion4 mecha, TyrantVersion4 tyrant){
        if(tyrant.isAlive()){
            tyrant.attack(mecha);
        }
    }

    public static void printResult(MechaVersion4 mecha, TyrantVersion4 tyrant){
        System.out.println("-------------------End----------------------");
        if(mecha.isAlive()){
            System.out.println(mecha.getName()+" Win!");
        }else {
            System.out.println(tyrant.getName() + " Win,Game Over!");
        }
    }

}
