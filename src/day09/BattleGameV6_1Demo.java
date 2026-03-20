package day09;

import day08.MechaVersion4;
import day08.TyrantVersion4;

import java.util.Scanner;

public class BattleGameV6_1Demo {
    public static void main(String[] args) {
        MechaVersion6_1 myMecha = new MechaVersion6_1("Mecha6.1", 200, 350);
        TyrantVersion6_1 tyrant = new TyrantVersion6_1("Tyrant6.1", 500, 30);

        Scanner sc = new Scanner(System.in);

        while(myMecha.isAlive() && tyrant.isAlive()){
            playRound(myMecha, tyrant, sc);
        }

        printResult(myMecha, tyrant);
        sc.close();

    }

    public static void showStatus(MechaVersion6_1 mecha, TyrantVersion6_1 tyrant){
        System.out.println("==================== BattleGame ====================");
        System.out.println("【当前战况】");
        System.out.println(mecha.getName() + "：HP " + mecha.getHp()
                + "/" + mecha.getMaxHp() + " | Energy " + mecha.getEnergy());
        System.out.println(tyrant.getName() + "：HP " + tyrant.getHp());
        System.out.println("----------------------------------------------------");
    }

    public static void showMenu(){
        System.out.println("【技能选项】");
        System.out.println("1. 动能机枪（30伤害）");
        System.out.println("2. 轨道天基武器（消耗40能量，80伤害）");
        System.out.println("3. 纳米修复（消耗30能量，恢复50血）");
        System.out.print("请输入你的选择：");
    }

    public static int getValiChoice(Scanner sc){
        while (true){
            if(!sc.hasNextInt()){
                System.out.println("输入错误，请输入：1、2 或 3！");
                System.out.print("请重新输入：");
                sc.next();
                continue;
            }

            int choice = sc.nextInt();

            if(choice >= 1 && choice <= 3){
                return choice;
            }else {
                System.out.println("输入错误，请输入：1、2 或 3！");
                System.out.print("请重新输入：");
            }
        }
    }

    public static void handlePlayerTurn(MechaVersion6_1 mecha, TyrantVersion6_1 tyrant, int choice){
        switch (choice){
            case 1:
                mecha.machineGun(tyrant);
                break;
            case 2:
                mecha.orbitalStrike(tyrant);
                break;
            case 3:
                mecha.repair();
        }
    }

    public static void handleEnemyTurn(MechaVersion6_1 mecha, TyrantVersion6_1 tyrant){
        if(tyrant.isAlive()){
            tyrant.attack(mecha);
        }
    }

    public static void playRound(MechaVersion6_1 mecha, TyrantVersion6_1 tyrant, Scanner sc){
        showStatus(mecha, tyrant);
        showMenu();
        handlePlayerTurn(mecha, tyrant, getValiChoice(sc));
        handleEnemyTurn(mecha, tyrant);
    }


    public static void printResult(MechaVersion6_1 mecha, TyrantVersion6_1 tyrant){
        System.out.println("-------------------------------------------------------");
        if(mecha.isAlive()){
            System.out.println(mecha.getName() + " Win!");
        }else {
            System.out.println(tyrant.getName() + " Win, Game Over!");
        }
    }



}
