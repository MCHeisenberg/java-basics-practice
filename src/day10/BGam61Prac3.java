package day10;

import java.util.Scanner;

public class BGam61Prac3 {
    public static void main(String[] args) {
        Mech61Prac3 myMecha = new Mech61Prac3("mechaPrac3",300,300);
        Tyran61Prac3 tyrant = new Tyran61Prac3("tyrantPrac3",300,30);
        Scanner sc = new Scanner(System.in);
        while(myMecha.isAlive() && tyrant.isAlive()){
            playRound(myMecha, tyrant, sc);
        }
        printResult(myMecha, tyrant);
        sc.close();
    }
    public static void showStatus(Mech61Prac3 mecha, Tyran61Prac3 tyrant){
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
        System.out.println("2. 轨道天基武器（消耗30能量，80伤害）");
        System.out.println("3. 纳米修复（消耗30能量，恢复50血）");
        System.out.print("请输入你的选择：");
    }
    public static int getValidChoice(Scanner sc){
        while(true){
            if(!sc.hasNextInt()){
                System.out.print("wrong input,use 1、2 or 3 please,reinput:___");
                sc.next();
                continue;
            }
            int choice = sc.nextInt();
            if(choice >=1 && choice <= 3){
                return choice;
            }
            System.out.print("wrong input,use 1、2 or 3 please,reinput:___");
        }
    }
    public static void handlePlayerTurn(Mech61Prac3 mecha, Tyran61Prac3 tyrant, int choice){
        switch (choice){
            case 1:
                mecha.machineGun(tyrant);
                break;
            case 2:
                mecha.orbitalStrike(tyrant);
                break;
            case 3:
                mecha.repair();
                break;
        }
    }
    public static void handleEnemyTurn(Mech61Prac3 mecha, Tyran61Prac3 tyrant){
        if(tyrant.isAlive()){
            tyrant.attack(mecha);
        }
    }
    public static void playRound(Mech61Prac3 mecha, Tyran61Prac3 tyrant, Scanner sc){
        showStatus(mecha, tyrant);
        showMenu();
        handlePlayerTurn(mecha, tyrant, getValidChoice(sc));
        handleEnemyTurn(mecha, tyrant);
    }
    public static void printResult(Mech61Prac3 mecha, Tyran61Prac3 tyrant){
        System.out.println("-------------------------------------------------------");
        if(mecha.isAlive()){
            System.out.println(mecha.getName() + " Win!");
        }else {
            System.out.println(tyrant.getName() + " Win, Game Over!");
        }
    }
}
