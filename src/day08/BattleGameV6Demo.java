package day08;

import java.util.Scanner;

public class BattleGameV6Demo {
    public static void main(String[] args) {
        MechaVersion4 myMecha = new MechaVersion4("IndestructibleMecha", 300, 300);
        TyrantVersion4 tyrant = new TyrantVersion4("DamnTyrant", 500, 20);

        Scanner sc = new Scanner(System.in);

        while(myMecha.isAlive() && tyrant.isAlive()){
            showStatus(myMecha, tyrant);
            showMenu();

            int choice = getValidChoice(sc);

            handlePlayerTurn(myMecha, tyrant, choice);
            handleEnemyTurn(myMecha, tyrant);
        }

        showResult(myMecha,tyrant);
        sc.close();

    }

    public static void showStatus(MechaVersion4 mecha, TyrantVersion4 tyrant){
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

    public static int getValidChoice(Scanner sc){
        while (true){
            if(!sc.hasNextInt()){
                System.out.println("输入无效，请输入 1、2 或 3！");
                sc.next();
                System.out.println("请重新输入：");
                continue;
            }

            int choice = sc.nextInt();

            if(choice >= 1 && choice <= 3){
                return choice;
            }

            System.out.println("输入无效，请输入 1、2 或 3！");
            System.out.println("请重新输入：");
        }
    }


    public static void handlePlayerTurn(MechaVersion4 mecha, TyrantVersion4 tyrant, int choice){
        if(choice == 1){
            mecha.machineGun(tyrant);
        } else if (choice == 2) {
            mecha.orbitalStrike(tyrant);
        } else {
            mecha.repair();
        }
    }

    public static void handleEnemyTurn(MechaVersion4 mecha, TyrantVersion4 tyrant){
        if(tyrant.isAlive()){
            tyrant.attack(mecha);
        }
    }

    public static void showResult(MechaVersion4 mecha, TyrantVersion4 tyrant){
        System.out.println("-------------------------------------------------------");
        if(mecha.isAlive()){
            System.out.println(mecha.getName() + " Win!");
        }else {
            System.out.println(tyrant.getName() + " Win,Game Over!");
        }
    }

}
